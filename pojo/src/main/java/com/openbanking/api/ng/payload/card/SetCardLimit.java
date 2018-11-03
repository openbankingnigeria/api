package com.openbanking.api.ng.payload.card;
import java.util.List;

import com.openbanking.api.ng.definition.ChannelType;
import com.openbanking.api.ng.definition.PeriodType;

import lombok.Data;

@Data
public class SetCardLimit {
    private List<ChannelType> channelType;
    private String channel;
    private String transactionType = "Payment";
    private PeriodType periodType = PeriodType.DAY;

    
}
