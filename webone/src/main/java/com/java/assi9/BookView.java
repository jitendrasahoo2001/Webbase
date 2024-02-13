package com.java.assi9;

import java.util.List;

public class BookView {
	public void displayBookList(List<Book> books) {
        System.out.println("Book List:");
        for (Book book : books) {
            System.out.println(book.getId() + ": " + book.getTitle() + " by " + book.getAuthor() + " -" + book.getGenre());
        }
        System.out.println();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

}
