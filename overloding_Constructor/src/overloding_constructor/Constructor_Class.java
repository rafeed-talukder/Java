/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloding_constructor;

public class Constructor_Class {
     int id;
    String name,gender;

    
    
    Constructor_Class(){
        System.out.println("nothing");
    }
    Constructor_Class(String n,String g){
        name=n;
        gender=g;
    }
//    
//    Constructor_Class(String n,String g,int i){
//        name=n;
//        gender=g;
//        id=i;
//    }
   Constructor_Class(int i,String m,String c){
        id=i;   
        name=m;
        gender=c;
        
    }
    
    void display(){
        System.out.println("name=" + name);
         System.out.println("gender=" + gender);
          System.out.println("id=" + id);
    }
}
