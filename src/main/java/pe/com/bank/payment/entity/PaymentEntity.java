package pe.com.bank.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity {

    private Double amount;
    private String creditId;
    private String accountId;
    private Date date;
    private String type;
}
