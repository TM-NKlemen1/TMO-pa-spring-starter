package com.galvanize.tmo.paspringstarter;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class LibraryController {

    private BookDAO bookDao = new BookDAO();

    @GetMapping("/health")
    public String health() {
        return "Hello World";
    }

    @PostMapping("/api/books")
    @ResponseStatus(HttpStatus.CREATED)
    public Book postBook(@RequestBody Book book){
        bookDao.addBook(book);
        return book;
    }

    @GetMapping("/api/books")
    public BookDAO getBooks(){
        return bookDao;
    }

    @DeleteMapping("/api/books")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBooks(){
        bookDao.clear();
    }
}
