import java.util.Scanner;
public class Largest_of_3
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number :");
     int n1=sc.nextInt();
     
     System.out.println("Enter the number :");
     int n2=sc.nextInt();
     
     System.out.println("Enter the number :");
     int n3=sc.nextInt();
 
    if(n1>n2 && n1>n3)
     { 
       System.out.println("The number " + n1 + " is largest");
     }
   else if(n2>n1 && n2>n3)
     {
       System.out.println("The number " + n2 + " is largest");
     }
  else
     {
      System.out.println("The number " + n3 + " is largest");
     }
  
  }
}


     

       



