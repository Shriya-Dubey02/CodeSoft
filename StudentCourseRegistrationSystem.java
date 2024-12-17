package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentCourseRegistrationSystem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      List<Course> courses = new ArrayList();
        courses.add(new Course("CS101", "Introduction to Computer Science", "Fundamentals of programming", 30, "9:00 AM"));
        courses.add(new Course("MATH201", "Calculus I", "Differential and integral calculus", 25, "1:00 PM"));



        Student student = new Student("12345", "John Doe");

       
        System.out.println("Available Courses:");
        for (Course course : courses) {
            course.displayCourseInfo();
        }
        System.out.print("Enter course code to register: ");
        String courseCode = scanner.nextLine();

        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                student.registerForCourse(course);
                break;
            }
        }

       System.out.print("Enter course code to drop: ");
        courseCode = scanner.nextLine();

        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                student.dropCourse(course);
                break;
            }
        }
        student.displayRegisteredCourses();

        scanner.close();
    }

}
