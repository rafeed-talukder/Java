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
import java.util.Scanner;
public class BookStoreApp{
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n;
		BookStore b=new BookStore();
		b.books[0]= new Book("JAVA","XXX","1q2",10);
		do { 
			
			
			
			System.out.println("Enter \"1\" to display the Books: Title-Author-ISBN-_Quantity");
			System.out.println("Enter \"2\" to order new books");
			System.out.println("Enter \"3\" to sell books");
			System.out.println("Enter \"0\" to exit the system");
			
			System.out.println("Enter Your choice");
			n=scan.nextInt();
			
			if(n==1) {
				int i;
				for(i=0;i<10;i++) {
					if(b.books[i]!=null) {
						b.books[i].display();
					System.out.println();
				}
					else if(b.books[i]==null && i==0){
						System.out.println("List is Empty");
					}
			}
					
			}
			
			
			if(n==2) {
				System.out.println("Enter ISBN number and Quantity");
				String isbn=scan.next();
				int quan=scan.nextInt();
				b.order(isbn, quan);
			}
			
			if(n==3) {
				
				System.out.println("Enter Book name and Quantity");
				String name=scan.next();
				int quan=scan.nextInt();
				b.sell(name, quan);
	
			}
	         
		}while(n!=0);
		
	}
	
}
	
	

