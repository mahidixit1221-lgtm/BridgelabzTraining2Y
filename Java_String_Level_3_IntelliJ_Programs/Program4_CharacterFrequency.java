import java.util.Scanner;

public class Program4_CharacterFrequency {
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) count++;
        }

        String[][] result = new String[count][2];
        int j = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[j][0] = String.valueOf((char)i);
                result[j][1] = String.valueOf(frequency[i]);
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("Character\tFrequency");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }

        sc.close();
    }
}