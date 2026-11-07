package array;

import java.util.Scanner;

class CollegeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[][][] = new int[2][2][3];

        int overallHighest = 0;

        // Get marks
        for (int i = 0; i < 2; i++) {
            System.out.println("\nDepartment " + (i + 1));

            for (int j = 0; j < 2; j++) {
                System.out.println("Class " + (j + 1));

                for (int k = 0; k < 3; k++) {
                    System.out.print("Student " + (k + 1) + ": ");
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }

        
        for (int i = 0; i < 2; i++) {

            int deptHighest = 0;

            System.out.println("\nDepartment " + (i + 1));

            for (int j = 0; j < 2; j++) {

                int total = 0;

                System.out.println("\nClass " + (j + 1) + " Marks:");

                for (int k = 0; k < 3; k++) {

                    System.out.println("Student " + (k + 1)
                                       + ": " + marks[i][j][k]);

                    total += marks[i][j][k];

                    if (marks[i][j][k] > deptHighest) {
                        deptHighest = marks[i][j][k];
                    }

                    if (marks[i][j][k] > overallHighest) {
                        overallHighest = marks[i][j][k];
                    }
                }

                double average = total / 3.0;

                System.out.println("Class Total: " + total);
                System.out.println("Class Average: " + average);
            }

            System.out.println("Department Highest Mark: "
                               + deptHighest);
        }

   
        System.out.println("\nOverall Highest Mark: "
                           + overallHighest);

        sc.close();
    }
}