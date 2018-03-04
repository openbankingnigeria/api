package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.investment.Investment;
import com.openbanking.api.ng.payload.investment.InvestmentBook;
import com.openbanking.api.ng.payload.investment.InvestmentProduct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/investment")
@Api(value = "/investment", description = "investment related operations", consumes = "application/json", tags = {"investment"})

public class InvestmentController {
    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public List<InvestmentProduct> getInvestmentProduct() {
        return Collections.singletonList(new InvestmentProduct());
    }

    @RequestMapping(value = "/{accountId}", method = RequestMethod.GET)
    public List<Investment> getInvestment(@PathVariable @ApiParam(value = "The Customer's Unique Identifier or Account Number") String accountId) {
        return Collections.singletonList(new Investment());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public OperationStatus bookInvestment(@RequestBody InvestmentBook investmentBook) {
        return OperationStatus.SUCCESSFUL;

    }

}

