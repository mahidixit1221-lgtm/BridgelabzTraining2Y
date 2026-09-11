import java.util.Scanner;

public class Program9_RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("Rock") && computer.equals("Scissors"))
                || (user.equals("Paper") && computer.equals("Rock"))
                || (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        }

        return "Computer";
    }

    public static String[][] getStats(int userWins, int computerWins, int draws,
                                      int games) {
        double userPercentage = (userWins * 100.0) / games;
        double computerPercentage = (computerWins * 100.0) / games;

        return new String[][]{
                {"User Wins", String.valueOf(userWins),
                 String.format("%.2f%%", userPercentage)},
                {"Computer Wins", String.valueOf(computerWins),
                 String.format("%.2f%%", computerPercentage)},
                {"Draws", String.valueOf(draws), "—"}
        };
    }

    public static void displayResults(String[][] results) {
        System.out.println("\nResult\t\tCount\tPercentage");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t"
                    + results[i][1] + "\t"
                    + results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (int i = 1; i <= games; i++) {
            System.out.println("\nGame " + i);
            System.out.print("Enter Rock, Paper or Scissors: ");
            String user = sc.next();

            user = user.substring(0, 1).toUpperCase()
                    + user.substring(1).toLowerCase();

            String computer = getComputerChoice();
            String winner = findWinner(user, computer);

            System.out.println("Computer choice: " + computer);
            System.out.println("Winner: " + winner);

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        String[][] stats = getStats(userWins, computerWins, draws, games);
        displayResults(stats);

        sc.close();
    }
}