package com.student.app;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

	private String name;
	private int age;
	private String studentId;
	private List<String> courses;
	
	public Student(String name, int age, String studentId) {
		super();
		if(validateAge(age) && validateName(name) && validateStudentID(studentId)) {
			this.name = name;
			this.age = age;
			this.studentId = studentId;
			
			courses = new ArrayList<String>(); //initialization of courses
		}
		
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + ", courses=" + courses + "]";
	}
	
	
	public void enrollCourse(String course) {
		courses.add(course);
		System.out.println("Student is enrolled to the course - "+course+" sucessfully...");
	}
	
	public void printStudentInfo() {
		System.out.println("==================Student Information==================");
		System.out.println("Student Name: "+name);
		System.out.println("Student age: "+age);
		System.out.println("Student ID: "+studentId);
		System.out.println("Enrolled for: "+courses);
	}
	
	
	//validation method
	public boolean validateAge(int age) {
		if(age>=19 && age<=35) {
			return true;
		}
		else {
			System.err.println("Invalide Age! Student age needs to be b/w 19 and 35.");
			return false;
		}
		
	}
	
	public boolean validateName(String name) {
		String nameRegex ="^[a-zA-Z ]+$";
		Pattern namePattern = Pattern.compile(nameRegex);
		Matcher nameMatcher = namePattern.matcher(name);
		
		if(nameMatcher.matches()) {
			return true;
		}
		else {
			System.err.println("Inavlid Name! Please enter alphabets only for name");
			return false;
		}
	}
	
	public boolean validateStudentID(String studentId) {
		String studentRegex = "^S-[0-9]+$";
		Pattern studentIdPattern = Pattern.compile(studentRegex);
		Matcher studentIdMatcher = studentIdPattern.matcher(studentId);
		
		if(studentIdMatcher.matches()) {
			return true;
		}
		else {
			System.err.println("Invalid Student ID! Please enter right student id (like S-1234)");
			return false;
		}
	}
	
	
	
}
