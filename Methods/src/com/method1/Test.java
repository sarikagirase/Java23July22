package com.method1;

public class Test {
	public Student getStudent() {
		String name="sarika";
		int rollno=20;
		long moNumber=8999079828l;
		Student stud=new Student(name,rollno,moNumber);
		return  stud;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		Student student=test.getStudent();
		System.out.println("Name>>"+student.name);
		System.out.println("RollNo>>"+student.rollno);
		System.out.println("Mo Number>>"+student.moNumber);

	}

}
