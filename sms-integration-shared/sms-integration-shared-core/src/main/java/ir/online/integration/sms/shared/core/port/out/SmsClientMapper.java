package ir.online.integration.sms.shared.core.port.out;

import io.qoop.mapper.core.CommonsMapperConfig;
import ir.online.integration.sms.shared.api.port.out.dto.SendOtpRequest;
import org.mapstruct.Mapper;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 6/14/2026 9:16 PM
 * Package: ir.online.integration.sms.shared.core.port.out
 */

@Mapper(config = CommonsMapperConfig.class)
public class SmsClientMapper {
    SendOtpRequest toSendOtpRequest(String recipients, String code) {
        return SendOtpRequest.builder()
                .recipients(recipients)
                .code(code)
                .build();
    }
}
