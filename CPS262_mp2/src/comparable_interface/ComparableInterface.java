package comparable_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student implements Comparable<Student>{
	private int studentID;
	private String name;
	private double gpa;
	private static int ID = 1;
	
	public Student(String name, double gpa) {
		this.studentID = ID;
		ID++;
		this.name = name;
		this.gpa = gpa;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
//	public int compareTo(Student other) {
//		if (this.studentID > other.studentID) {
//			return 1;
//		} else if (this.studentID < other.studentID) {
//			return -1;
//		} else {
//			return 0;
//		}
//	}
	
	public int compareTo(Student other) {
		List<Character> alphabet = Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
		
		char firstLetter = this.getName().charAt(0);
		char otherFirstLetter = other.getName().charAt(0);
		
		if (alphabet.indexOf(firstLetter) > alphabet.indexOf(otherFirstLetter)) {
			return 1;
		} else if (alphabet.indexOf(firstLetter) < alphabet.indexOf(otherFirstLetter)) {
			return -1;
		} else {
			return 0;
		}
	}
	
	
	public String toString() {
		return "Name: " + name + " | GPA: " + gpa + " | Student ID: " + studentID;
	}
}

public class ComparableInterface {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Jack", 3.7));
		students.add(new Student("Billy", 2.0));
		students.add(new Student("Will", 2.7));
		students.add(new Student("Mary", 4.0));
		students.add(new Student("Sam", 3.2));
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		MySelectionSort.sortArray(students);
		System.out.println();
		System.out.println("Sorted.");
		System.out.println();
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		

	}

}
