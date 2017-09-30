package com.openbanking.api.ng.controller;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.account.*;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/account")
@Api(value = "/account", description = "Account related operations", consumes = "application/json", tags = {"account"})

public class AccountController {
    @ApiOperation(value = "Finds an Account by Account Number",
            notes = "Gives general Information about an Account Number",
            response = Account.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Account Number supplied"),
            @ApiResponse(code = 404, message = "Account Not Found")})
    @RequestMapping(value = "/getAccount", method = RequestMethod.GET)
    public List<Account> getAgenciesAtLocation(@ApiParam(value = "The Account Number") String accountNumber){
        return Collections.singletonList(new Account());

    }
    @RequestMapping(value = "/getAccountBalance", method = RequestMethod.GET)
    public List<AccountBalance> getAccountBalance(@ApiParam(value = "The Account Number and date") String accountNumber, String date){
        return Collections.singletonList(new AccountBalance());

    }
    @RequestMapping(value = "/getAccountByCustomerId", method = RequestMethod.GET)
    public List<Account> getAccountByCustomerId(@ApiParam(value = "The Customer ID as defined by Bank") String customerId){
        return Collections.singletonList(new Account());

    }
    @RequestMapping(value = "/getAccountByCustomerBvn", method = RequestMethod.GET)
    public List<Account> getAccountByCustomerBvn(@ApiParam(value = "The Customer's BVN") String bvn){
        return Collections.singletonList(new Account());

    }
    @RequestMapping(value = "/getAccountByPhone", method = RequestMethod.GET)
    public List<Account> getAccountByPhone(@ApiParam(value = "The Customer's Phone Number Ex: +234 ...") String phone){
        return Collections.singletonList(new Account());

    }
    @RequestMapping(value = "/getAccountByEmail", method = RequestMethod.GET)
    public List<Account> getAccountByEmail(@ApiParam(value = "The Customer's Email Address") String email){
        return Collections.singletonList(new Account());

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
    public List<GetAccountType> getAccountType(){
        return Collections.singletonList(new GetAccountType());

    }
    @RequestMapping(value = "/openAccount", method = RequestMethod.GET)
    public List<OpenAccountResult> openAccount(@RequestBody OpenAccount openAccount){
        return Collections.singletonList(new OpenAccountResult());

    }
}
