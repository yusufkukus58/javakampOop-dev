
public class CourseManager {
	public void changeCourseName(String newcourseName, Course course1) {
		course1.courseName=newcourseName;
		System.out.println("Yeni Kurs Adi" + newcourseName);
	}
	public void changeInstructorName(Course course , String newinstuctorName) {
		course.instructorName=newinstuctorName;
		System.out.println("Yeni Eðitmen Adi:" + newinstuctorName);
	}

}
