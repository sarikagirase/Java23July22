package com.methods;

public class Student {
	String name="sarika";
	int rollno=120;
	public Student getStudent() {
		Student stud=new Student();
		System.out.println(stud);
		return stud;
	}
	
		
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}

 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Student student=new Student();
	 Student stud1= student.getStudent();
//	 System.out.println(stud1);

	}

}
