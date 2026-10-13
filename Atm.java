import java.util.Random;
public class  Atm {
    public static void main(String[]args)
    {
        Random r = new Random();
        int lastFour = 1000 + r.nextInt(9000);
        System.out.println("Welcome to ATM");
       // System.out.println("Account Number : XXXX XXXX " + lastFour);
System.out.println("account  no : 1234 5678 " +   lastFour );
    }

    
}
