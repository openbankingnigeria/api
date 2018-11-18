package ng.openbanking.api.controller;


import io.swagger.annotations.*;
import ng.openbanking.api.payload.GenericServiceResponse;
import ng.openbanking.api.payload.GenericServiceResponseBuilder;
import ng.openbanking.api.payload.account.*;
import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.BankAccountService;
import ng.openbanking.api.payload.definition.OperationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/account")
@Api(value = "Account", description = "Account related operations", consumes = "application/json", produces = "application/json", tags = {"account"})
public class AccountController extends BaseApiController{
	
	@Autowired
	private BankAccountService bankAccountService;

    @ApiOperation(value = "Finds an Account by Account Number",
            notes = "Gives general Information about an Account Number",
            response = Account.class, nickname = "Get a single Account")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Account Number supplied"),
            @ApiResponse(code = 404, message = "Account Not Found"), @ApiResponse(code = 200, response = Account.class, message = "Account Information")})
    @RequestMapping(value = "/{accountNumber}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<GenericServiceResponse> getAccount(@PathVariable @ApiParam(value = "The Account Number", required = true) String accountNumber)  throws BankResourceNotFoundException, ServiceOperationNotSupported {
    	Account account=bankAccountService.getAccountByAccountNumber(accountNumber);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse().withData(account)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @ApiOperation(value = "Get the balance on the account as at the specified date",
            notes = "Get the balance on the account as at the specified date",
            response = AccountBalance.class, nickname = "Get account balance")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Account Number supplied"),
            @ApiResponse(code = 404, message = "Account Not Found"), @ApiResponse(code = 200, response = AccountBalance.class, message = "Account Balance Information")})
    @RequestMapping(value = "/balance/{accountNumber}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<GenericServiceResponse> getAccountBalance(@PathVariable @ApiParam(value = "The Account Number", required = true) String accountNumber, @RequestParam @ApiParam(value = "Date in format (yyyy-mm-dd)") String date) {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse().withData(new AccountBalance())
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @ApiOperation(value = "Get Accounts by Customer ID",
            notes = "This endpoint allows you to get all the accounts associated with a Customer ID. It takes a Customer ID as an input and returns a list of all the accounts matching that Customer ID",
            response = Account.class, responseContainer = "List", nickname = "Get Accounts By Customer ID")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "No account found with matching the Customer ID provided"),
            @ApiResponse(code = 200, response = Account.class, responseContainer = "List", message = "List of Accounts")})
    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<GenericServiceResponse> getAccountByCustomerId(@PathVariable @ApiParam(value = "The Customer ID as defined by Bank", required = true) String customerId)  throws BankResourceNotFoundException,ServiceOperationNotSupported{
        	Account account=bankAccountService.getAccountByCustomerId(customerId);
        	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse().withData(account)
                    .withStatus(OperationStatus.SUCCESSFUL)
                    .withMessage(OperationStatus.SUCCESSFUL.name())
                    .build());
    }

    @ApiOperation(value = "Get Accounts by BVN",
            notes = "This endpoint allows you to get all the accounts associated with a BVN. It takes a BVN as an input and returns a list of all the accounts matching that BVN",
            response = Account.class, responseContainer = "List", nickname = "Get Accounts By BVN"/*, authorizations = @Authorization(value = "oAuth2", scopes = @AuthorizationScope(scope = AccessScope.READ_ACCOUNT_VALUE, description = ""))*/)
    @ApiResponses(value = {@ApiResponse(code = 404, message = "No account found with matching the BVN provided"),
            @ApiResponse(code = 200, response = Account.class, responseContainer = "List", message = "List of Accounts")})
    @RequestMapping(value = "/bvn/{bvn}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAccountByCustomerBvn(@PathVariable @ApiParam(value = "The Customer's BVN", required = true) String bvn)  throws BankResourceNotFoundException,ServiceOperationNotSupported{
        	Account account=bankAccountService.getAccountByBvn(bvn);
        	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse().withData(account)
                    .withStatus(OperationStatus.SUCCESSFUL)
                    .withMessage(OperationStatus.SUCCESSFUL.name())
                    .build());
    }

    @RequestMapping(value = "/phone/{phoneNumber}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAccountsByPhone(@PathVariable @ApiParam(value = "The Customer's Phone Number Ex: +234 ...") String phoneNumber)  throws BankResourceNotFoundException,ServiceOperationNotSupported{
        	Account account=bankAccountService.getAccountByPhoneNumber(phoneNumber);
        	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse().withData(account)
                    .withStatus(OperationStatus.SUCCESSFUL)
                    .withMessage(OperationStatus.SUCCESSFUL.name())
                    .build());
    }

    @RequestMapping(value = "/email/{emailAddress}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAccountsByEmail(@PathVariable @ApiParam(value = "The Customer's Email Address") String emailAddress)  throws BankResourceNotFoundException,ServiceOperationNotSupported{
        	Account account=bankAccountService.getAccountByEmail(emailAddress);
        	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse().withData(account)
                    .withStatus(OperationStatus.SUCCESSFUL)
                    .withMessage(OperationStatus.SUCCESSFUL.name())
                    .build());
    }

    @RequestMapping(value = "/{accountNumber}", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> updateAccount(@PathVariable @ApiParam(value = "The Customer's Phone Number Ex: +234 ...") String accountNumber)  throws BankResourceNotFoundException,ServiceOperationNotSupported{
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage("Account updated successfully")
                .build());
    }

    @RequestMapping(value = "/block", method = RequestMethod.POST)
    public ResponseEntity<GenericServiceResponse> blockAccount(@RequestBody AccountBlock accountBlock) throws BankResourceNotFoundException,ServiceOperationNotSupported{
        	bankAccountService.blockAccount(accountBlock);
        	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                    .withStatus(OperationStatus.SUCCESSFUL)
                    .withMessage(OperationStatus.SUCCESSFUL.name())
                    .build());

    }

    @RequestMapping(value = "/types", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAccountType() throws ServiceOperationNotSupported{
    	List<AccountType> accountTypes=bankAccountService.getAccountTypes();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse().withData(accountTypes)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());

    }

    @RequestMapping(value = "/open", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<GenericServiceResponse> openAccount(@RequestBody AccountCreationRequest accountCreationRequest) throws ServiceOperationNotSupported{
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse().withData(new AccountCreationResponse())
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage("Account opened successfully")
                .build());
    }
}
