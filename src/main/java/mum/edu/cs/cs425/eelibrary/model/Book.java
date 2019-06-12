package mum.edu.cs.cs425.eelibrary.model;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Books")
public class Book {

	@Column(name = "book_id", nullable = false)
	private int bookId;
	private String title;
	private float fee;
	
//	@Column(name = "published_date")
//	//@DateTimeFormat(pattern = "yyyy-mm-dd")
//	private LocalDate publishedDate;

	//constructors 
	
	public Book() {
		
	}
	


	public Book(String title, float fee) {
	
	
	this.title = title;
	this.fee = fee;
}



	//getters and setters
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@NotEmpty(message = "*please provide a title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	

	
	//to string method
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", fee=" + fee + ", publishedDate=" 
				+ "]";
	}

	
	
}
