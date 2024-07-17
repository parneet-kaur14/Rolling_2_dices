import java.util.Random;

public class Randomenum {
    public static void main(String[] args) {
        
        Random number = new Random();

        int a = number.nextInt(6) + 1; //generates a number from 1 to 6 of die
        int b = number.nextInt(6) + 1; //generates a number from 1 to 6 of second die


        System.out.println("Two dices roled result in : " + a + "," + b);
        System.out.println("Sum of number rolled on 2 dices is: " + (a+b));
    }
}
