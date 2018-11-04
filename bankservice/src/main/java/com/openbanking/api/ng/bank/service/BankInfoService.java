package com.openbanking.api.ng.bank.service;

import java.util.List;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.agency.Agency;

public interface BankInfoService {

	Agency getAgencyById(String agencyId) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	List<Agency> getAgencies() throws ServiceOperationNotSupported;

	Agency getAgencyByLongAndLat(double longitude, double latitude)throws BankResourceNotFoundException,ServiceOperationNotSupported;

}
