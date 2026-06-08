package ir.online.integration.sms.infrastructure.port.out.sms.dto.res.otp;


import lombok.Data;

@Data
public class SmsResponse<T> {
    private T data;
    private int status;
    private String message;
}