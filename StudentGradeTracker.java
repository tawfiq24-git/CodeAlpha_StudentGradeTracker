package studentgradetracker;
import java.util.Scanner;


public class StudentGradeTracker {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int n;
	        double sum = 0, average;
	        int highest, lowest;

	        System.out.print("Enter number of students: ");
	        n = sc.nextInt();

	        int marks[] = new int[n];
	        String names[] = new String[n];

	        // Input student details
	        for(int i = 0; i < n; i++) {

	            System.out.print("\nEnter name of student " + (i + 1) + ": ");
	            names[i] = sc.next();

	            System.out.print("Enter marks of " + names[i] + ": ");
	            marks[i] = sc.nextInt();
	        }

	        highest = marks[0];
	        lowest = marks[0];

	        // Calculate values
	        for(int i = 0; i < n; i++) {

	            sum += marks[i];

	            if(marks[i] > highest) {
	                highest = marks[i];
	            }

	            if(marks[i] < lowest) {
	                lowest = marks[i];
	            }
	        }

	        average = sum / n;

	        // Summary Report
	        System.out.println("\n========== STUDENT REPORT ==========");

	        for(int i = 0; i < n; i++) {
	            System.out.println("Student Name: " + names[i]);
	            System.out.println("Marks: " + marks[i]);
	            System.out.println("----------------------------");
	        }

	        System.out.println("Average Marks : " + average);
	        System.out.println("Highest Marks : " + highest);
	        System.out.println("Lowest Marks  : " + lowest);

	        sc.close();
	    }
}


