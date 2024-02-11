import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
       //Pseudocode of task
        // class Birth Month
         //       main{}//Start
        //Variable Declarations
       // birthMonth = num
        //Input birth month
       // output "What is your birth month: "
        //input birthMonth
        //if birthMonth =< 12 > 0 then
        //output "Your birth month is: " birthMonth
   //else
     //   output "You have entered an incorrect month value:"
       // end if
        //return{}//End Stop
        //end class

        Scanner in = new Scanner(System.in);

        //Declaration of Variables
        int birthMonth;
        String trash ="";
        System.out.print("Enter your birth month");

    if(in.hasNextDouble());
        {  //User input
            final int month1 = birthMonth;
            in.hasNextLine(); //Clears Buffer
            System.out.println("You said your birth month is: " + birthMonth);
            else
            {   //Okay to read as string
                trash = String.valueOf(in.hasNextLine());
                System.out.println("You entered in invalid data try again " + trash);

            }
        }




    }

}