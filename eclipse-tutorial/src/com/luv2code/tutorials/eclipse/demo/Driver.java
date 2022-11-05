package com.luv2code.tutorials.eclipse.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author www.luv2code.com
 *
 */
public class Driver {

	private static final int MAX_STUDENTS = 5;
	private static String[] lastNames = {"Doe", "Smith", "Jones", "Adams", "Marshall", "Thompson", "Bradley", "Brown", "White", "Franklin", "Davis", "Cohn", "Clark"};
	private static String[] firstNames = {"Mary", "John", "Susan", "Michael", "David", "Lisa", "Wendy", "Diane", "Kelly", "Claire", "Elizabeth", "Mitchell", "Richard"};

	public static void main(String[] args) {
		
		// create an empty list
		List<Student> studentList = new ArrayList<Student>();

		// initialize random generator
		Random random = new Random();
		
		// create random number of students
		for (int i=0; i < MAX_STUDENTS; i++) {

			Student tempStudent = createRandomStudent(random);
			
			// add them to the list
			studentList.add(tempStudent);
		}
		
		// print out the students
		displayStudents(studentList);
	}

	private static void displayStudents(List<Student> studentList) {
		for (Student temp : studentList) {
			System.out.println(temp);
		}
	}

	private static Student createRandomStudent(Random random) {
		// get random first name
		int firstNameIndex = random.nextInt(firstNames.length);
		String tempFirstName = firstNames[firstNameIndex];
		
		// get random last name
		int lastNameIndex = random.nextInt(lastNames.length);
		String tempLastName = lastNames[lastNameIndex];
		
		// get random age
		int age = 18 + random.nextInt(20);
		
		// create student
		Student tempStudent = new Student(tempLastName, tempFirstName, age);
		return tempStudent;
	}

}
