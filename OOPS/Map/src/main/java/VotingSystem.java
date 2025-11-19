import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        // Simulate 10 votes (random)
        String[] candidates = {"Aman", "Riya", "Kunal"};

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            String voteTo = candidates[r.nextInt(candidates.length)];

            // increment vote
            votes.put(voteTo, votes.getOrDefault(voteTo, 0) + 1);
        }

        // Print all votes
        System.out.println("Vote Count:");
        for (String c : votes.keySet()) {
            System.out.println(c + " -> " + votes.get(c));
        }

        // Find winner
        String winner = "";
        int maxVotes = -1;

        for (Map.Entry<String, Integer> e : votes.entrySet()) {
            if (e.getValue() > maxVotes) {
                maxVotes = e.getValue();
                winner = e.getKey();
            }
        }

        System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes");
    }
}
