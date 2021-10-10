package me.manasnanivadekar.nexus.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RtpBillStatus {

    public RtpBillStatus(RtpBill bill, String status, String banksMessageToUser) {
        this.bill = bill;
        this.status = status;
        this.banksMessageToUser = banksMessageToUser;
    }

    public RtpBill bill;
    public String status;
    public String banksMessageToUser;
}
