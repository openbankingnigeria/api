package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.payload.general.BankMeta;
import com.openbanking.api.ng.payload.general.GeneralCharges;
import com.openbanking.api.ng.payload.general.GeneralGetProduct;
import com.openbanking.api.ng.payload.general.GeneralInterfaceVersion;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/general")
@Api(value = "/general", description = "General related operations", consumes = "application/json", tags = {"general"})
public class GeneralController {

    @RequestMapping(value = "/information/version", method = RequestMethod.GET)
    public GeneralInterfaceVersion getInterfaceVersion() {
        return new GeneralInterfaceVersion();
    }

    @RequestMapping(value = "/information", method = RequestMethod.GET)
    public BankMeta getBankMeta() {
        return new BankMeta();
    }

    @RequestMapping(value = "/transaction/charges", method = RequestMethod.GET)
    public List<GeneralCharges> getCharges() {
        return Collections.singletonList(new GeneralCharges());
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<GeneralGetProduct> getProducts() {
        return Collections.singletonList(new GeneralGetProduct());
    }

}
