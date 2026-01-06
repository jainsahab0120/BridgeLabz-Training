import java.util.ArrayList;
import java.util.List;

class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

class QuizResultProcessor {

    public int calculateScore(String[] correctAnswers, String[] userAnswers)
            throws InvalidQuizSubmissionException {

        if (correctAnswers.length != userAnswers.length) {
            throw new InvalidQuizSubmissionException(
                    "Answer count does not match the quiz questions"
            );
        }

        int score = 0;

        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }

        return score;
    }

    public String calculateGrade(int score, int totalQuestions) {
        int percentage = (score * 100) / totalQuestions;

        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }
}

public class QuizApplication {
    public static void main(String[] args) {

        String[] correctAnswers = {"A", "B", "C", "D", "A"};

        String[] user1Answers = {"A", "B", "C", "D", "A"};
        String[] user2Answers = {"A", "C", "C", "D", "B"};

        QuizResultProcessor processor = new QuizResultProcessor();
        List<Integer> userScores = new ArrayList<>();

        try {
            int score1 = processor.calculateScore(correctAnswers, user1Answers);
            userScores.add(score1);
            System.out.println("User 1 Score: " + score1);
            System.out.println("User 1 Grade: "
                    + processor.calculateGrade(score1, correctAnswers.length));

            int score2 = processor.calculateScore(correctAnswers, user2Answers);
            userScores.add(score2);
            System.out.println("User 2 Score: " + score2);
            System.out.println("User 2 Grade: "
                    + processor.calculateGrade(score2, correctAnswers.length));

        } catch (InvalidQuizSubmissionException e) {
            System.out.println("Submission Error: " + e.getMessage());
        }

        System.out.println("All User Scores: " + userScores);
    }
}
