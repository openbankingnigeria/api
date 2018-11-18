package ng.openbanking.api.controller;


import io.swagger.annotations.*;
import ng.openbanking.api.payload.GenericServiceResponse;
import ng.openbanking.api.payload.GenericServiceResponseBuilder;
import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.BankInfoService;
import ng.openbanking.api.payload.definition.OperationStatus;
import ng.openbanking.api.payload.pos.POS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/pos")
@Api(value = "/pos", description = "pos", consumes = "application/json", tags = {"pos"})

public class POSController extends BaseApiController{
	
	@Autowired
	private BankInfoService bankInfoService;
	
    @ApiOperation(value = "Finds a POS by Terminal ID",
            notes = "The Terminal ID is the unique identifier for a POS",
            response = POS.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Terminal ID supplied"),
            @ApiResponse(code = 404, message = "POS not found")})
    @RequestMapping(value = "/{terminalId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getPosByTerminalId(@PathVariable @ApiParam(value = "The Terminal ID") String terminalId) throws BankResourceNotFoundException, ServiceOperationNotSupported {
    	List<POS> posList=bankInfoService.getPosByTerminalId(terminalId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(posList)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/merchant/{merchantId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getPosByMerchantId(@PathVariable @ApiParam(value = "Merchant ID") String merchantId) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	List<POS> posList=bankInfoService.getPosByMerchantId(merchantId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(posList))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/branch/{branchId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getPosByBranchId(@PathVariable @ApiParam(value = "Branch ID") String branchId) throws BankResourceNotFoundException,ServiceOperationNotSupported {
    	List<POS> posList=bankInfoService.getPosByBranchId(branchId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(posList)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getPosByEmail(@PathVariable @ApiParam(value = "Email Address") String email) throws BankResourceNotFoundException,ServiceOperationNotSupported {
    	List<POS> posList=bankInfoService.getPosByEmail(email);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(posList)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/latitude/{latitude}/longitude/{longitude}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getPosNearLocation(@PathVariable @ApiParam(value = "The location's latitude") double latitude,
                                                                     @PathVariable @ApiParam(value = "The location's longitude") double longitude) throws BankResourceNotFoundException,ServiceOperationNotSupported {
    	List<POS> posList=bankInfoService.getPosNearLocation(longitude,latitude);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(posList)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }
}
