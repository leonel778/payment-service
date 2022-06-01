package pe.com.bank.payment.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import pe.com.bank.payment.entity.CreditDTO;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class CreditRestClient {

    private WebClient webClient;

    @Value("${restClient.creditUrl}")
    private String creditUrl;

    public CreditRestClient(WebClient webClient) {
        this.webClient = webClient;
    }

     public Mono<CreditDTO> updateCreditA(CreditDTO creditDTO,String creditId){
         var url = creditUrl.concat("/v1/credits/{id}");
         return webClient
                 .put()
                 .uri(url, creditId)
                 .body(Mono.just(creditDTO), CreditDTO.class)
                 .retrieve()
                 .bodyToMono(CreditDTO.class);
     }

     public Mono<CreditDTO> retrieveCreditA(String creditId){
         var url = creditUrl.concat("/v1/credits/{id}");
         return webClient
                 .get()
                 .uri(url, creditId)
                 .retrieve()
                 .bodyToMono(CreditDTO.class)
                 .log();
     }
}
