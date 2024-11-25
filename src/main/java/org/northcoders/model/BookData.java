package org.northcoders.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;
@JsonIgnoreProperties(ignoreUnknown = true)
public record BookData(
        int id,
        String title,
        String author,
        String genre,
        String description,
//        LocalDate published,
        String publisher) {

}
