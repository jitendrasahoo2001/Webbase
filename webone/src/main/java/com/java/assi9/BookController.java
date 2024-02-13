package com.java.assi9;
import java.util.List;

public class BookController {
	    private BookModel model;
	    private BookView view;

	    public BookController(BookModel model, BookView view) {
	        this.model = model;
	        this.view = view;
	    }

	    public void addBook(String title, String author, String genre) {
	        model.addBook(title, author, genre);
	    }

	    public void deleteBook(int id) {
	        model.deleteBook(id);
	    }

	    public void getAllBooks() {
	        List<Book> books = model.getAllBooks();
	        view.displayBookList(books);
	    }
	}



