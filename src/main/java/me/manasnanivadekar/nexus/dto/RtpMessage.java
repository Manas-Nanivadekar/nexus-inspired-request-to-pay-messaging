package me.manasnanivadekar.nexus.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RtpMessage {
    public String communicationUuid;
    public String sourceCountryId;
    public String sourceBankId;
    public String sourceBankAccNumber;
    public String destinationCountryId;
    public String destinationBankId;
    public String destinationBankAccNumber;
    public String subject;
    public String[] message;

}
