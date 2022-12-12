package ie.atu;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        Student student1 = new Student();

        System.out.println("Enter student name: ");
        Scanner input = new Scanner(System.in);
        student1.setName(input.nextLine());
        System.out.println("Enter student address: ");
        student1.setAddress(input.nextLine());
        System.out.println("Enter student age: ");
        student1.setAge(input.nextInt());
        System.out.println("Enter student idNumber: ");
        student1.setIdnumber(input.nextInt());

        System.out.println("Student details: \n" + student1);

    }
}
