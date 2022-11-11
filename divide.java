package DivisiblyTest;

import java.util.Scanner;

public class divide {
    public static void main(String[]args){
        //declare a variable
        try(Scanner input = new Scanner(System.in)){
            int Dt;
        System.out.print("Enter The Number of your Choice\n");
        
        Dt= input.nextInt();
        // for statement

        System.out.println(Dt + "Its Disible by\n");
        for(int i=1;i<=Dt;i++){
            if(Dt % i == 0)
            System.out.print(i +" ");
        }
        }
    }
}
