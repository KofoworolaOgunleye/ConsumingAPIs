package org.northcoders;

import org.northcoders.dao.FakeBooksDAO;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//       String results = FakeBooksDAO.getResponseBody();
        Map<String, String> urlMappers = Map.of("title","Dodo managed it.).");

        String results = FakeBooksDAO.getResponseBody(urlMappers);
        System.out.println(results);
    }
}
