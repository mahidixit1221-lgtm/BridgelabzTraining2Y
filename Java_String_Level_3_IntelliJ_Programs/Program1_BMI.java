import java.util.Scanner;

public class Program1_BMI {
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeter = data[i][1] / 100.0;
            double bmi = weight / (heightMeter * heightMeter);

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(data[i][0]);
            result[i][1] = String.valueOf(data[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static String[][] makeTable(double[][] data) {
        return calculateBMI(data);
    }

    public static void display(String[][] result) {
        System.out.println("\nPerson\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < result.length; i++) {
            System.out.println((i + 1) + "\t" + result[i][0] + "\t"
                    + result[i][1] + "\t" + result[i][2] + "\t" + result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        display(makeTable(data));
        sc.close();
    }
}