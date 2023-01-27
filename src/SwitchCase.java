import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("enter your division");
            int div = in.nextInt();
            switch(div) {
                case 1:
                    System.out.println("You got 1st rank");
                    break;
                case 2:
                    System.out.println("You got 2nd");
                    break;
                case 3:
                    System.out.println("You got 3rd");
                    break;
                case 4 :
                    System.out.println("You got 4th rank");
                    break;
                case 5 :
                    System.out.println("You got 5th rank");
                    break;
                default:
                    System.out.println("No Rank");
            }
        }
    }
}