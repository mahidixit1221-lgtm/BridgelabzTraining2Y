import java.util.Scanner;

public class Program7_CustomTrim {
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with leading/trailing spaces: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String customTrim = "";

        if (indexes[0] <= indexes[1]) {
            customTrim = createSubstring(text, indexes[0], indexes[1]);
        }

        String builtInTrim = text.trim();

        System.out.println("Custom trim: [" + customTrim + "]");
        System.out.println("Built-in trim: [" + builtInTrim + "]");
        System.out.println("Both are same: "
                + compareStrings(customTrim, builtInTrim));

        sc.close();
    }
}