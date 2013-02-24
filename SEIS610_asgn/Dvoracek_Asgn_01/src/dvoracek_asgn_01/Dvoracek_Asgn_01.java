
package dvoracek_asgn_01;

/**
 *SEIS 610: Software Engineering
 * @author Chad Dvoracek
 * Assignment #1
 * Due Date: March 2nd
 * 
 */

import javax.swing.JOptionPane;
public class Dvoracek_Asgn_01 {

     /**
     * @param args the command line arguments
     * Target Function(Fitness Function): Y = (5x^2-5)/4
     *
     * Random Functions are:  Y=(2x^2+2)/6 and Y=(8x^2-9)/9 
     * 
     */
    public static void main(String[] args) {
    // TODO code application logic here
    // assign variables 
     int n,x, r1score, r2score;
     String testset1, testset2;
     double target,random1,random2,test1,test2 ;
     
     //initialize variables
     r1score=0;
     r2score=0;
     x=0;
   
     //Loop statement to test values.
     
     while (x<=5)
     { 
     target= (5*(Math.pow(x,2))-5)/4;
     random1= (2*(Math.pow(x,2))+2)/6;
     random2= (2*(Math.pow(x,2))-9)/9;
     
     test1= Math.abs (target-random1);
     test2= Math.abs(target-random2);
     
     /** Testing Values Code 
     *  JOptionPane.showMessageDialog (null,"Value of test1 = "+test1);
     *  JOptionPane.showMessageDialog (null,"Value of test2 = "+test2);
     */  
     
     //Asign numerical values to the winner of each test set
          
     if (test1<test2) {
        r1score++;
            }
     else {
        r2score++;
            }
    
     //test counting of rscore values
     JOptionPane.showMessageDialog (null,"Value of r1score = "+r1score);
     JOptionPane.showMessageDialog (null,"Value of r2score = "+r2score);
    
     //testing output
    //testset1=
     
     /** testing calculation comparison of formulas 
     *  System.out.println ("this is the value of target1 "+target);
     *  System.out.println ("this is the value of random1 "+random1);
     *  System.out.println ("this is the value of random2 "+random2);
     */
     
 
     //Capturing Test Set Data 
     
    String [] TestSetOutput1 = new String[x]; 
    String [] TestSetOutput2 = new String[x];  
    n=x;
    
    
    x++;
     
     
     
     
     }
     System.out.println ("this is the value x1 "+x1);
     System.out.println ("The End");
    }
}
