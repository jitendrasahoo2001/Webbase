package com.java.assi9;

public class LibraryManagementApp {
	public static void main(String[] args) {
        BookModel model = new BookModel();
        BookView view = new BookView();
        BookController controller = new BookController(model, view);

        controller.addBook("To Kill a Mockingbird", "Harper Lee", "Fiction");
        controller.addBook("1984", "George Orwell", "Science Fiction");
        controller.addBook("The Catcher in the Rye", "J.D. Salinger", "Literary Fiction");

        controller.getAllBooks();

        controller.deleteBook(2);


        controller.getAllBooks();
	}

}
