package student;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	
	public void add(Student newStudent) {
		
		for(Student student : students) {
			if(student.getId()==newStudent.getId()) {
				System.out.println("The student with this ID number is already registered !");
				return;
			}
		}
		
		this.students.add(newStudent);
		System.out.println("Student " + newStudent.getFirstName() + newStudent.getLastName() +" added.");
			
	}
	
	public void delete(int id) 
	{
		Student deleteStudent=new Student();
	
		for (Student student : students) {
			if(student.getId()==id) {
				deleteStudent=student;
			}
		}
		System.out.println("Student " + deleteStudent.getFirstName() + deleteStudent.getLastName() + " is deleted!");
		students.remove(deleteStudent);
	}
	
	public void update(Student updateStudent) 
	{
		for (Student student : students) {
			if(student.getId() == updateStudent.getId()) {
				
				students.set(students.indexOf(student), updateStudent);
				System.out.println("Student " + student.getId() + " is updated");
				break;				
			}		
		}
	}
	
	public ArrayList<Student> getAll() 
	{
		return this.students;
	}
	
}
