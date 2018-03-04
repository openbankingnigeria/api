package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.payload.billpayment.BillPaymentItem;
import com.openbanking.api.ng.payload.billpayment.Biller;
import com.openbanking.api.ng.payload.billpayment.BillerCategory;
import com.openbanking.api.ng.payload.billpayment.BillingSystem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/billpayment")
@Api(value = "/billpayment", description = "billpayment", consumes = "application/json", tags = {"billpayment"})

public class BillPaymentController {
    @RequestMapping(value = "/systems", method = RequestMethod.GET)
    public List<BillingSystem> getBillingSystem() {
        return Collections.singletonList(new BillingSystem());
    }

    @RequestMapping(value = "/billers/categories", method = RequestMethod.GET)
    public List<BillerCategory> getBillerCategories() {
        return Collections.singletonList(new BillerCategory());
    }

    @RequestMapping(value = "/billers/category/{categoryId}", method = RequestMethod.GET)
    public List<Biller> getBillers(@PathVariable @ApiParam(value = "Category ID ") String categoryId) {
        return Collections.singletonList(new Biller());
    }

    @RequestMapping(value = "/biller/{billerId}/items", method = RequestMethod.GET)
    public List<BillPaymentItem> getBillPaymentItem(@PathVariable @ApiParam(value = "Biller ID ") String billerId) {
        return Collections.singletonList(new BillPaymentItem());
    }

}
