import java.util.Scanner;
public class TestEx {
	  public static void main(String args[]) 
	    { 
		  int n;
		  Scanner sc=new Scanner(System.in);
	        try
	        { 
	        	n=sc.nextInt();
	            // Throw an object of user defined exception 
	            throw new MyException(n); 
	        } 
	        catch (MyException ex) 
	        { 
	            // Print the message from MyException object 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 
          }
