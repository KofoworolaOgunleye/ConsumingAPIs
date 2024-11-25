package org.northcoders.dao;

import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

public class FakeBooksDAO {
    static WebClient webClient = WebClient.builder().baseUrl("https://fakerapi.it/api/v2").build();

    public static String getResponseBody(Map<String, String> urlMapper){
        String responseBody = webClient // Reassign the result to a String
                .get()
                .uri(uriBuilder -> {
                    uriBuilder.path("/books/");
                    urlMapper.forEach(uriBuilder::queryParam);
                    return uriBuilder.build();
                })
                .retrieve()
                    .bodyToMono(String.class) // Bind the returned JSON body to a String
                    .block();


        return responseBody;


}
}
