package ir.online.integration.sms.presentation.rest;

import ir.online.integration.sms.application.port.in.usecase.SmsUseCase;
import ir.online.integration.sms.shared.api.port.out.dto.SendOtpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 1/17/2026 1:10 PM
 * Package: ir.online.integration.sms.presentation
 */

@RestController
@RequestMapping("/sms")
@RequiredArgsConstructor
public class SmsResource {

    private final SmsUseCase smsUseCase;

    @PostMapping("/otp/send")
    public void SendOtp(@RequestBody SendOtpRequest sendOtpRequest) {
        smsUseCase.sendOtp(sendOtpRequest.getRecipients(), sendOtpRequest.getCode());
    }
}
