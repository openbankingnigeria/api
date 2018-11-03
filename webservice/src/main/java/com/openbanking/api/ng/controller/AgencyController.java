package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.agency.Agency;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
@RestController
@RequestMapping("/agencies")
@Api(value = "/agencies", description = "Agency related operations", consumes = "application/json", tags = {"agency"})
public class AgencyController extends BaseApiController{
    @ApiOperation(value = "Finds an Agency by Agency Code",
            notes = "The Agency Code is the unique identifier for an Agency  as defined by a Bank or Agency Network",
            response = Agency.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Agency Code supplied"),
            @ApiResponse(code = 404, message = "Agency not found")})

    @RequestMapping(value = "/{agencyId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAgency(@PathVariable @ApiParam(value = "The Agency's unique identifier") String agencyId) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(new Agency())
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAgencies(){
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new Agency()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/latitude/{latitude}/longitude/{longitude}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAgenciesAtLocation(@PathVariable @ApiParam(value = "The location's latitude") double latitude,
                                              @PathVariable @ApiParam(value = "The location's longitude") double longitude) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new Agency()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }
}

