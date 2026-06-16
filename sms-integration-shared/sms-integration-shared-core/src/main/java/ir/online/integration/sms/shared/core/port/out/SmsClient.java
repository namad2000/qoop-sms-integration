package ir.online.integration.sms.shared.core.port.out;

import io.qoop.feign.config.QoopFeignConfiguration;
import ir.online.integration.sms.shared.api.port.out.dto.SendOtpRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "sms-service", url = "${sms-service.baseUrl}", configuration = QoopFeignConfiguration.class)
public interface SmsClient {
    @PostMapping("/otp/send")
    void sendOtp(@RequestBody SendOtpRequest sendOtpRequest);
}