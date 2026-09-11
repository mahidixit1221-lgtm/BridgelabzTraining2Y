import java.util.Scanner;

public class Program8_VotingEligibility {
    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void displayTable(String[][] result) {
        System.out.println("\nStudent\tAge\tCan Vote");
        for (int i = 0; i < result.length; i++) {
            System.out.println((i + 1) + "\t"
                    + result[i][0] + "\t"
                    + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        System.out.println("Enter age of 10 students:");
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
        }

        String[][] result = checkVoting(ages);
        displayTable(result);

        sc.close();
    }
}