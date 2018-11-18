package ng.openbanking.api.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import ng.openbanking.api.payload.GenericServiceResponse;
import ng.openbanking.api.payload.GenericServiceResponseBuilder;
import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.BankAccountService;
import ng.openbanking.api.payload.definition.OperationStatus;
import ng.openbanking.api.payload.limit.Limit;
import ng.openbanking.api.payload.limit.LimitCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/limit")
@Api(value = "/limit", description = "Limit related operations", consumes = "application/json", tags = {"limit"})
public class LimitController extends BaseApiController{

	@Autowired
    BankAccountService bankAccountService;
	
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getGlobalTransactionLimit() throws ServiceOperationNotSupported {
    	Limit limit=bankAccountService.getGlobalTransactionLimit();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(limit))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/customer/{accountNumber}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getCustomerTransactionLimit(@PathVariable @ApiParam(value = "The Customer's Account Number") String accountNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported  {
    	LimitCustomer limit=bankAccountService.getCustomerTransactionLimit(accountNumber);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(limit))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

}
