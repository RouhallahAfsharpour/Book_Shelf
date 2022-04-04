package com.example.Book_Shelf.service;

import com.example.Book_Shelf.domain.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class BookServiceTest {

    CodeService codeService = Mockito.mock(CodeService.class);
    RatingService ratingService = Mockito.mock(RatingService.class);
    BookService bookService;

    @BeforeEach
    void setUp() {
        Mockito.reset(codeService);
        this.bookService = new BookService(ratingService,codeService);
    }

    @Test
    void testSaveBook() {
        // Given

        when(codeService.getShortCode()).thenReturn("xYz");

        Book book = Book.builder()
                .author("Author")
                .title("Title")
                .description("Description")
                .rating(ratingService.getRating())
                .yearOfPublication(2020)
                .code(codeService.getShortCode())
                .build();

        Book newBook = bookService.saveBook(book);


        assertNotNull(newBook);
    }

}