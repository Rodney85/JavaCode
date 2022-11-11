package Multiples;


public class multiply 
{
   public static void main(String[]args){
      System.out.print("\nThis are numbers divisible by 7 >>");
      for(int x=71; x<150; x++)
      {
        if (x%7==0)
        System.out.print(x + ' ');
      }

      
      System.out.print("\nThis are numbers divisible by 3 >>");
      for(int x=71; x<150; x++)
      {
        if (x%3==0)
        System.out.print(x + ' ');
      }


      System.out.print("\nThis are numbers divisible by 2 >>");
      for(int x=71; x<150; x++)
      {
        if (x%2==0)
        System.out.print(x + ' ');
      }
   }
}