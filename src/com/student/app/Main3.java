package com.student.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main3 {
	
	private static List<Student> studentList;
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------");
		System.out.println("        Welcome to the Student Management System!");
		System.out.println("-----------------------------------------------------");
		
		studentList = new ArrayList<Student>();
		
		scanner = new Scanner(System.in);
		
		System.out.println("------------------------------------------");
		System.out.println("              Select an Option");
		System.out.println("------------------------------------------");
		System.out.println("1. Register a Student.");
		System.out.println("2. Find Student with Student ID.");
		System.out.println("3. List All Student Information.");
		System.out.println("4. List Student Information in Sorted Order.");
		System.out.println("5. Exit.");
		
//		int option = scanner.nextInt();
		int option = Integer.parseInt(scanner.nextLine().trim());

		
		switch (option) {
		case 1:
			enrollStudent(scanner);
			break;
		case 2:
			findStudentById(scanner);
			break;
		case 3:
			printAllStudentData();
			break;
		case 4:
			sortByName();
			break;
		case 5:
			exit();
			break;

		default:
			System.out.println("Invalid Option Selected. Please Select valid option from the list. Thank You!");
		}
		
		
		
//		Student result = findStudentById("S-101");
//		System.out.println(result);
//		
//		
//		sortByName();
		
	}
	
	
	private static void exit() {
		// TODO Auto-generated method stub
		
	}


	private static void printAllStudentData() {
		// TODO Auto-generated method stub
		
	}


	private static void findStudentById(Scanner scanner2) {
		// TODO Auto-generated method stub
		
	}


	private static void enrollStudent(Scanner scanner2) {
		System.out.println("Enter the Student Name. ");
		String studentName = scanner2.nextLine().trim();
		
		System.out.println("Enter the Student Age. ");
		int studentAge = Integer.parseInt(scanner.nextLine().trim());
		
		System.out.println("Enter the Student ID. ");
		String studentID = scanner.nextLine().trim();
		
		Student newStudent = new Student(studentName, studentAge, studentID);
		studentList.add(newStudent);
		
		System.out.println("Enter the course to be enrolled.");
		String courseName = scanner2.nextLine().trim();
		newStudent.enrollCourse(courseName);
		
		System.out.println("Student Added Successfully into the LMS.");
		
	}


	public static Student findStudentById(String studentId) {
		
		Student result = null;
		
		try {
			result = studentList.stream()
		   			.filter(x-> x.getStudentId().equalsIgnoreCase(studentId))
		   			.findFirst()
		   			.orElseThrow(()-> new RuntimeException());
		}catch(RuntimeException e) {
			System.err.println("Student with ID "+studentId+" not found");
		}
		
		return result;
		
	}
	
	public static void sortByName() {
		
		Comparator<Student> studentNameComparator = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
			
		};
		//if use lamda 
//		Comparator<Student> studentNameComparator =
//		        (o1, o2) -> o1.getName().compareTo(o2.getName());
		
		
		Collections.sort(studentList, studentNameComparator);
		System.out.println(studentList);
		
	}

}
