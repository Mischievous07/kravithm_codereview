package com.soit.libraryinventory;

import com.soit.libraryinventory.entity.Book;
import com.soit.libraryinventory.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book")
    public String listBooks(Model model) {

        List<Book> books = bookService.findAll();

        model.addAttribute("books", books);

        return "list-books";
    }
}

