package array;
import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[10];
        int highest = 0, lowest = 100;
        int pass = 0, fail = 0, total = 0;
        double average;

    
        System.out.println("Enter marks of 10 students:");

        for (int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();

            total += marks[i];

            if (marks[i] > highest)
                highest = marks[i];

            if (marks[i] < lowest)
                lowest = marks[i];

            if (marks[i] >= 35)
                pass++;
            else
                fail++;
        }

      
        System.out.println("\nStudent Marks:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) +
                               ": " + marks[i]);
        }

      
        average = total / 10.0;

      
        System.out.println("\nHighest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
        System.out.println("Average: " + average);
        System.out.println("Passed Students: " + pass);
        System.out.println("Failed Students: " + fail);

        sc.close();
    }
}