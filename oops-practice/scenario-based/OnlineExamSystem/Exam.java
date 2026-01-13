
public class Exam implements EvaluationStrategy {

    String examName ;
    Student st;
    boolean isTimeExpired;


    Exam (String examName , boolean isTimeExpired){
        this.examName = examName;
        this.isTimeExpired = isTimeExpired;
        
    }
}