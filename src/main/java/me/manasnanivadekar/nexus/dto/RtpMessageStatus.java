package me.manasnanivadekar.nexus.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RtpMessageStatus {
    public RtpMessageStatus(RtpMessage rtpmessage, String status, String banksMessageToUser) {
        this.rtpmessage = rtpmessage;
        this.status = status;
        this.banksMessageToUser = banksMessageToUser;
    }

    // public RtpMessageStatus(RtpMessage rtpmessage2, String string) {
    // }

    public RtpMessage rtpmessage;
    public String status;
    public String banksMessageToUser;
}
