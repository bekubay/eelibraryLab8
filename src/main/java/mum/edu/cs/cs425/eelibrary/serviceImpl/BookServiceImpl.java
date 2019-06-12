package mum.edu.cs.cs425.eelibrary.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.cs.cs425.eelibrary.model.Book;
import mum.edu.cs.cs425.eelibrary.repository.BookRepository;
import mum.edu.cs.cs425.eelibrary.service.BookService;


@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		
		return bookRepo.save(book);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(id);
		
	}

	@Override
	public Book getBook(Integer book_id) {
		// TODO Auto-generated method stub
		return bookRepo.findById(book_id).get();
	}

}
