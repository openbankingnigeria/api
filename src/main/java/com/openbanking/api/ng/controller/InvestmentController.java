package com.openbanking.api.ng.controller;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.investment.Investment;
import com.openbanking.api.ng.payload.investment.InvestmentProduct;
import com.openbanking.api.ng.payload.investment.InvestmentBook;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/investment")
@Api(value = "/investment", description = "investment related operations", consumes = "application/json", tags = {"investment"})

public class InvestmentController {
    @RequestMapping(value = "/getInvestmentProduct", method = RequestMethod.GET)
    public List<InvestmentProduct> getInvestmentProduct() {
        return Collections.singletonList(new InvestmentProduct());
    }
    @RequestMapping(value = "/getInvestment", method = RequestMethod.GET)
    public List<Investment> getInvestment(@ApiParam(value = "The Customer's Unique Identifier or Account Number") String accountNumberOrCustomerId) {
        return Collections.singletonList(new Investment());
    }
    @RequestMapping(value = "/bookInvestment", method = RequestMethod.GET)
    public OperationStatus bookInvestment(@RequestBody InvestmentBook investmentBookParameter) {
       return OperationStatus.SUCCESSFUL;

    }

}

