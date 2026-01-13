import java.util.*;

public class Student extends Person {

    private List<Course> enrolledCourses = new ArrayList<>();
    private static final int MAX_COURSES = 3;

    public Student(int id, String name) {
        super(id, name);
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(Course course) throws CourseLimitExceededException {
        if (enrolledCourses.size() >= MAX_COURSES) {
            throw new CourseLimitExceededException("Course limit exceeded");
        }
        enrolledCourses.add(course);
    }

    public void dropCourse(Course course) {
        enrolledCourses.remove(course);
    }
}