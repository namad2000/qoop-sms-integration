package ir.online.integration.sms.infrastructure.port.out.faraz.dto.res.otp;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class OtpParams {
    private String name;
    private String charge;
    private String complex_name;
}