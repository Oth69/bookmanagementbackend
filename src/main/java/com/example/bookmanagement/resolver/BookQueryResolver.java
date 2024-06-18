package com.example.bookmanagement.resolver;


import com.example.bookmanagement.entity.Book;
import com.example.bookmanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookQueryResolver {

    @Autowired
    private BookService bookService;

    @QueryMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @QueryMapping
    public Book getBookById(Long id) {
        return bookService.getBookById(id).orElse(null);
    }
}