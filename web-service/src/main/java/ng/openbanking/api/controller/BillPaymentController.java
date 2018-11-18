package ng.openbanking.api.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import ng.openbanking.api.payload.GenericServiceResponse;
import ng.openbanking.api.payload.GenericServiceResponseBuilder;
import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.BillerInfoService;
import ng.openbanking.api.payload.billpayment.BillPaymentItem;
import ng.openbanking.api.payload.billpayment.Biller;
import ng.openbanking.api.payload.billpayment.BillerCategory;
import ng.openbanking.api.payload.billpayment.BillingSystem;
import ng.openbanking.api.payload.definition.OperationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/billpayment")
@Api(value = "/billpayment", description = "billpayment", consumes = "application/json", tags = {"billpayment"})

public class BillPaymentController extends BaseApiController{
	
	@Autowired
	private BillerInfoService billerInfoService;
	
	
    @RequestMapping(value = "/systems", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBillingSystem() throws ServiceOperationNotSupported {
    	List<BillingSystem> systems=billerInfoService.getBillingSystems();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(systems)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/billers/categories", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBillerCategories() throws ServiceOperationNotSupported{
    	List<BillerCategory> categories=billerInfoService.getBillerCategories();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(categories)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/billers/category/{categoryId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBillers(@PathVariable @ApiParam(value = "Category ID") String categoryId) throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	List<Biller> billers=billerInfoService.getBillersByCategoryId(categoryId);
    	return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(billers)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/biller/{billerId}/items", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getBillPaymentItem(@PathVariable @ApiParam(value = "Biller ID") String billerId) 
    		throws BankResourceNotFoundException,ServiceOperationNotSupported{
    	List<BillPaymentItem> bills=billerInfoService.getBillPaymentItemByBillerId(billerId);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(bills)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

}
