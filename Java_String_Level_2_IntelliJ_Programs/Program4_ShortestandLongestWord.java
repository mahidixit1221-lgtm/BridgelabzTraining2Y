import java.util.Scanner;

public class Program4_ShortestLongest {
    public static int findLength(String text) {
        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return count;
    }

    public static String[] splitWords(String text) {
        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        int start = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                String word = "";

                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }

                words[wordIndex++] = word;
                start = i + 1;
            }
        }

        return words;
    }

    public static String[][] wordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static int[] findShortestLongest(String[][] table) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < table.length; i++) {
            int currentLength = Integer.parseInt(table[i][1]);
            int shortestLength = Integer.parseInt(table[shortestIndex][1]);
            int longestLength = Integer.parseInt(table[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordLengthTable(words);
        int[] indexes = findShortestLongest(table);

        System.out.println("Shortest word: " + table[indexes[0]][0]);
        System.out.println("Longest word: " + table[indexes[1]][0]);

        sc.close();
    }
}