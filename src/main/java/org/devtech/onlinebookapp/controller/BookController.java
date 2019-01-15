package org.devtech.onlinebookapp.controller;

import org.devtech.onlinebookapp.repositories.BookRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Aditya Srivastva on 1/15/2019
 */

@Controller
public class BookController {

    private BookRepositories bookRepositories;

    public BookController(BookRepositories bookRepositories) {
        this.bookRepositories = bookRepositories;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRepositories.findAll());
        return  "books";
    }


}
