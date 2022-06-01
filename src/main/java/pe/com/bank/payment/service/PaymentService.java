package pe.com.bank.payment.service;

import pe.com.bank.payment.entity.PaymentChargeDTO;
import pe.com.bank.payment.entity.PaymentEntity;
import reactor.core.publisher.Mono;

public interface PaymentService {

    public Mono<PaymentEntity> createPayment(PaymentEntity paymentEntity);

    public Mono<PaymentChargeDTO> createPaymentCharge(PaymentChargeDTO paymentChargeDTO);

}