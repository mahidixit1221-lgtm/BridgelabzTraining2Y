import java.util.*;

public class MergeSort {
    static void merge(int[] a, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (a[i] < a[j]) temp[k++] = a[i++];
            else temp[k++] = a[j++];
        }
        while (i <= mid) temp[k++] = a[i++];
        while (j <= right) temp[k++] = a[j++];

        for (i = left, k = 0; i <= right; i++, k++) a[i] = temp[k];
    }

    static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        int[] price = new int[n];

        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++) price[i] = sc.nextInt();

        mergeSort(price, 0, n - 1);

        System.out.println("Sorted Prices:");
        for (int x : price) System.out.print(x + " ");
    }
}