/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloding_constructor;

/**
 *
 * @author HP
 */
public class mainmethod_constructor {
    public static void main(String [] arg){
        Constructor_Class ob = new Constructor_Class();
        ob.display();
        
        Constructor_Class ob2 =new Constructor_Class("rafid","male");
        ob2.display();
        
        Constructor_Class ob3 =new Constructor_Class("rafid","male");
        ob3.display();
        
        Constructor_Class ob4 =new Constructor_Class(222,"rafid","male");
        ob4.display();
    }
}
