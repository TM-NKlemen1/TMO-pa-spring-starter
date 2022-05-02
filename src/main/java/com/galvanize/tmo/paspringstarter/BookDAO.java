package com.galvanize.tmo.paspringstarter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookDAO {

    private List<Book> books;

    public BookDAO() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book newBook){
        newBook.setId(books.size() + 1);
        books.add(newBook);
        Collections.sort(books);
    }

    public void clear(){
        books.clear();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
