public class BinarySearchTimeComplexity {

    public static void main(String[] args) {

        System.out.println("Binary Search Time Complexity");
        System.out.println();

        System.out.println("Sorted Array = {0, 2, 3, 4, 8, 61}");
        System.out.println("Target = 4");
        System.out.println();

        System.out.println("Step 1:");
        System.out.println("Search Range = 0 to 5");
        System.out.println("Middle Index = 2");
        System.out.println("Middle Element = 3");
        System.out.println("Since 4 > 3, search the right half.");
        System.out.println();

        System.out.println("Step 2:");
        System.out.println("Search Range = 3 to 5");
        System.out.println("Middle Index = 4");
        System.out.println("Middle Element = 8");
        System.out.println("Since 4 < 8, search the left half.");
        System.out.println();

        System.out.println("Step 3:");
        System.out.println("Search Range = 3 to 3");
        System.out.println("Middle Index = 3");
        System.out.println("Middle Element = 4");
        System.out.println("Target found!");
        System.out.println();

        System.out.println("Worst Case Equation:");
        System.out.println("N -> N/2 -> N/4 -> N/8 -> ... -> 1");
        System.out.println("Number of comparisons = log2(N)");
        System.out.println("Worst Case Time Complexity = O(log N)");
    }
}
