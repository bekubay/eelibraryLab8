package mum.edu.cs.cs425.eelibrary.service;

import java.util.List;



import mum.edu.cs.cs425.eelibrary.model.Book;


public interface BookService {
	Book saveBook(Book book);
	 List<Book> findAll();
	 void delete(Integer id);
	 Book getBook(Integer book_id);

}
