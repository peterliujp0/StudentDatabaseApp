package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // Ask how many new students want to add
        System.out.println("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudent = in.nextInt();
        Student[] students = new Student[numOfStudent];

        // Create n number of new student
        for (int n = 0; n<numOfStudent; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        // to String
        for (int n = 0; n<numOfStudent; n++) {
            System.out.println(students[n].showInfo());
        }

    }
}
