package com.student.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main3 {
	
	private static List<Student> studentList;

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------");
		System.out.println("        Welcome to the Student Management System!");
		System.out.println("-----------------------------------------------------");
		
		studentList = new ArrayList<Student>();
		
		
		//Read input from terminal 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();
		System.out.println("You have entered the name "+name+" successfully");
		
		
		
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
