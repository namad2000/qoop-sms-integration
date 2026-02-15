package ir.online.integration.sms.infrastructure.port.out.faraz.dto.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class SendingRequest<P> {
    @JsonProperty("sending_type")
    private String sendingType;

    @JsonProperty("from_number")
    private String fromNumber;
    private String code;
    private List<String> recipients;
    private P params;
}
