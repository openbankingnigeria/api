package ng.openbanking.api.payload.bank.service;

import java.util.List;

import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.customer.PocessingOperationResponse;
import ng.openbanking.api.payload.investment.InvestmentBook;
import ng.openbanking.api.payload.investment.InvestmentProduct;

public interface InvestmentInfoService {

	List<InvestmentProduct> getInvestmentProduct()   throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	List<InvestmentProduct> getInvestmentByAccountId(String accountId) throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	PocessingOperationResponse bookInvestment(InvestmentBook investmentBook) throws ServiceOperationNotSupported ;


}
