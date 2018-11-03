package com.openbanking.api.ng.bank.service;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.account.Account;

public interface BankAccountService {

	Account getAccountByAccountNumber(String accountNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported;

}
