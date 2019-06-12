package mum.edu.cs.cs425.eelibrary.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.cs.cs425.eelibrary.model.Book;
import mum.edu.cs.cs425.eelibrary.service.BookService;

@Controller
public class BookController {
	
	@Autowired 
	private BookService bookService;
	
	
	@GetMapping(value = "/allbooks")
	public ModelAndView viewListOfBooks(Model model){
		List<Book> books = bookService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("books", books);
		modelAndView.setViewName("book/list");
		model.addAttribute("Book", books);
		return modelAndView;
	}
	
	
	@GetMapping(value = "/view")
	public String addNewBook(Model model) {
		model.addAttribute("book", new Book());
		
		return "/book/book";
	}
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editBook(@PathVariable(name = "id") int id) {
		ModelAndView modelAndView = new ModelAndView("book/edit");
		Book book = bookService.getBook(id);
		modelAndView.addObject("book", book);
		return modelAndView;
	}

	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable Integer id, Model model){		
		bookService.delete(id);
		return "redirect:/allbooks";
	}
	
	@PostMapping(value = "/save")
//	public String saveBook(@Valid Book book, BindingResult result, ModelMap model, RedirectAttributes attribute) {
//		bookService.save(book);
		public String saveBookToDB(@ModelAttribute ("book") Book book) {
//		book.setPublishedDate(LocalDate.now());
		
		bookService.saveBook(book);
		return "redirect:/allbooks";
	}
//	public String saveBook(@ModelAttribute ("book") Book book) {
//		bookService.save(book);
//		
//		return "/allbooks";
//	}
}
