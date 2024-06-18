package com.example.bookmanagement.resolver;


import com.example.bookmanagement.entity.Book;
import com.example.bookmanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookMutationResolver {

    @Autowired
    private BookService bookService;

    @MutationMapping
    public Book saveBook(String title, String author, String isbn) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setIsbn(isbn);
        return bookService.saveBook(book);
    }

    @MutationMapping
    public Boolean deleteBook(Long id) {
        bookService.deleteBook(id);
        return true;
    }
}