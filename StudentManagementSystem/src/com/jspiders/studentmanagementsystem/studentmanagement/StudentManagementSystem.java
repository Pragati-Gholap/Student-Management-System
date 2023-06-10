package com.jspiders.studentmanagementsystem.studentmanagement;

import java.util.ArrayList;
import java.util.List;

import com.jspiders.studentmanagementsystem.student.Student;

public class StudentManagementSystem {
	
	private List<Student>students;
	
	public StudentManagementSystem()
	{
		students=new ArrayList<Student>();
		
	}
	public void addstudent(Student student)
	{
		students.add(student);
		System.out.println("student added successfully");
	}
	
	public void removeStudent(int studentId)
	{
		boolean removed=false;
		for(Student student:students)
		{
			if(student.getId()==studentId)
			{
				students.remove(student);
				removed=true;
				break;
			}
		}
		if(removed)
		{
			System.out.println("student removed sucessfully!");
		}
		else
		{
			System.out.println("student not found!");
		}
		
		   System.out.println("list of students");
			for(Student student:students)
			{
				System.out.println("ID"+student.getId());
				System.out.println("Name"+student.getName());
				System.out.println("Age:"+student.getAge());
			}
		}
	}
	
	 


