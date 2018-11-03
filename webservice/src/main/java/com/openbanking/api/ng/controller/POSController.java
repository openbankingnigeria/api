package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.pos.POS;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/pos")
@Api(value = "/pos", description = "pos", consumes = "application/json", tags = {"pos"})

public class POSController extends BaseApiController{
    @ApiOperation(value = "Finds a POS by Terminal ID",
            notes = "The Terminal ID is the unique identifier for a POS",
            response = POS.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Terminal ID supplied"),
            @ApiResponse(code = 404, message = "POS not found")})
    @RequestMapping(value = "/{terminalId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getPosByTerminalId(@PathVariable @ApiParam(value = "The Terminal ID") String terminalId) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new POS()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/merchant/{merchantId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getPosByMerchantId(@PathVariable @ApiParam(value = "Merchant ID") String merchantId) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new POS()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/branch/{branchId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getPosByBranchId(@PathVariable @ApiParam(value = "Branch ID") String branchId) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new POS()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getPosByEmail(@PathVariable @ApiParam(value = "Email Address") String email) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new POS()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/latitude/{latitude}/longitude/{longitude}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getPosNearLocation(@PathVariable @ApiParam(value = "The location's latitude") double latitude,
                                                                     @PathVariable @ApiParam(value = "The location's longitude") double longitude) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new POS()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }
}
