import java.util.Scanner;

public class Program6_FrequencyNestedLoops {
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;

            frequency[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') count++;
        }

        String[] result = new String[count];
        int k = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[k++] = chars[i] + " : " + frequency[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] result = findFrequency(text);

        for (String row : result) {
            System.out.println(row);
        }

        sc.close();
    }
}