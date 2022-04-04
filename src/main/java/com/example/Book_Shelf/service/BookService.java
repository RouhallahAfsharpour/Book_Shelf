package com.example.Book_Shelf.service;

import com.example.Book_Shelf.domain.Book;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
//@AllArgsConstructor
public class BookService {

    //@Autowired
    private final RatingService ratingService;

    //@Autowired
    private final CodeService codeService;

    HashMap<String,Book> mapOfBooks = new HashMap<>();

    public BookService(RatingService ratingService, CodeService codeService) {
        this.ratingService = ratingService;
        this.codeService = codeService;
    }

    public Book saveBook(Book book){
        String id = UUID.randomUUID().toString();
        String code = codeService.getShortCode();
        float rating = ratingService.getRating();
        book.setCode(code);
        book.setId(id);
        book.setRating(rating);
        mapOfBooks.put(code,book);
        return book;
    }

    public List<Book> getAllBooks(){
        return new ArrayList<Book>(mapOfBooks.values());
    }
}
