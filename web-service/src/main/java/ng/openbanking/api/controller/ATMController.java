package ng.openbanking.api.controller;


import io.swagger.annotations.*;
import ng.openbanking.api.payload.GenericServiceResponse;
import ng.openbanking.api.payload.GenericServiceResponseBuilder;
import ng.openbanking.api.payload.atm.ATM;
import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.BankInfoService;
import ng.openbanking.api.payload.definition.OperationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/atms")
@Api(value = "/atms", description = "ATM related operations", produces = "application/json", consumes = "application/json", tags = {"atm"})
public class ATMController extends BaseApiController {
	
	@Autowired
	private BankInfoService bankInfoService;

    @ApiOperation(value = "Finds an ATM by Terminal ID",
            notes = "The ....",
            response = ATM.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Terminal ID supplied"),
            @ApiResponse(code = 404, message = "ATM not found")})
    @RequestMapping(value = "/{terminalId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAtm(@PathVariable @ApiParam(value = "The Atm unique identifier") String terminalId) throws BankResourceNotFoundException, ServiceOperationNotSupported {
    	ATM atm=bankInfoService.getAtmById(terminalId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(atm)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @ApiOperation(value = "Get all ATMs in a Bank", notes = "")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Terminal ID supplied"),
            @ApiResponse(code = 404, message = "ATM not found")})
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<GenericServiceResponse> getAtms() throws ServiceOperationNotSupported{
    	List<ATM> atms=bankInfoService.getAtms();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(atms))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/branch/{branchCode}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAtmsByBranch(@PathVariable @ApiParam(value = "The Bank's Branch code") String branchCode) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	ATM atm=bankInfoService.getAtmByBranchCode(branchCode);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(atm))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/latitude/{latitude}/longitude/{longitude}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAtmsAtLocation(@PathVariable @ApiParam(value = "The location's latitude") double latitude,
                                                                    @PathVariable @ApiParam(value = "The location's longitude") double longitude) throws ServiceOperationNotSupported{
    	List<ATM> atms=bankInfoService.getAtmByLongAndLat(longitude,latitude);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(atms))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }
}
