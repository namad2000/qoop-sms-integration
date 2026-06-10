package ir.online.integration.sms.infrastructure.port.out.sms.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VerifySendingRequestDto {
    private String mobile;
    private String templateId;
    private List<ParameterDto> parameters;
}