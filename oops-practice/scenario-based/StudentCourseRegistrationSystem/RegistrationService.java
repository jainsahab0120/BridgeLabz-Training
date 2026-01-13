public interface RegistrationService {
    void registerStudent(Student student);
    void enroll(Student student, Course course) throws CourseLimitExceededException;
    void drop(Student student, Course course);
    void displayStudentDetails(Student student);
}