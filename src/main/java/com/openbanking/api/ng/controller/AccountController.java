package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.config.AccessScope;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.account.*;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/account")
@Api(value = "Account", description = "Account related operations", consumes = "application/json", produces = "application/json", tags = {"account"},  authorizations = @Authorization(value = "oAuth2", scopes = @AuthorizationScope(scope = AccessScope.READ_ACCOUNT_VALUE, description = "")))
public class AccountController {


    @ApiOperation(value = "Finds an Account by Account Number",
            notes = "Gives general Information about an Account Number",
            response = Account.class, nickname = "Get a single Account", authorizations = @Authorization(value = "oAuth2", scopes = @AuthorizationScope(scope = "read", description = "")))
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Account Number supplied"),
            @ApiResponse(code = 404, message = "Account Not Found"), @ApiResponse(code = 200, response = Account.class, message = "Account Information")})
    @RequestMapping(value = "/getAccount", method = RequestMethod.GET, produces = "application/json")
    public Account getAccount(@RequestParam @ApiParam(value = "The Account Number", required = true) String accountNumber) {
        return new Account();

    }

    @ApiOperation(value = "Get the balance on the account as at the specified date",
            notes = "Get the balance on the account as at the specified date",
            response = AccountBalance.class, nickname = "Get account balance", authorizations = @Authorization(value = "oAuth2", scopes = @AuthorizationScope(scope = "read", description = "")))
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Account Number supplied"),
            @ApiResponse(code = 404, message = "Account Not Found"), @ApiResponse(code = 200, response = AccountBalance.class, message = "Account Balance Information")})
    @RequestMapping(value = "/getAccountBalance", method = RequestMethod.GET, produces = "application/json")
    public AccountBalance getAccountBalance(@RequestParam @ApiParam(value = "The Account Number", required = true) String accountNumber, @RequestParam @ApiParam(value = "Date in format (yyyy-mm-dd)", required = true) String date) {
        return new AccountBalance();

    }

    @ApiOperation(value = "Get Accounts by Customer ID",
            notes = "This endpoint allows you to get all the accounts associated with a Customer ID. It takes a Customer ID as an input and returns a list of all the accounts matching that Customer ID",
            response = Account.class, responseContainer = "List", nickname = "Get Accounts By Customer ID", authorizations = @Authorization(value = "oAuth2", scopes = @AuthorizationScope(scope = "read", description = "")))
    @ApiResponses(value = {@ApiResponse(code = 404, message = "No account found with matching the Customer ID provided"),
            @ApiResponse(code = 200, response = Account.class, responseContainer = "List", message = "List of Accounts")})
    @RequestMapping(value = "/getAccountByCustomerId", method = RequestMethod.GET, produces = "application/json")
    public List<Account> getAccountByCustomerId(@RequestParam @ApiParam(value = "The Customer ID as defined by Bank", required = true) String customerId) {
        return Collections.nCopies(3, new Account());
    }

    @ApiOperation(value = "Get Accounts by BVN",
            notes = "This endpoint allows you to get all the accounts associated with a BVN. It takes a BVN as an input and returns a list of all the accounts matching that BVN",
            response = Account.class, responseContainer = "List", nickname = "Get Accounts By BVN", authorizations = @Authorization(value = "oAuth2", scopes = @AuthorizationScope(scope = AccessScope.READ_ACCOUNT_VALUE, description = "")))
    @ApiResponses(value = {@ApiResponse(code = 404, message = "No account found with matching the BVN provided"),
            @ApiResponse(code = 200, response = Account.class, responseContainer = "List", message = "List of Accounts")})
    @RequestMapping(value = "/getAccountByCustomerBvn", method = RequestMethod.GET)
    public List<Account> getAccountByCustomerBvn(@RequestParam @ApiParam(value = "The Customer's BVN", required = true) String bvn) {
        return Collections.nCopies(3, new Account());
    }

    @RequestMapping(value = "/getAccountByPhone", method = RequestMethod.GET)
    public List<Account> getAccountByPhone(@ApiParam(value = "The Customer's Phone Number Ex: +234 ...") String phone){
        return Collections.nCopies(3, new Account());

    }
    @RequestMapping(value = "/getAccountByEmail", method = RequestMethod.GET)
    public List<Account> getAccountByEmail(@ApiParam(value = "The Customer's Email Address") String email){
        return Collections.nCopies(3, new Account());

    }
    @RequestMapping(value = "/updateAccount", method = RequestMethod.POST)
    public OperationStatus updateAccount(@ApiParam(value = "The Customer's Phone Number Ex: +234 ...") String accountNumber){
        return OperationStatus.SUCCESSFUL;
    }

    @RequestMapping(value = "/blockAccount", method = RequestMethod.POST)
    public OperationStatus blockAccount(@RequestBody AccountBlock accountBlock) {
        return OperationStatus.SUCCESSFUL;
    }

    @RequestMapping(value = "/getAccountType", method = RequestMethod.GET)
    public List<AccountType> getAccountType() {
        return Collections.nCopies(3, new AccountType());

    }

    @RequestMapping(value = "/openAccount", method = RequestMethod.POST, produces = "application/json")
    public AccountCreationResponse openAccount(@RequestBody AccountCreationRequest accountCreationRequest) {
        return new AccountCreationResponse();

    }
}
