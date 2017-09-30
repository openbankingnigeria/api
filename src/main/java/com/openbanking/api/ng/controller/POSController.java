package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.payload.pos.POS;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/pos")
@Api(value = "/pos", description = "pos", consumes = "application/json", tags = {"pos"})

public class POSController {
    @ApiOperation(value = "Finds a POS by Terminal ID",
            notes = "The Terminal ID is the unique identifier for a POS",
            response = POS.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Terminal ID supplied"),
            @ApiResponse(code = 404, message = "POS not found")})
    @RequestMapping(value = "/getPosByTerminalId", method = RequestMethod.GET)
    public List<POS> getPosByTerminalId(@ApiParam(value = "The Terminal ID") String terminalId) {
        return Collections.singletonList(new POS());
    }
    @RequestMapping(value = "/getPosByMerchantIdOrBranchIdOrEmail", method = RequestMethod.GET)
    public List<POS> getPosByMerchantIdOrBranchIdOrEmail(@ApiParam(value = "Merchant ID, Branch ID or Email ") String merchantId, String branchId, String email) {
        return Collections.singletonList(new POS());
    }
    @RequestMapping(value = "/getPosNearLocation", method = RequestMethod.GET)
    public List<POS> getPosNearLocation(@ApiParam(value = "Latitude and Longitude of POS ") int latitude, int longitude) {
        return Collections.singletonList(new POS());
    }
}
