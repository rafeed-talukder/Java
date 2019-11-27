/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author HP
 */
public class Employee {
	String name;
	int id;
	String designation;
	double salary;
	
	public Employee(String n,int i,String desig,double sal) {
		
		name=n;
		id=i;
		designation=desig;
		salary=sal;
	}
	
	void UpdateSalary(double sal) {
                
		salary=sal;
		System.out.println("Updated Salary = "+salary);
                
	} 
	
	double getSalary() {
		return salary;
//                return sal;
                
	}
	void display() {
		System.out.println("Name:"+name);
                System.out.println("id:"+id);
                System.out.println("designation:"+designation);
                System.out.println("salary:"+salary);
	}

}