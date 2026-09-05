import java.util.Scanner;

class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number. Enter a natural number.");
            System.exit(0);
        }

        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                even[evenIndex++] = i;
            else
                odd[oddIndex++] = i;
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++)
            System.out.print(odd[i] + " ");

        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++)
            System.out.print(even[i] + " ");

        input.close();
    }
}
