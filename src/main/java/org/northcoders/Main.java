package org.northcoders;

import org.northcoders.dao.FakeBooksDAO;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       String results = FakeBooksDAO.getResponseBody(new Map<>("Books All", "/Books"));
        System.out.println(results);
    }
}
