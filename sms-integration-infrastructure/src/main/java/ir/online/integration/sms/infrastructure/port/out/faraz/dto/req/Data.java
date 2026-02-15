package ir.online.integration.sms.infrastructure.port.out.faraz.dto.req;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Data {
    private Integer[] message_outbox_ids;
}