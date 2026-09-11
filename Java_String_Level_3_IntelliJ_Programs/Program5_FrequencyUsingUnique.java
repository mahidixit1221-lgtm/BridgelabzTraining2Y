import java.util.Scanner;

public class Program5_FrequencyUsingUnique {
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) temp[count++] = text.charAt(i);
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) result[i] = temp[i];

        return result;
    }

    public static String[][] findFrequency(String text, char[] unique) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(frequency[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] unique = uniqueCharacters(text);
        String[][] result = findFrequency(text, unique);

        System.out.println("Character\tFrequency");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }

        sc.close();
    }
}