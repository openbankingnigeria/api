package ng.openbanking.api.controller;


import io.swagger.annotations.*;
import ng.openbanking.api.payload.GenericServiceResponse;
import ng.openbanking.api.payload.GenericServiceResponseBuilder;
import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.CustomerInfoService;
import ng.openbanking.api.payload.customer.Customer;
import ng.openbanking.api.payload.customer.CustomerUpdateRequest;
import ng.openbanking.api.payload.customer.PocessingOperationResponse;
import ng.openbanking.api.payload.definition.OperationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@Api(value = "/customer", description = "Customer related operations", consumes = "application/json", tags = {"customer"})
public class CustomerController extends BaseApiController {

	@Autowired
	private CustomerInfoService customerInfoService;
	
    @ApiOperation(value = "Finds a Customer by Customer ID",
            notes = "The Customer ID is the unique identifier for a customer as defined by a Bank",
            response = Customer.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Customer ID supplied"),
            @ApiResponse(code = 404, message = "Customer not found")})
    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getByCustomerId(@PathVariable @ApiParam(value = "The Customer's unique identifier", name = "customerId") String customerId) throws BankResourceNotFoundException, ServiceOperationNotSupported {
    	Customer data=customerInfoService.getByCustomerId(customerId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/phone/{phoneNumber}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getByPhoneNumber(@PathVariable @ApiParam(value = "The Customer's Phone Number ex: +234") String phoneNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	Customer data=customerInfoService.getByPhoneNumber(phoneNumber);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getByEmail(@PathVariable @ApiParam(value = "The Customer's Email Address") String email) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	Customer data=customerInfoService.getByEmail(email);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/bvn/{bvn}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getByBVN(@PathVariable @ApiParam(value = "The Customer's Bank Verification Number") String bvn) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	Customer data=customerInfoService.getByBVN(bvn);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> updateCustomerInformation(@PathVariable @RequestBody CustomerUpdateRequest customerUpdateRequest) throws BankResourceNotFoundException,ServiceOperationNotSupported{
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage("Information updated successfully")
                .build());
    }

    @RequestMapping(value = "/block/{customerId}", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> block(@PathVariable @ApiParam(value = "The Customer's unique identifier", name = "customerId") String customerId) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	PocessingOperationResponse data=customerInfoService.block(customerId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

}
