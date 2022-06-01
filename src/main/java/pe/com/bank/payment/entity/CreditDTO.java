package pe.com.bank.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditDTO {

    private String creditId;
    private Double amountUsed;
    private Double limitCredit;
    private Double creditAvailable;
    private String numberCredit;
    private String type;
    private String productId;
}
