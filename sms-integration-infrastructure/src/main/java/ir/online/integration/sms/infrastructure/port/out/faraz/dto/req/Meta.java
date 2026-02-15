package ir.online.integration.sms.infrastructure.port.out.faraz.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 1/15/2026 8:24 PM
 * Package: ir.online.integration.sms.infrastructure.adapter.faraz.dto.req
 */

@Data
public class Meta {
    private Boolean status;
    private String message;
    private String[] message_parameters;

    @JsonProperty("message_code")
    private String messageCode;
}