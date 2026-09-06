import java.util.Scanner;

class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();

            if (marks[i][0] < 0 || marks[i][1] < 0 ||
                marks[i][2] < 0) {
                System.out.println("Marks cannot be negative!");
                i--;
                continue;
            }

            percentage[i] = (marks[i][0] + marks[i][1] +
                    marks[i][2]) / 3;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 80)
                grade[i] = 'B';
            else if (percentage[i] >= 70)
                grade[i] = 'C';
            else if (percentage[i] >= 60)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        System.out.println("P\tC\tM\tPercentage\tGrade");

        for (int i = 0; i < n; i++)
            System.out.println(marks[i][0] + "\t" + marks[i][1] +
                    "\t" + marks[i][2] + "\t" + percentage[i] +
                    "\t\t" + grade[i]);

        sc.close();
    }
}