import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] age = new int[n];

        System.out.println("Enter ages (10 to 18):");
        for (int i = 0; i < n; i++) age[i] = sc.nextInt();

        int[] count = new int[9];

        for (int i = 0; i < n; i++) {
            count[age[i] - 10]++;
        }

        System.out.println("Sorted Ages:");
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                System.out.print((i + 10) + " ");
            }
        }
    }
}