package average;
import java.util.Scanner;

public class results {
 // DECLARE VARIABLES
static int E_1,E_2,E_3,E_4,E_5,AVERAGE;
 public static void main(String[]args){
        //creating SCnner object
        try(Scanner input = new Scanner(System.in)){
         
            //ASK USER FOR EACH EXAM RESULTS
            System.out.println("Enter Results For Exam One");
            E_1 = input.nextInt();
            System.out.println("Enter Results For Exam Two");
            E_2 = input.nextInt();
            System.out.println("Enter Results For Exam Three");
            E_3 = input.nextInt();
            System.out.println("Enter Results For Exam Four");
            E_4 = input.nextInt();
            System.out.println("Enter Results For Exam Five");
            E_5 = input.nextInt();
    
            //GET THE AVERAGE
            AVERAGE = (E_1 + E_2 + E_3 + E_4 + E_5)/5;
          
            System.out.printf("The Average of the Exams is\n", AVERAGE);
   
        }
 
     }
    
}
