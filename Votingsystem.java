/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;



    class Voting {
    private List<election> elections;
    private List<citizen> voters;
    private boolean VotingStarted;

    public Voting() {
        this.elections = new ArrayList<>();
        this.voters = new ArrayList<>();
        this.VotingStarted = false;
    }

    public void addElection(election election) {
        elections.add(election);
    }

    public void addVoter(citizen voter) {
        voters.add(voter);
    }

    public void startVoting() {
        if (VotingStarted) {
            System.out.println("Voting is already in progress.");
        } else {
            VotingStarted = true;
            System.out.println("Voting started.");
        }
    }

    public void endVoting() {
        if (VotingStarted) {
            VotingStarted = false;
            System.out.println("Voting ended.");
        } else {
            System.out.println("Voting is not in progress.");
        }
    }

    public void castVote(citizen voter, election election, candidate candidate) {
        /*if (!VotingStarted) {
            System.out.println("Voting is not in progress.");
        } else if (!voters.contains(voter)) {
            System.out.println("Invalid voter.");
        } else if (!elections.contains(election)) {
            System.out.println("Invalid election.");
        } else {*/
            election.castVote(candidate);
        
    }

    // Getters and setters

    public List<election> getElections() {
        return elections;
    }

    public void setElections(List<election> elections) {
        this.elections = elections;
    }

    public List<citizen> getVoters() {
        return voters;
    }

    public void setVoters(List<citizen> voters) {
        this.voters = voters;
    }

    public boolean isVotingStarted() {
        return VotingStarted;
    }

    public void setVotingStarted(boolean votingStarted) {
        VotingStarted = votingStarted;
    }
}
    public class Votingsystem {
    public static void main(String[] args) {
        Voting voting = new Voting();
        

        election election1 = new election("Election 1", "2023-08-01", "Location 1");
        election election2 = new election("Election 2", "2023-08-15", "Location 2");
        voting.addElection(election1);
        voting.addElection(election2);
        // Hardcoding values for the Map in the constructor
        Map<String, Integer> hardcodedData = new HashMap<>();
        hardcodedData.put("Key1", 10);
        hardcodedData.put("Key2", 20);
        hardcodedData.put("Key3", 30);
        
        // Creating an instance of MyClass with the hardcoded Map
        citizen voter1 = new citizen(hardcodedData);
        citizen voter2 = new citizen(hardcodedData);
        citizen voter3 = new citizen(hardcodedData);
        // Create and add voters
        /*citizen voter1 = new citizen();
        citizen voter2 = new citizen("tom", 1);
        citizen.addCandidate (voter1);
        citizen.addCandidate (voter2);*/

        // Start voting
        voting.startVoting();
        candidate c1 = new candidate();
        c1.addCandidate("candidate a");
        election.addCandidate(c1);
        candidate c2 = new candidate();
        c2.addCandidate("candidate b");
        election.addCandidate(c2);
        // Cast votes
        voting.castVote(voter1, election1, c1);
        c1.addCounter();
        voting.castVote(voter2, election1, c2);
        c2.addCounter();
        voting.castVote(voter3, election1, c1);
        c1.addCounter();
        
        voting.endVoting();
        c1.getresults();
        c2.getresults();
    }
    }

   
    

