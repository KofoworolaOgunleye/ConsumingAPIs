package org.northcoders.model;
import java.time.LocalDate;
public record BookData(
        int id,
        String title,
        String author,
        String genre,
        String description,
        LocalDate published,
        String publisher) {

}
