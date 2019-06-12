package mum.edu.cs.cs425.eelibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.cs.cs425.eelibrary.model.Book;


@Repository("Bookrepository")
public interface BookRepository extends JpaRepository<Book, Integer>{

}
