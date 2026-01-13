public class Voter {
    int voterId;
    String name;
    boolean hasVoted;

    public Voter(int voterId, String name) {
        this.voterId = voterId;
        this.name = name;
        this.hasVoted = false;
    }
}