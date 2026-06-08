package ir.online.integration.sms.shared.api.port.out;

public interface SmsPort {
    void sendOtp(String recipients, String code);
}
