package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.customer.Customer;
import com.openbanking.api.ng.payload.customer.CustomerUpdateRequest;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/customer")
@Api(value = "/customer", description = "Customer related operations", consumes = "application/json", tags = {"customer"})
public class CustomerAPI implements Serializable {

    @ApiOperation(value = "Finds a Customer by Customer ID",
            notes = "The Customer ID is the unique identifier for a customer as defined by a Bank",
            response = Customer.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Customer ID supplied"),
            @ApiResponse(code = 404, message = "Customer not found")})
    @RequestMapping(value = "/getByCustomerId", method = RequestMethod.GET)
    public Customer getByCustomerId(@ApiParam(value = "The Customer's unique identifier",name = "customerId") String customerId) {
        return new Customer();
    }

    @RequestMapping(value = "/getByPhoneNumber", method = RequestMethod.GET)
    public List<Customer> getByPhoneNumber(@ApiParam(value = "The Customer's Phone Number ex: +234") String phoneNumber) {
        return Collections.singletonList(new Customer());
    }

    @RequestMapping(value = "/getByEmail", method = RequestMethod.GET)
    public List<Customer> getByEmail(@ApiParam(value = "The Customer's Email Address") String email) {
        return Collections.singletonList(new Customer());
    }

    @RequestMapping(value = "/getByBVN", method = RequestMethod.GET)
    public List<Customer> getByBVN(@ApiParam(value = "The Customer's Bank Verification Number") String bvn) {
        return Collections.singletonList(new Customer());
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public OperationStatus updateCustomerInformation(@RequestBody CustomerUpdateRequest customerUpdateRequest) {
        return OperationStatus.SUCCESSFUL;
    }

    @RequestMapping(value = "/block", method = RequestMethod.POST)
    public OperationStatus block(String customerId) {
        return OperationStatus.SUCCESSFUL;
    }


}
