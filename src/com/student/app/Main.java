package com.student.app;

public class Main {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------");
		System.out.println("        Welcome to the Student Management System!");
		System.out.println("-----------------------------------------------------");
		
		Student s1, s2, s3;
		s1 = new Student("Koustav", 35, "S-123");
//		System.out.println(s1);
//		s1.printStudentInfo();
		s1.enrollCourse("Java");
//		s1.enrollCourse("Java");
		s1.enrollCourse("Selenium");
//		s1.enrollCourse("Sel");
		s1.printStudentInfo();
		
		s2 = new Student("Leo", 30, "S-10");
		s2.enrollCourse("Java");
		s2.enrollCourse("Devops");
		s2.printStudentInfo();
		
		s2 = new Student("Messi", 32, "S-101");
		s2.enrollCourse("Selenium");
		s2.printStudentInfo();
		
		
	}

}
