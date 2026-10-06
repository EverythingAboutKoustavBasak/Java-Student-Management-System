package com.student.app;

public class Main {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------");
		System.out.println("        Welcome to the Student Management System!");
		System.out.println("-----------------------------------------------------");
		
		Student s1;
		s1 = new Student("Koustav", 35, "S-123");
//		System.out.println(s1);
		s1.printStudentInfo();
	}

}
