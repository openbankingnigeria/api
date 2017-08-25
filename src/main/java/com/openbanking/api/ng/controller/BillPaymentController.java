package com.openbanking.api.ng.controller;
import com.openbanking.api.ng.payload.billpayment.BillPaymentItem;
import com.openbanking.api.ng.payload.billpayment.BillerCategory;
import com.openbanking.api.ng.payload.billpayment.BillingSystem;
import com.openbanking.api.ng.payload.billpayment.GetBiller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/billpayment")
@Api(value = "/billpayment", description = "billpayment", consumes = "application/json", tags = {"billpayment"})

public class BillPaymentController {
    @RequestMapping(value = "/getBillingSystem", method = RequestMethod.GET)
    public List<BillingSystem> getBillingSystem() {
        return Collections.singletonList(new BillingSystem());
    }
    @RequestMapping(value = "/getBillerCategories", method = RequestMethod.GET)
    public List<BillerCategory> getBillerCategories(@ApiParam(value = "Billing System ID ") String billingSystemId) {
        return Collections.singletonList(new BillerCategory());
    }
    @RequestMapping(value = "/getBillers", method = RequestMethod.GET)
    public List<GetBiller> getBillers(@ApiParam(value = "Category ID ") String categoryId) {
        return Collections.singletonList(new GetBiller());
    }
    @RequestMapping(value = "/getBillPaymentItem", method = RequestMethod.GET)
    public List<BillPaymentItem> getBillPaymentItem(@ApiParam(value = "Biller ID ") String billerId) {
        return Collections.singletonList(new BillPaymentItem());
    }

}
