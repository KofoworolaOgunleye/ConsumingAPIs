package org.northcoders.dao;

import org.springframework.web.reactive.function.client.WebClient;

public class FakeBooksDAO {
    static WebClient webClient = WebClient.builder().baseUrl("https://fakerapi.it/").build();

    public static String getResponseBody(){
        String responseBody = webClient // Reassign the result to a String
                .get()
                .uri("/api/v1/books")
                .retrieve()
                    .bodyToMono(String.class) // Bind the returned JSON body to a String
                    .block();
        return responseBody;
}
}
