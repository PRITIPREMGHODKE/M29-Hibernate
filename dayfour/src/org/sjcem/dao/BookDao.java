package org.sjcem.dao;
import java.util.List;
import org.sjcem.entities.Book;
public abstract class BookDao<Book> {
	Book getBookByID(int id); //single entity
	List<Book>getAllBooks(); //all the books
	Long getBookCount(); //Count
	List<Book>getAuthorBooks(String author); //Particular author
	List<Book>getBookByTitle(String title); //for particular title
	List<Book>getBookByPrice(double low,double high); //price range

}
