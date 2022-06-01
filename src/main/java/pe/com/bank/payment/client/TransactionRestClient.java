package pe.com.bank.payment.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import pe.com.bank.payment.entity.TransactionDTO;
import reactor.core.publisher.Mono;

@Component
public class TransactionRestClient {

    private WebClient webClient;

    @Value("${restClient.transactionUrl}")
    private String transactionUrl;


    public TransactionRestClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<TransactionDTO> createTransactionA(TransactionDTO transactionDTO){
        var url = transactionUrl.concat("/v1/createTransaction");
        return webClient.post()
                .uri(url)
                .body(Mono.just(transactionDTO), TransactionDTO.class)
                .retrieve()
                .bodyToMono(TransactionDTO.class);
    }


}
