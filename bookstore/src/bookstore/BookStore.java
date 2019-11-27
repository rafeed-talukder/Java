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
public class BookStore {
	Scanner scan=new Scanner(System.in);
	Book [] books=new Book[10];
	
	public void sell(String sellBook ,int sellQuantity ) {
		
		for(int i=0;i<10;i++) {
			if(books[i]!=null) {
				if(books[i].bookTitle.equals(sellBook)) {
					if(books[i].numOfCopies>=sellQuantity) {
						books[i].numOfCopies-=sellQuantity;
						System.out.println("Remaining Copies "+books[i].numOfCopies);
						break;
					}
					else if(books[i].numOfCopies<sellQuantity){
						System.out.println("Not Enough Books ");
                                                break;
					}
				}
				
				else if(i==10){
					System.out.println("Book is not listed");
					
				}
				
				
				}
			else
				break;
	
	
		}
	}
	
	
	public void order(String orderISBN, int orderQuantity) {
		int i;
		boolean b=false;
		for(i=0;i<10;i++) {

		if(books[i]!=null) {
			
			if(books[i].bookISBN.equals(orderISBN)) {
				books[i].numOfCopies+=orderQuantity;
				b=true;
				break;
			}
		 }
		
		else if(!b) {
		 if(i<10) {
			System.out.println("New Book. Enter Book Title and  Author Name");
			String bName,aName;
			bName=scan.next();
			aName=scan.next();
			books[i]=new Book(bName,aName,orderISBN,orderQuantity);
		}
	}
}
	}
}

