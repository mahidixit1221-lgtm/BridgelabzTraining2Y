import java.util.*;

public class HeapSort {
    static void heapify(int[] a, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && a[left] > a[largest]) largest = left;
        if (right < n && a[right] > a[largest]) largest = right;

        if (largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a, n, largest);
        }
    }

    static void heapSort(int[] a) {
        int n = a.length;

        for (int i = n / 2 - 1; i >= 0; i--) heapify(a, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of applicants: ");
        int n = sc.nextInt();
        int[] salary = new int[n];

        System.out.println("Enter expected salaries:");
        for (int i = 0; i < n; i++) salary[i] = sc.nextInt();

        heapSort(salary);

        System.out.println("Sorted Salaries:");
        for (int x : salary) System.out.print(x + " ");
    }
}