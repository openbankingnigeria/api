package ng.openbanking.api.controller;


import io.swagger.annotations.*;
import ng.openbanking.api.payload.GenericServiceResponse;
import ng.openbanking.api.payload.GenericServiceResponseBuilder;
import ng.openbanking.api.payload.agency.Agency;
import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.BankInfoService;
import ng.openbanking.api.payload.definition.OperationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/agencies")
@Api(value = "/agencies", description = "Agency related operations", consumes = "application/json", tags = {"agency"})
public class AgencyController extends BaseApiController{
	
	@Autowired
	private BankInfoService bankInfoService;
	
    @ApiOperation(value = "Finds an Agency by Agency Code",
            notes = "The Agency Code is the unique identifier for an Agency  as defined by a Bank or Agency Network",
            response = Agency.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Agency Code supplied"),
            @ApiResponse(code = 404, message = "Agency not found")})

    @RequestMapping(value = "/{agencyId}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAgency(@PathVariable @ApiParam(value = "The Agency's unique identifier") String agencyId)  throws BankResourceNotFoundException, ServiceOperationNotSupported
    {
    	Agency agency=bankInfoService.getAgencyById(agencyId);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(agency)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAgencies() throws ServiceOperationNotSupported{
    	List<Agency> agencyList=bankInfoService.getAgencies();
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(agencyList)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }

    @RequestMapping(value = "/latitude/{latitude}/longitude/{longitude}", method = RequestMethod.GET)
    public ResponseEntity<GenericServiceResponse> getAgenciesAtLocation(@PathVariable @ApiParam(value = "The location's latitude") double latitude,
                                              @PathVariable @ApiParam(value = "The location's longitude") double longitude)  throws BankResourceNotFoundException,ServiceOperationNotSupported 
    {
    	List<Agency> agency=bankInfoService.getAgencyByLongAndLat(longitude,latitude);
        return ResponseEntity.ok(GenericServiceResponseBuilder.aGenericServiceResponse()
                .withData(agency)
                .withStatus(OperationStatus.SUCCESSFUL)
                .withMessage(OperationStatus.SUCCESSFUL.name())
                .build());
    }
}

