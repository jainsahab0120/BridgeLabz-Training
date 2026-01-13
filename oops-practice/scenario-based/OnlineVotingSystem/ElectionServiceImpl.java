import java.util.*;

public class ElectionServiceImpl implements ElectionService {

    private List<Voter> voters = new ArrayList<>();
    private List<Candidate> candidates = new ArrayList<>();
    private List<Vote> votes = new ArrayList<>();

    public void registerVoter(Voter voter) {
        voters.add(voter);
        System.out.println("Voter registered: " + voter.name);
    }

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
        System.out.println("Candidate added: " + candidate.name);
    }

    public void castVote(Voter voter, Candidate candidate)
            throws DuplicateVoteException {

        if (voter.hasVoted) {
            throw new DuplicateVoteException("Voter has already voted");
        }

        voter.hasVoted = true;
        candidate.addVote();
        votes.add(new Vote(voter, candidate));

        System.out.println(
            voter.name + " voted for " + candidate.name
        );
    }

    public void declareResult() {
        System.out.println("\nElection Results:");
        for (Candidate c : candidates) {
            System.out.println(c.name + " : " + c.votes + " votes");
        }
    }
}