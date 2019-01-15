package org.devtech.onlinebookapp.controller;

import org.devtech.onlinebookapp.repositories.AuthorRepository;
import org.devtech.onlinebookapp.repositories.BookRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Aditya Srivastva on 1/15/2019
 */

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getBooks(Model model){
        model.addAttribute("authors", authorRepository.findAll());
        return  "authors";
    }


}
