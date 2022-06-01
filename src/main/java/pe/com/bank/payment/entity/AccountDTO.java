package pe.com.bank.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private String id;
    private String accountNumber;
    private Double amount;
    private Date dateOpen;
    private String amounttype;
    private String productId;
    private String customerId;

}
