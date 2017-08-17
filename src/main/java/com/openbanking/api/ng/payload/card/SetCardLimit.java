package com.openbanking.api.ng.payload.card;
import com.openbanking.api.ng.definition.ChannelType;
import java.util.List;

public class SetCardLimit {
    private List<ChannelType> channelType;
    private String channel;
    private String transactionType;
    private String periodType;

    public List<ChannelType> getChannelType() {
        return channelType;
    }

    public void setChannelType(List<ChannelType> channelType) {
        this.channelType = channelType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }
}
