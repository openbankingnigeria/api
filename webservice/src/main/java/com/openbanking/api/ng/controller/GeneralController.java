package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.GenericServiceResponse;
import com.openbanking.api.ng.payload.GenericServiceResponseBuilder;
import com.openbanking.api.ng.payload.general.BankMeta;
import com.openbanking.api.ng.payload.general.GeneralCharges;
import com.openbanking.api.ng.payload.general.GeneralGetProduct;
import com.openbanking.api.ng.payload.general.GeneralInterfaceVersion;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/general")
@Api(value = "/general", description = "General related operations", consumes = "application/json", tags = {"general"})
public class GeneralController extends BaseApiController{

    @RequestMapping(value = "/information/version", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getInterfaceVersion() {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(new GeneralInterfaceVersion())
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/information", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBankMeta() {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(new BankMeta())
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transaction/charges", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getCharges() {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new GeneralCharges()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getProducts() {
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(Collections.singletonList(new GeneralGetProduct()))
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

}
