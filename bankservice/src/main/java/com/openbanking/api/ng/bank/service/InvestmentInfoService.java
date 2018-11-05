package com.openbanking.api.ng.bank.service;

import java.util.List;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;
import com.openbanking.api.ng.payload.investment.InvestmentBook;
import com.openbanking.api.ng.payload.investment.InvestmentProduct;

public interface InvestmentInfoService {

	List<InvestmentProduct> getInvestmentProduct()   throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	List<InvestmentProduct> getInvestmentByAccountId(String accountId) throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	PocessingOperationResponse bookInvestment(InvestmentBook investmentBook) throws ServiceOperationNotSupported ;


}
