package com.example.Book_Shelf.controller;

import com.example.Book_Shelf.domain.Book;
import com.example.Book_Shelf.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    final BookService bookService;
    final Controller controller;

    public BookController(BookService bookService, Controller controller) {
        this.bookService = bookService;
        this.controller = controller;
    }

    @PostMapping("/add")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book newBook = bookService.saveBook(book);
        return ResponseEntity.ok(newBook);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Book>> allBooks(){
        List<Book> allBooks = bookService.getAllBooks();
        //use Thymeleaf to get the details all books and show them in html page
        //is it possible to pass this info to the html page directly from here? But with using the @RestController
        //or the info should be passed first to Controller and then to html? and how?
        return new ResponseEntity<>(allBooks, HttpStatus.OK);
    }


}
