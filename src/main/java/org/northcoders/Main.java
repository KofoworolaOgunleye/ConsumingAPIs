package org.northcoders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.northcoders.dao.FakeBooksDAO;
import org.northcoders.model.Book;
import org.northcoders.model.BookData;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//       String results = FakeBooksDAO.getResponseBody();
        Map<String, String> urlMappers = Map.of("title","Dodo managed it.).");

        String results = FakeBooksDAO.getResponseBody(urlMappers);
        System.out.println(results);

        ObjectMapper mapper = new ObjectMapper(); // this is from the Jackson library

        /* fetch HTTP response here */

        try {
            var result = mapper.readValue(results, Book.class);
            System.out.println(result);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
