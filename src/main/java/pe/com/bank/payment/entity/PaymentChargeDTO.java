package pe.com.bank.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentChargeDTO {

    private String creditId;
    private Double amount;
    private String type;
    private Date date;

}
