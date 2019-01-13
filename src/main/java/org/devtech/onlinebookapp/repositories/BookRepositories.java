package org.devtech.onlinebookapp.repositories;

import org.devtech.onlinebookapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositories extends CrudRepository<Book, Long> {
}
