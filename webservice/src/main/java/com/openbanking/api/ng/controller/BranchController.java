package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.branch.Branch;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/branch")
@Api(value = "/branch", description = "Branch related operations", consumes = "application/json", tags = {"branch"})
public class BranchController {

    @ApiOperation(value = "Finds a Bank Branch by Branch Code",
            notes = "The Branch Code is the unique identifier for a bank  as defined by a Bank",
            response = Branch.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Branch Code supplied"),
            @ApiResponse(code = 404, message = "Branch not found")})
    @RequestMapping(value = "/{branchId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBranch(@PathVariable @ApiParam(value = "The Branch's unique identifier") String branchId) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(new Branch())
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @ApiOperation(value = "Get all Branches of a Bank",
            response = Branch.class, responseContainer = "List")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Branch Code supplied"),
            @ApiResponse(code = 404, message = "Branch not found")})
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBranches() {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new Branch()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/latitude/{latitude}/longitude/{longitude}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBranchesAtLocation(@PathVariable @ApiParam(value = "The location's latitude") double latitude,
                                                                        @PathVariable @ApiParam(value = "The location's longitude") double longitude) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new Branch()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }


}
