package javakampodev2;

public class StudentManager  {
	public void delete(Student student) {
		System.out.println(student.getLesson()+" Ders sillindi..");
	}
	public void display(Student student) {
		System.out.println(student.getFirstName()
				+student.getEmail()
				+student.getLastName());
	}

}
