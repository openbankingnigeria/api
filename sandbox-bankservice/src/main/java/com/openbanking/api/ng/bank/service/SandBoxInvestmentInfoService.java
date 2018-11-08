package com.openbanking.api.ng.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.definition.ProcessState;
import com.openbanking.api.ng.payload.agency.Agency;
import com.openbanking.api.ng.payload.atm.ATM;
import com.openbanking.api.ng.payload.branch.Branch;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;
import com.openbanking.api.ng.payload.investment.InvestmentBook;
import com.openbanking.api.ng.payload.investment.InvestmentProduct;
import com.openbanking.api.ng.payload.pos.POS;

@Service
public class SandBoxInvestmentInfoService implements InvestmentInfoService {

	private static final String INVESTMENT_MODEL_FILE_NAME="Investment";
	
	
	@Autowired
	private DataService dataService;

	@Override
	public List<InvestmentProduct> getInvestmentProduct()
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getModelList(INVESTMENT_MODEL_FILE_NAME);
	}

	@Override
	public List<InvestmentProduct> getInvestmentByAccountId(String accountId)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getModelList(INVESTMENT_MODEL_FILE_NAME);
	}

	@Override
	public PocessingOperationResponse bookInvestment(InvestmentBook investmentBook)
			throws ServiceOperationNotSupported {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}

}
