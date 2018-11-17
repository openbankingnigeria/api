package ng.openbanking.api.payload.bank.service;

import java.util.List;

import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.agency.Agency;
import ng.openbanking.api.payload.atm.ATM;
import ng.openbanking.api.payload.branch.Branch;
import ng.openbanking.api.payload.pos.POS;

public interface BankInfoService {

	Agency getAgencyById(String agencyId) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	List<Agency> getAgencies() throws ServiceOperationNotSupported;

	List<Agency> getAgencyByLongAndLat(double longitude, double latitude) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	ATM getAtmById(String terminalId) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	List<ATM> getAtms() throws ServiceOperationNotSupported;

	ATM getAtmByBranchCode(String branchCode) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	List<ATM> getAtmByLongAndLat(double longitude, double latitude) throws ServiceOperationNotSupported;

	Branch getBanchByBranchId(String branchId)throws BankResourceNotFoundException,ServiceOperationNotSupported;

	List<Branch> getBranches() throws ServiceOperationNotSupported;

	List<Branch> getBranchesByLongAndLat(double longitude, double latitude) throws ServiceOperationNotSupported;

	List<POS> getPosByTerminalId(String terminalId) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	List<POS> getPosByMerchantId(String merchantId) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	List<POS> getPosByBranchId(String branchId) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	List<POS> getPosByEmail(String email) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	List<POS> getPosNearLocation(double longitude, double latitude) throws ServiceOperationNotSupported;

}
