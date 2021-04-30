package javakampodev2;

public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getId() +" Instactor eklendi ..");
		
	}
	public void display(Instructor instructor) {
		System.out.println(instructor.getFirstName()
				+instructor.getInstructorLesson()
				+instructor.getId());
		
	}

}
