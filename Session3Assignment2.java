

// Write a Java statement to assign the value true to the boolean variable same , when the String variable S1 has the same contents as the String variable S2 , and false otherwise.

import java.util.Scanner;
public class Session3Assignment2
{
    public static void main(String [] args) 
    {

       Scanner sc = new Scanner(System.in);      
       String S1, S2;
       boolean same;
     
       System.out.print("Enter the value of string S1: ");
       S1 = sc.next();
       System.out.print("Enter the value of string S2: ");
       S2 = sc.next();     
       
       if (S1.equals(S2))
           same =  true;
        else 
            same = false;   

        System.out.println("The value of variable called same is : "+ same);

    }
}
        