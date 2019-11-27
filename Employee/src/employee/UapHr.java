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
public class UapHr {
    	public static void main(String[] args) {
		
		Employee emp1=new Employee("MAM",1010,"Professor",150000);
		
		emp1.getSalary();

		emp1.UpdateSalary(170000);
		emp1.display();
	}

}
