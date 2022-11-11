package Calculator;

import java.util.Scanner;

public class Operations
{
    public static void main(String[]args){
       
    char operators;
    Double X1, X2, Total;

    /*       (STEPS)
     *  create an object of Scanner class
     *  ask users to enter numbers
     *  ask users to enter operator
     */
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    X1 = input.nextDouble();

     System.out.println("Choose an operator: +, -, *, or /");
     operators = input.next().charAt(0);


    System.out.println("Enter second number");
    X2 = input.nextDouble();

    switch (operators) {
        //  division 
      case '/':
      Total= X1 / X2;
        System.out.println(X1 + " / " + X2 + " = " + Total);
        break;

      // subtraction
      case '-':
        Total = X1 - X2;
        System.out.println(X1 + " - " + X2 + " = " + Total);
        break;

      // multiplication 
      case '*':
      Total= X1 * X2;
        System.out.println(X1 + " * " + X2 + " = " + Total);
        break;
        // addition 
      case '+':
      Total = X1 + X2;
      System.out.println(X1 + " + " + X2 + " = " + Total);
      break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
    }
}
    