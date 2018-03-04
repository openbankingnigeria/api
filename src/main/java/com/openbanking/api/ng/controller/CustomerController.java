package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.customer.Customer;
import com.openbanking.api.ng.payload.customer.CustomerUpdateRequest;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/customer")
@Api(value = "/customer", description = "Customer related operations", consumes = "application/json", tags = {"customer"})
public class CustomerController implements Serializable {

    @ApiOperation(value = "Finds a Customer by Customer ID",
            notes = "The Customer ID is the unique identifier for a customer as defined by a Bank",
            response = Customer.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Customer ID supplied"),
            @ApiResponse(code = 404, message = "Customer not found")})
    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public Customer getByCustomerId(@PathVariable @ApiParam(value = "The Customer's unique identifier", name = "customerId") String customerId) {
        return new Customer();
    }

    @RequestMapping(value = "/phone/{phoneNumber}", method = RequestMethod.GET)
    public List<Customer> getByPhoneNumber(@PathVariable @ApiParam(value = "The Customer's Phone Number ex: +234") String phoneNumber) {
        return Collections.singletonList(new Customer());
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public List<Customer> getByEmail(@PathVariable @ApiParam(value = "The Customer's Email Address") String email) {
        return Collections.singletonList(new Customer());
    }

    @RequestMapping(value = "/bvn/{bvn}", method = RequestMethod.GET)
    public List<Customer> getByBVN(@PathVariable @ApiParam(value = "The Customer's Bank Verification Number") String bvn) {
        return Collections.singletonList(new Customer());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public OperationStatus updateCustomerInformation(@PathVariable @RequestBody CustomerUpdateRequest customerUpdateRequest) {
        return OperationStatus.SUCCESSFUL;
    }

    @RequestMapping(value = "/block/{customerId}", method = RequestMethod.POST)
    public OperationStatus block(@PathVariable @ApiParam(value = "The Customer's unique identifier", name = "customerId") String customerId) {
        return OperationStatus.SUCCESSFUL;
    }


}
