package org.northcoders.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public record Book(
//        String status,
//        int code,
//        String locale,
//        String seed,
//        int total,
        ArrayList<BookData> data
) {
}
