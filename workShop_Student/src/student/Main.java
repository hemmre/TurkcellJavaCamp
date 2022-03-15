package student;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1= new Student(1,"Huseyin","Emre","123");
		Student student2= new Student(2,"Furkan","Ozgun","222");
		Student student3= new Student(3,"Engin","Demırog","323");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		
		for (Student student : studentManager.getAll()) {
			System.out.println(student.getFirstName());
		}
		studentManager.delete(1);
		
		System.out.println("After delete process");
		
		for (Student student : studentManager.getAll()) {
			System.out.println(student.getFirstName());
		}
		
		studentManager.add(student1);
		
		for (Student student : studentManager.getAll()) {
			System.out.println(student.getFirstName());
		}
		
	}

}
