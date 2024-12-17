package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Student {
	 private String studentID;
	    private String name;
	    private List<Course> registeredCourses;

	    
	    public Student(String studentID, String name) {
	        this.studentID = studentID;
	        this.name = name;
	        this.registeredCourses = new ArrayList<>();
	    }


	    public String getStudentID() {
	        return studentID;
	    }

	    public String getName() {
	        return name;
	    }

	    public List<Course> getRegisteredCourses() {
	        return registeredCourses;
	    }
	    public void registerForCourse(Course course) {
	        if (course.getEnrolledStudents() < course.getCapacity()) {
	            registeredCourses.add(course);
	            course.enrollStudent();
	            System.out.println("Registered for " + course.getTitle());
	        } else {
	            System.out.println("Course is full.");
	        }
	    }
	    public void dropCourse(Course course) {
	        if (registeredCourses.contains(course)) {
	            registeredCourses.remove(course);
	            course.removeStudent();
	            System.out.println("Dropped " + course.getTitle());
	        } else {
	            System.out.println("Not registered for this course.");
	        }
	    }

	    public void displayRegisteredCourses() {
	        System.out.println("Registered Courses:");
	        for (Course course : registeredCourses) {
	            System.out.println(course.getTitle());
	        }
	    }

}
