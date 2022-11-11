package Sirname;

import java.util.Scanner;


public class sir {
   public static void main(String[] args){
           /* ask for users (sir name)
         *then
         *create variable to store user name. 
         *system to automatically set name as variable 
          */
          
          try(Scanner input = new Scanner(System.in)){
            //ASK FOR SIR NAME FROM USER
            System.out.println("Enter Your SIR Name");
            //variable declaration
            var sirname = input.nextLine();
            //ASK FOR AGE FROM USER

            System.out.println("Enter Your Age");
            //variable declaration
            var age = input.nextInt();
            //variable declaration

            var AB = sirname.length();
            //MODULUS IS 2 BY 0
            String EvOd;
            if((age%2)==0){
                EvOd = "EVEN";
            }
            else{
                EvOd = "ODD";
            }
            //GIVE
            System.out.println("Total Number of letters in the SIR Name:" + AB);
            System.out.println("Your AGE IS :" + EvOd);

          }
    }
}
     