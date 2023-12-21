import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor, or type '3' to quit:");
            
            // Check if the input is an integer
            if (sc.hasNextInt()) {
                int userInput = sc.nextInt();

                if (userInput == 3) {
                    playAgain = false;
                    System.out.println("Thanks for playing!");
                } else if (userInput < 0 || userInput > 3) {
                    System.out.println("Invalid choice. Please enter 0, 1, 2, or 3.");
                } else {
                    int computerInput = random.nextInt(3);

                    if (userInput == computerInput) {
                        System.out.println("Draw");
                    } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
                        System.out.println("You Win !!");
                    } else {
                        System.out.println("Computer Win !!");
                    }

                    // Display symbols for choices using Unicode escape sequences
                    String userSymbol = getSymbol(userInput);
                    String computerSymbol = getSymbol(computerInput);

                    System.out.println("Your Choice : " + userSymbol);
                    System.out.println("Computer's Choice : " + computerSymbol);
                }
            } else {
                // If the input is not an integer
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); 
            }
        }
        sc.close();
    }

    // Method to get symbols for choices
    public static String getSymbol(int choice) {
        switch (choice) {
            case 0:
                return "Rock"; 
            case 1:
                return "Paper"; 
            case 2:
                return "Scissor"; 
            default:
                return "";
        }
    }
}
