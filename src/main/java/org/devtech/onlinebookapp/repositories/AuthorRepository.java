package org.devtech.onlinebookapp.repositories;

import org.devtech.onlinebookapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
