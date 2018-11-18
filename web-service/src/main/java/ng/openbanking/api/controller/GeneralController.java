package ng.openbanking.api.controller;


import io.swagger.annotations.Api;
import ng.openbanking.api.payload.GenericServiceResponse;
import ng.openbanking.api.payload.GenericServiceResponseBuilder;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.GeneralInfoService;
import ng.openbanking.api.payload.definition.OperationStatus;
import ng.openbanking.api.payload.general.BankMeta;
import ng.openbanking.api.payload.general.GeneralCharges;
import ng.openbanking.api.payload.general.GeneralGetProduct;
import ng.openbanking.api.payload.general.GeneralInterfaceVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/general")
@Api(value = "/general", description = "General related operations", consumes = "application/json", tags = {"general"})
public class GeneralController extends BaseApiController{

	@Autowired
	private GeneralInfoService generalInfoService;
	
    @RequestMapping(value = "/information/version", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getInterfaceVersion()  throws ServiceOperationNotSupported {
    	GeneralInterfaceVersion data=generalInfoService.getInterfaceVersion();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/information", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBankMeta()  throws  ServiceOperationNotSupported {
    	BankMeta data=generalInfoService.getBankMeta();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/transaction/charges", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getCharges()  throws  ServiceOperationNotSupported {
    	List<GeneralCharges> data=generalInfoService.getCharges();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getProducts()  throws  ServiceOperationNotSupported {
    	List<GeneralGetProduct> data=generalInfoService.getProducts();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(data)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

}
