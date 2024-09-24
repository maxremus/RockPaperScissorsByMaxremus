import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String playerMove = "";
        Boolean playAgain = true;


        while (playAgain) {
            System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
            String playerChoice = scanner.nextLine();
            if (playerChoice.equals("r") || playerChoice.equals("rock")) {
                playerMove = ROCK;

            } else if (playerChoice.equals("p") || playerChoice.equals("paper")) {
                playerMove = PAPER;

            } else if (playerChoice.equals("s") || playerChoice.equals("scissors")) {
                playerMove = SCISSORS;

            } else {
                System.out.println("Invalid input. Try again...");
            }

            Random random = new Random();
            int computerRandomNumber = random.nextInt(4);
            String computerMove = "";

            switch(computerRandomNumber){
                case 0:
                    computerMove = ROCK;
                    break;
                case 1:
                    computerMove = PAPER;
                    break;
                case 2:
                    computerMove = SCISSORS;
                    break;

            }
            System.out.printf("The computer chose  %s.%n", computerMove);

            if (playerMove.equals(ROCK) && computerMove.equals(SCISSORS)
                    ||playerMove.equals(PAPER) && computerMove.equals(ROCK)
                    || playerMove.equals(SCISSORS) && computerMove.equals(PAPER)){
                System.out.println("You win.");
            } else if (playerMove.equals(ROCK) && computerMove.equals(PAPER)
                    || playerMove.equals(PAPER) && computerMove.equals(SCISSORS)
                    || playerMove.equals(SCISSORS) && computerMove.equals(PAPER) ) {
                System.out.println("You lose.");
            } else {
                System.out.println("This game was a draw.");
            }
            System.out.println("Game over");


            System.out.println("Play again? (y/n)");
            String choise = scanner.nextLine();

            if (!choise.equals("y") && !choise.equals("yes")) {
                System.out.println("Choose [r]ock, [p]aper or [s]cissors:");
                playAgain = false;
                System.out.println("Play again");
            }
        }

    }

}
