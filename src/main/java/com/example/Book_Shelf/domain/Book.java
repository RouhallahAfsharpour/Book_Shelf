package com.example.Book_Shelf.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
    private String id;
    private String code;
    private String title;
    private String author;
    private String isbn;
    private String description;
    private int yearOfPublication;
    private float rating;

    //private List<Book> listOfBooks
}
