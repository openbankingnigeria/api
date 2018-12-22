package ng.openbanking.api.payload.access;
import lombok.Data;

import java.util.Timer;

@Data
public class Access {
    private String accessToken;
    private Timer expirationTime;
    private String tokenType;

   
}
