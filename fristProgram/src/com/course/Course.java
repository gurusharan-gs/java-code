package com.course;

public class Course {
	
	static int maxCapacity = 100;
	
	String courseName;
	int enrollments;
	
	String[] enrollmentStudent;
	
	public Course(String courseName) {
		this.courseName = courseName;
		this.enrollments = 0;
		this.enrollmentStudent =  new String[maxCapacity];
	}
	

	static void setMaxCapacity(int maxCapacity) {
		Course.maxCapacity = maxCapacity;
	}

	void enrollStudent(String studentNmae) {
		enrollmentStudent[enrollments] = studentNmae;
		enrollments++;
	}
	
	void unenrollStudent(String studentNmae) {
		System.out.println("removed");
		enrollments--;
	}
	
	public static void main(String[] args) {
//		Course c1 = new Course();
	}
}
