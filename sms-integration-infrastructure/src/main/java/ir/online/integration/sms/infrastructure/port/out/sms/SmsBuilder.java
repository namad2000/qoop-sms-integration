package ir.online.integration.sms.infrastructure.port.out.sms;


import ir.online.integration.sms.infrastructure.port.out.sms.dto.req.ParameterDto;
import ir.online.integration.sms.infrastructure.port.out.sms.dto.req.VerifySendingRequestDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 1/15/2026 8:53 PM
 */

@Component
public class SmsBuilder {

    @Value("${sms.otpParamName}")
    private String otpParamName;

    @Value("${sms.otpTemplateId}")
    private String templateId;

    public VerifySendingRequestDto buildVerifySendingRequestDto(String recipients, String code) {
        ParameterDto parameter = ParameterDto.builder()
                .name(otpParamName)
                .value(code)
                .build();

        return VerifySendingRequestDto.builder()
                .mobile(recipients)
                .templateId(templateId)
                .parameterDtos(Collections.singletonList(parameter))
                .build();
    }
}
