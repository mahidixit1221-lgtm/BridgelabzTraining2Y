import java.util.Scanner;

class StoreValuesAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        int index = 0;

        while (true) {
            if (index == numbers.length)
                break;

            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();

            if (number <= 0)
                break;

            numbers[index] = number;
            index++;
        }

        double total = 0.0;

        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + " = " + numbers[i]);
            total += numbers[i];
        }

        System.out.println("Sum = " + total);
        input.close();
    }
}
