package pe.com.bank.payment.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.com.bank.payment.client.AccountRestClient;
import pe.com.bank.payment.client.CreditRestClient;
import pe.com.bank.payment.client.TransactionRestClient;
import pe.com.bank.payment.entity.*;
import pe.com.bank.payment.service.PaymentService;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/v1")
public class PaymentController {

    PaymentService paymentService;
    CreditRestClient creditRestClient;
    AccountRestClient accountRestClient;
    TransactionRestClient transactionRestClient;

    @PostMapping("/payment")
    public Mono<PaymentEntity> createPayment(@RequestBody PaymentEntity paymentEntity) {
       return paymentService.createPayment(paymentEntity);
    }

    @PostMapping("/payment/charge")
    public Mono<PaymentChargeDTO> createPaymentCharge(@RequestBody PaymentChargeDTO paymentChargeDTO) {
        return paymentService.createPaymentCharge(paymentChargeDTO);
    }
}