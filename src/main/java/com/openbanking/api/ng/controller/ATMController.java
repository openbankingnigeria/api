package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.atm.ATM;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping(value = "/atms")
@Api(value = "/atms", description = "ATM related operations", produces = "application/json", consumes = "application/json", tags = {"atm"})
public class ATMController {

    @ApiOperation(value = "Finds an ATM by Terminal ID",
            notes = "The ....",
            response = ATM.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Terminal ID supplied"),
            @ApiResponse(code = 404, message = "ATM not found")})
    @RequestMapping(value = "/{terminalId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAtm(@PathVariable @ApiParam(value = "The Atm unique identifier") String terminalId) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(new ATM())
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @ApiOperation(value = "Get all ATMs in a Bank", notes = "")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Terminal ID supplied"),
            @ApiResponse(code = 404, message = "ATM not found")})
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<GenericServiceResponse> getAtms() {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new ATM()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/branch/{branchCode}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAtmsByBranch(@PathVariable @ApiParam(value = "The Bank's Branch code") String branchCode) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new ATM()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/latitude/{latitude}/longitude/{longitude}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAtmsAtLocation(@PathVariable @ApiParam(value = "The location's latitude") double latitude,
                                                                    @PathVariable @ApiParam(value = "The location's longitude") double longitude) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new ATM()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }
}
