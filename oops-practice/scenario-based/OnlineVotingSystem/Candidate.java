public class Candidate {
    int candidateId;
    String name;
    int votes;

    public Candidate(int candidateId, String name) {
        this.candidateId = candidateId;
        this.name = name;
        this.votes = 0;
    }

    public void addVote() {
        votes++;
    }
}