package pe.com.bank.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {

    private String accountNumber;
    private Double amount;
    private Date date;
    private String type;
    private String creditId;

}
