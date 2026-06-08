package ir.online.integration.sms.infrastructure.port.out.sms.dto.res.otp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerifyDto {
    private long messageId;
    private int cost;
}