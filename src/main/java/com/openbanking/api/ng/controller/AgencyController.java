package com.openbanking.api.ng.controller;
import io.swagger.annotations.Api;
import com.openbanking.api.ng.definition.AgencyType;
import com.openbanking.api.ng.definition.AgencyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.openbanking.api.ng.payload.agency.Agency;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Collections;
import java.util.List;
@RestController
@RequestMapping("/agency")
@Api(value = "/agency", description = "Agency related operations", consumes = "application/json", tags = {"agency"})
public class AgencyController {
    @ApiOperation(value = "Finds an Agency by Agency Code",
            notes = "The Agency Code is the unique identifier for an Agency  as defined by a Bank or Agency Network",
            response = Agency.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Agency Code supplied"),
            @ApiResponse(code = 404, message = "Agency not found")})

    @RequestMapping(value = "/getAgency", method = RequestMethod.GET)
    public Agency getAgency(@ApiParam(value = "The Agency's unique identifier") String branchId) {
        return new Agency();
    }
    @RequestMapping(value = "/getAgencies", method = RequestMethod.GET)
    public List<Agency> getAgencies(){
        return Collections.singletonList(new Agency());
    }
    @RequestMapping(value = "/getAgencysAtLocation", method = RequestMethod.GET)
    public List<Agency> getAgenciesAtLocation(){
        return Collections.singletonList(new Agency());
    }
}

