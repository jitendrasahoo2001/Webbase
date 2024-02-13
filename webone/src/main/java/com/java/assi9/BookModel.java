package com.java.assi9;

import java.util.*;

public class BookModel {
	private List<Book> books;
	
	public BookModel() {
        this.books = new ArrayList<>();
    }
	
	public void addBook(String title, String author, String genre) {
        int id = books.size() + 1; 
        Book book = new Book(id, title, author, genre);
        books.add(book);
    }

    public void deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

}
