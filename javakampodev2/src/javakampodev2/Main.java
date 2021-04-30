package javakampodev2;

public class Main {

	public static void main(String[] args) {
		Student student =new Student();
		student.setLesson(" Java");
		student.setId(12);
		student.setFirstName(" Yusuf");
		student.setLastName(" Kukuş ");
		student.setBirthDate("1996");
		student.setEmail("yusuf@gmal.com");
		
		UserManager userManager=new UserManager();
		userManager.add(student);
		Instructor instructor = new Instructor();
		instructor.setBirthDate("19880");
		instructor.setEmail("engin@gmail.com");
		instructor.setId(15);
		instructor.setFirstName(" Engin demirog ");
		instructor.setLastName(" Demirog");
		instructor.setInstructorLesson(" Java");
		
		StudentManager studentManager=new StudentManager();
		studentManager.delete(student);
		
	InstructorManager instructorManager =new InstructorManager();
instructorManager.add(instructor);
instructorManager.display(instructor);
	}

}
