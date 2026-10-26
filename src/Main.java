import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.class);
        String playerA = "";
        String playerB = "";
        String playAgain = "";
        boolean running = true;

        System.out.println("Rock Paper Scissors Game!");

        while (running) {

            while (true) {
                System.out.print("Player A enter move [R, P, S]: ");
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    break;
                }
                System.out.println("Error: wrong input. Try again.");
            }

            // Get player B move
            while (true) {
                System.out.print("Player B enter move [R, P, S]: ");
                playerB = in.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                    break;
                }
                System.out.println("Error: wrong input. Try again.");
            }


            playerA = playerA.toUpperCase();
            playerB = playerB.toUpperCase();


            if (playerA.equals(playerB)) {
                if (playerA.equals("R")) System.out.println("Rock vs Rock it's a Tie!");
                if (playerA.equals("P")) System.out.println("Paper vs Paper it's a Tie!");
                if (playerA.equals("S")) System.out.println("Scissors vs Scissors it's a Tie!");
            }

            else if (playerA.equals("R")) {
                if (playerB.equals("S")) {
                    System.out.println("Rock breaks Scissors, Player A wins!");
                } else {
                    System.out.println("Paper covers Rock, Player B wins!");
                }
            }

            else if (playerA.equals("P")) {
                if (playerB.equals("R")) {
                    System.out.println("Paper covers Rock, Player A wins!");
                } else {
                    System.out.println("Scissors cuts Paper, Player B wins!");
                }
            }

            else if (playerA.equals("S")) {
                if (playerB.equals("P")) {
                    System.out.println("Scissors cuts Paper, Player A wins!");
                } else {
                    System.out.println("Rock breaks Scissors, Player B wins!");
                }
            }


            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("N")) {
                running = false;
            }
            System.out.println();
        }
        System.out.println("Done playing!");
    }
}



