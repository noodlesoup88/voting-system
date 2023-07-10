/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class election {
    private String title;
    private String date;
    private String location;
    private static List<candidate> candidates;
    private static Map<candidate, Integer> voteCount;

    public election(String title, String date, String location) {
        this.title = title;
        this.date = date;
        this.location = location;
        this.candidates = new ArrayList<>();
        this.voteCount = new HashMap<>();
    }

    public static void addCandidate(candidate candidate) {
        candidates.add(candidate);
        voteCount.put(candidate, 0);
    }

    public void castVote(candidate candidate) {
        if (candidates.contains(candidate)) {
            int currentVotes = voteCount.get(candidate);
            voteCount.put(candidate, currentVotes + 1);
            System.out.println("Vote cast successfully.");
        } else {
            System.out.println("Invalid candidate selection.");
        }
    }

    public static candidate getWinner() {
        candidate winner = null;
        int maxVotes = -1;

        for (Map.Entry<candidate, Integer> entry : voteCount.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            } else if (entry.getValue() == maxVotes) {
                winner = null; 
            }
        }

        return winner;
    }

    // Getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static List<candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<candidate> candidates) {
        this.candidates = candidates;
    }

    public Map<candidate, Integer> getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Map<candidate, Integer> voteCount) {
        this.voteCount = voteCount;
    }
}
