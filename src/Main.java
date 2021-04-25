
public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1, "Java Kamp", "Engin Demiro�", 80, "java.jpg"); // yap�c� blok olusturduk
		Course course2=new Course(2, "C# Kamp", "Engin Demiro�", 70, "c#.jpg");
		Course course3=new Course(3, "Temel Kamp", "Engin Demiro�", 60, "temel.jpg");
		
		Course[] courses={course1,course2,course3};
		for(Course course : courses) {
			System.out.println(course.courseName + " & " + course.instructorName);
		}
		System.out.println("**********************************************");
		
		CourseManager courseManager=new CourseManager();
		courseManager.changeCourseName(" Python ", course3);
		courseManager.changeInstructorName(course2, " Mustafa Murat Co�gun");
		
		System.out.println("*******************************");
		
		Category category=new Category(1, "Programlama");
		 Category[] categories= {category};
		 for(Category category1 : categories) {
			 System.out.println(category.categoryName);
			 
		 }
		 
		 System.out.println("**************************");
		 
		 CategoryManager categoryManager= new CategoryManager();
		 categoryManager.changeCategoryName(category, " Tasar�m ");

	}

}
