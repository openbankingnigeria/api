package com.openbanking.api.ng.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.account.Account;
import com.openbanking.api.ng.payload.account.AccountBlock;
import com.openbanking.api.ng.payload.account.AccountType;
import com.openbanking.api.ng.payload.agency.Agency;

@Service
public class SandBoxInfoService implements BankInfoService {

	@Autowired
	private DataService dataService;

	@Override
	public Agency getAgencyById(String agencyId) throws BankResourceNotFoundException, ServiceOperationNotSupported {
		Agency agency=null;
		List<Agency> agencyList=dataService.getData("agency", List.class);
		if(CollectionUtils.isEmpty(agencyList)) {
			agency=agencyList.get(0);
		}
		return  agency;
		
	}

	@Override
	public List<Agency> getAgencies() throws ServiceOperationNotSupported {
		return dataService.getData("agency", List.class);
	}

	@Override
	public Agency getAgencyByLongAndLat(double longitude, double latitude) throws BankResourceNotFoundException, ServiceOperationNotSupported {
		Agency agency=null;
		List<Agency> agencyList=dataService.getData("agency", List.class);
		if(CollectionUtils.isEmpty(agencyList)) {
			agency=agencyList.get(0);
		}
		return  agency;
	}
	
}
