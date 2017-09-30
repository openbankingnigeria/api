package com.openbanking.api.ng.controller;
import com.openbanking.api.ng.payload.limit.Limit;
import com.openbanking.api.ng.payload.limit.LimitCustomer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/limit")
@Api(value = "/limit", description = "Limit related operations", consumes = "application/json", tags = {"limit"})
public class LimitController {
    @RequestMapping(value = "/getGlobalTransactionLimit", method = RequestMethod.GET)
    public List<Limit> getGlobalTransactionLimit() {
        return Collections.singletonList(new Limit());
    }

    @RequestMapping(value = "/getCustomerTransactionLimit", method = RequestMethod.GET)
    public List<LimitCustomer> getCustomerTransactionLimit(@ApiParam(value = "The Customer's Account Number") String accountNumber) {
        return Collections.singletonList(new LimitCustomer());
    }

}
