/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author HP
 */
public class Constructor_Class {
    String name,gender;
    int phone;
    
    Constructor_Class(String n,String m, int p)
    {
        name=n;
        gender=m;
        phone=p;

    }


    
    void  display (){
    
        System.out.println("Name is:" + name);
        System.out.println("gender is:" + gender);
        System.out.println("phone is:" + phone);
    }
}
