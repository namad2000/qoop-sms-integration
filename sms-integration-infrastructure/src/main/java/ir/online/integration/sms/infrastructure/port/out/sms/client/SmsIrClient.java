package ir.online.integration.sms.infrastructure.port.out.sms.client;

import io.qoop.feign.config.QoopFeignConfiguration;
import ir.online.integration.sms.infrastructure.port.out.sms.dto.req.VerifySendingRequestDto;
import ir.online.integration.sms.infrastructure.port.out.sms.dto.res.otp.VerifyResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "smsIrClient", url = "${sms.baseUrl}", configuration = QoopFeignConfiguration.class)
public interface SmsIrClient {

    @PostMapping("/verify")
    VerifyResponse sendVerify(@RequestBody VerifySendingRequestDto verifySendingRequestDto, @RequestHeader("X-API-KEY") String apiKey);
}