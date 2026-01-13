public class CourseRegistrationService implements RegistrationService {

    public void registerStudent(Student student) {
        System.out.println("Student registered: " + student.name);
    }

    public void enroll(Student student, Course course) throws CourseLimitExceededException {
        student.enrollCourse(course);
        System.out.println("Enrolled in course: " + course.courseName);
    }

    public void drop(Student student, Course course) {
        student.dropCourse(course);
        System.out.println("Dropped course: " + course.courseName);
    }

    public void displayStudentDetails(Student student) {
        System.out.println("Student: " + student.name);
        for (Course c : student.getEnrolledCourses()) {
            System.out.println("Course: " + c.courseName + " | Grade: " + c.grade);
        }
    }
}