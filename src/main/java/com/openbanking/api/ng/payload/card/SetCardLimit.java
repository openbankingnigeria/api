package com.openbanking.api.ng.payload.card;
import com.openbanking.api.ng.definition.ChannelType;
import java.util.List;

public class SetCardLimit {
    private List<ChannelType> channelType;
    private String channel;
    private String transactionType;
    private String periodType;

}
