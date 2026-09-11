import java.util.Scanner;

public class Program10_PCMScorecard {
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = 10 + (int)(Math.random() * 90);
            scores[i][1] = 10 + (int)(Math.random() * 90);
            scores[i][2] = 10 + (int)(Math.random() * 90);
        }

        return scores;
    }

    public static double[][] calculateResult(int[][] scores) {
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    public static void displayScorecard(int[][] scores, double[][] result) {
        System.out.println("\nStudent\tPhy\tChem\tMath\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < scores.length; i++) {
            String grade = getGrade(result[i][2]);

            System.out.println((i + 1) + "\t"
                    + scores[i][0] + "\t"
                    + scores[i][1] + "\t"
                    + scores[i][2] + "\t"
                    + (int) result[i][0] + "\t"
                    + result[i][1] + "\t"
                    + result[i][2] + "%\t\t"
                    + grade);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] result = calculateResult(scores);

        displayScorecard(scores, result);

        sc.close();
    }
}