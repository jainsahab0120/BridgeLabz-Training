public class StudentCourseApp {
    public static void main(String[] args) {

        RegistrationService service = new CourseRegistrationService();

        Student student = new Student(1, "Aryan");

        Course c1 = new Course(101, "Java");
        Course c2 = new Course(102, "DBMS");
        Course c3 = new Course(103, "OS");
        Course c4 = new Course(104, "CN");

        service.registerStudent(student);

        try {
            service.enroll(student, c1);
            service.enroll(student, c2);
            service.enroll(student, c3);
            service.enroll(student, c4); // exceeds limit
        } catch (CourseLimitExceededException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nStudent Details:");
        service.displayStudentDetails(student);

        service.drop(student, c2);

        System.out.println("\nAfter Dropping a Course:");
        service.displayStudentDetails(student);
    }
}