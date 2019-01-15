package org.devtech.onlinebookapp.bootstrap;

import org.devtech.onlinebookapp.model.Author;
import org.devtech.onlinebookapp.model.Book;
import org.devtech.onlinebookapp.repositories.AuthorRepository;
import org.devtech.onlinebookapp.repositories.BookRepositories;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepositories bookRepositories;

    public DevBootstrap(AuthorRepository authorRepository, BookRepositories bookRepositories) {
        this.authorRepository = authorRepository;
        this.bookRepositories = bookRepositories;
    }



    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //TechSolution
        Author techSolution= new Author("Tech", "Solution");
        Book java= new Book("Introduction Of Java 8", "1234", "Indian");
        techSolution.getBooks().add(java);
        java.getAuthors().add(techSolution);

        authorRepository.save(techSolution);
        bookRepositories.save(java);

        //IndianPress
        Author indianpress= new Author("James", "Gosling");
        Book spring= new Book("Introduction Of Spring", "9874", "Indian");
        techSolution.getBooks().add(spring);
        java.getAuthors().add(indianpress);

        authorRepository.save(indianpress);
        bookRepositories.save(spring);






    }
}
