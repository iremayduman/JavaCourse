
public class CourseManager {

	public void addToCourse(Course course) {
		System.out.println("Kurs eklendi. "+course.courseName);
	}
	public void removeToCourse(Course course) {
		System.out.println("Kurs silindi. "+course.courseName);
	}
	public void updateToCourse(Course course) {
		System.out.println("Kurs güncellendi. "+course.courseName);
	}
}
