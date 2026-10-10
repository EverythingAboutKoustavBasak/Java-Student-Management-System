package com.student.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
	
	private static List<Student> studentList;

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------");
		System.out.println("        Welcome to the Student Management System!");
		System.out.println("-----------------------------------------------------");
		
		studentList = new ArrayList<Student>();
		
		
		Student s1, s2, s3, s4;
		
		s1 = new Student("Koustav", 35, "S-123");
		s1.enrollCourse("Java");
		s1.enrollCourse("Selenium");

		
		s2 = new Student("Leo", 30, "S-10");
		s2.enrollCourse("Java");
		s2.enrollCourse("Devops");

		
		s3 = new Student("Messi", 32, "S-101");
		s3.enrollCourse("Selenium");
		
		s4 = new Student("Adda", 32, "S-101");
		
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		
//		System.out.println(studentList);
		
		Student result = findStudentById("S-101");
		System.out.println(result);
		
		sortByName();
		
		
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
