package ng.openbanking.api.payload.card;
import java.util.List;

import ng.openbanking.api.payload.definition.ChannelType;
import ng.openbanking.api.payload.definition.PeriodType;

import lombok.Data;

@Data
public class SetCardLimit {
    private List<ChannelType> channelType;
    private String channel;
    private String transactionType = "Payment";
    private PeriodType periodType = PeriodType.DAY;

    
}
