/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

/**
 *
 * @author HP
 */
public class Book {
	
	public String bookTitle;
	public String bookAuthor;
	public String bookISBN;
	public int numOfCopies;
	
	public Book(String bookTitle,String bookAuthor,String bookISBN,int numOfCopies) {
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.bookISBN=bookISBN;
		this.numOfCopies=numOfCopies;
	}
	
	public void display() {
		System.out.println("Title - "+bookTitle+" Author - "+bookAuthor+" ISBN - "+bookISBN+" Quantity - "+numOfCopies);
	}

}