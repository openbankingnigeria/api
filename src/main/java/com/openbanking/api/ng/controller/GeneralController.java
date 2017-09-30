package com.openbanking.api.ng.controller;
import com.openbanking.api.ng.payload.general.GeneralBankMeta;
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
    @RequestMapping(value = "/getInterfaceVersion", method = RequestMethod.GET)
    public List<GeneralInterfaceVersion> getInterfaceVersion() {
        return Collections.singletonList(new GeneralInterfaceVersion());
    }
    @RequestMapping(value = "/getBankMeta", method = RequestMethod.GET)
    public List<GeneralBankMeta> getBankMeta() {
        return Collections.singletonList(new GeneralBankMeta());
    }
    @RequestMapping(value = "/getCharges", method = RequestMethod.GET)
    public List<GeneralCharges> getCharges() {
        return Collections.singletonList(new GeneralCharges());
    }
    @RequestMapping(value = "/getProducts", method = RequestMethod.GET)
    public List<GeneralGetProduct> getProducts() {
        return Collections.singletonList(new GeneralGetProduct());
    }

}
