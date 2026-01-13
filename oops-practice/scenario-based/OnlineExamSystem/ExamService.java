public class ExamService{

    private List<Exam> exams= new ArrayList<>();
    private List<Student> students= new ArrayList<>();
     

    // add 
    public void addStudent(Student st){
        students.add(st);
    }

    public void createExam(Exam exam){
        exams.add(exam);
    }

    // Answer Submission

    public void submitAnswers(Exam exam, List<Question> answers) throws ExamTimeExpiredException {
        // logic to check if exam time is expired
        boolean isTimeExpired = false; // Placeholder for actual time check
        if(isTimeExpired){
            throw new ExamTimeExpiredException("Exam time has expired");
        }
        // logic to submit answers
        System.out.println("Answers submitted for exam: " + exam.examName);
    }



}