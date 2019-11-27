/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd_even;

public class O_E_objects {
    public static void main(String[] arg){
    
        odd_even oddeven =new odd_even();
        oddeven.sum=0;
        oddeven.i=1;
        for(oddeven.i=1;oddeven.i<=6;oddeven.i++)
        {
         if(oddeven.i%2==0)
         {
          oddeven.sum =oddeven. sum+oddeven.i;
          oddeven.ckeck();
          oddeven.evensum();
//          System.out.println("number is :" +oddeven.sum  );
             
         }
         else{
//                   oddeven.sum =oddeven. sum+oddeven.i;
                   oddeven.check2();
//                   oddeven.oddsum();
//             System.out.println("ff" );
         }  
        }
    }
}
