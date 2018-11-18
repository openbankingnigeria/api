package ng.openbanking.api.controller;


import io.swagger.annotations.*;
import ng.openbanking.api.payload.GenericServiceResponse;
import ng.openbanking.api.payload.GenericServiceResponseBuilder;
import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.BankInfoService;
import ng.openbanking.api.payload.branch.Branch;
import ng.openbanking.api.payload.definition.OperationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/branch")
@Api(value = "/branch", description = "Branch related operations", consumes = "application/json", tags = {"branch"})
public class BranchController extends BaseApiController{
	
	@Autowired
	private BankInfoService bankInfoService;

    @ApiOperation(value = "Finds a Bank Branch by Branch Code",
            notes = "The Branch Code is the unique identifier for a bank  as defined by a Bank",
            response = Branch.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Branch Code supplied"),
            @ApiResponse(code = 404, message = "Branch not found")})
    @RequestMapping(value = "/{branchId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBranch(@PathVariable @ApiParam(value = "The Branch's unique identifier") String branchId) throws BankResourceNotFoundException, ServiceOperationNotSupported {
    	Branch branch=bankInfoService.getBanchByBranchId(branchId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(branch)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @ApiOperation(value = "Get all Branches of a Bank",
            response = Branch.class, responseContainer = "List")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Branch Code supplied"),
            @ApiResponse(code = 404, message = "Branch not found")})
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBranches() throws ServiceOperationNotSupported{
    	List<Branch> branches=bankInfoService.getBranches();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(branches)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/latitude/{latitude}/longitude/{longitude}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBranchesAtLocation(@PathVariable @ApiParam(value = "The location's latitude") double latitude,
                                                                        @PathVariable @ApiParam(value = "The location's longitude") double longitude)throws BankResourceNotFoundException,ServiceOperationNotSupported {
    	List<Branch> branches=bankInfoService.getBranchesByLongAndLat(longitude,latitude);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(branches)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }


}
