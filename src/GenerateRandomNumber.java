import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Random rnd = new Random();
            int choice = rnd.nextInt(40);
            System.out.println("Computer Choice :" +choice);
            for(int i=0;i<16;i++)
            {
                System.out.println("Limit of computer choice is set to max 40 . Guess a number between 0 to 40 ");
                int user = in.nextInt();

                if(user<choice) {
                    System.out.println("Your choice is low");
                }
                else if(user>choice) {
                    System.out.println("Your choice is high");
                }
                else {
                    System.out.println("Your choice is Right");
                    break;
                }
            }
        }
    }
}