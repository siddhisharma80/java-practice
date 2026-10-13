import java.util.Scanner;

public class Calculator {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter fist number : ");
        double a = sc.nextDouble();
        System.out.println("Enter second number :");
        double b = sc.nextDouble();
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println( "3. multiply");
        System.out.println("4. Divide");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 :
            System.out.println("Result = " + (a+b));
            break ;
            case 2 :
            System.out.println("Result = " + (a-b));
            break;
            case 3 :
            System.err.println("Result = " + (a*b));
            break;
            case 4:
            if (b !=0) { 
            System.err.println("Result " + (a/b));
            }
            else
            {
                System.out.println("cannot divided by zero");

            }
break;
default :
System.out.println("Invalid choice ");
        }
        sc.close();


        }
}