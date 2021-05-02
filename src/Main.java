
public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"Java",0,"S�f�rdan Java Kamp�","Engin Demiro�");
		Course course2=new Course(2,"C#",0,"S�f�rdan C# Kamp�","Engin Demiro�");
		Course course3=new Course(3,"Programlamaya Yeni Ba�layanlar ��in Temel Kurs",0,"Temel Programlama E�itimi","Engin Demiro�");
		
		Course[]courses= {
				course1,course2,course3
		};
		
		Student student1=new Student(1,"�rem","Ayduman");
		Student student2=new Student(2,"Azra","Ayduman");
		
		Student[]student= {
				student1,student2
		};
		Instructor �nstructor1=new Instructor(1,"Engin","Demiro�");
		
		for(Course course : courses) {
			System.out.println("Kursun ad�: "+course.courseName+" Kursun E�itmeni: "+course.�nstructor);
		}
		System.out.println("----------------------------------");
		CourseManager courseManager=new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.updateToCourse(course1);
		courseManager.removeToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.updateToCourse(course2);
		courseManager.removeToCourse(course2);
		System.out.println("----------------------------------");
		StudentManager studentManager=new StudentManager();
		studentManager.addToStudent(student1);
		studentManager.updateToStudent(student1);
		studentManager.removeToStudent(student1);
		studentManager.addToStudent(student2);
		studentManager.updateToStudent(student2);
		studentManager.removeToStudent(student2);
		
		

	}

}
