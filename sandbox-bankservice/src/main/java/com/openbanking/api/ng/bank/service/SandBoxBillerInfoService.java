package com.openbanking.api.ng.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.definition.ProcessState;
import com.openbanking.api.ng.payload.agency.Agency;
import com.openbanking.api.ng.payload.atm.ATM;
import com.openbanking.api.ng.payload.billpayment.BillPaymentItem;
import com.openbanking.api.ng.payload.billpayment.Biller;
import com.openbanking.api.ng.payload.billpayment.BillerCategory;
import com.openbanking.api.ng.payload.billpayment.BillingSystem;
import com.openbanking.api.ng.payload.branch.Branch;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;
import com.openbanking.api.ng.payload.investment.InvestmentBook;
import com.openbanking.api.ng.payload.investment.InvestmentProduct;
import com.openbanking.api.ng.payload.pos.POS;

@Service
public class SandBoxBillerInfoService implements BillerInfoService {

	private static final String BILLER_CAT_MODEL_FILE_NAME="BillerCategory";
	
	private static final String BILLER_SYS_MODEL_FILE_NAME="BillingSystem";
	
	private static final String BILLER_MODEL_FILE_NAME="Biller";
	
	private static final String BILL_ITEM_MODEL_FILE_NAME="BillPaymentItem";
	
	@Autowired
	private DataService dataService;


	@Override
	public List<BillerCategory> getBillerCategories() throws ServiceOperationNotSupported {
		return dataService.getModelList(BILLER_CAT_MODEL_FILE_NAME);
	}


	@Override
	public List<BillingSystem> getBillingSystems() throws ServiceOperationNotSupported {
		return dataService.getModelList(BILLER_SYS_MODEL_FILE_NAME);
	}


	@Override
	public List<Biller> getBillersByCategoryId(String categoryId)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getModelList(BILLER_MODEL_FILE_NAME);
	}


	@Override
	public List<BillPaymentItem> getBillPaymentItemByBillerId(String billerId)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getModelList(BILL_ITEM_MODEL_FILE_NAME);
	}


}
