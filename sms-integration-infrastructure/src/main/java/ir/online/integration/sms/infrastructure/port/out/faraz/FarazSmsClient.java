package ir.online.integration.sms.infrastructure.port.out.faraz;

import ir.online.integration.sms.infrastructure.port.out.faraz.dto.req.SmsResponse;
import ir.online.integration.sms.infrastructure.port.out.faraz.dto.res.otp.OtpSendingRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 1/15/2026 8:06 PM
 * Package: ir.online.integration.sms.infrastructure.adapter.faraz
 */

@FeignClient(name = "farazSmsClient", url = "${sms.baseUrl}")
public interface FarazSmsClient {

    @PostMapping("/send")
    SmsResponse sendOtp(@RequestBody OtpSendingRequest otpSendingRequest, @RequestHeader("Authorization") String token);
}
