import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number.");
            System.exit(0);
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == factors.length) {
                    int[] temp = new int[factors.length * 2];

                    for (int j = 0; j < factors.length; j++)
                        temp[j] = factors[j];

                    factors = temp;
                }

                factors[index++] = i;
            }
        }

        System.out.print("Factors: ");
        for (int i = 0; i < index; i++)
            System.out.print(factors[i] + " ");

        input.close();
    }
}
