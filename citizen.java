/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package votingsystem;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class citizen {
    private Map<String, Integer> candidates;
    
    public citizen() {
        candidates = new HashMap<>();
    }
    
    public void addCandidate(String name) {
        candidates.put(name, 0);
    }
    
    public void castVote(String candidateName) {
        if (candidates.containsKey(candidateName)) {
            int currentVotes = candidates.get(candidateName);
            candidates.put(candidateName, currentVotes + 1);
            System.out.println("Your vote has been recorded.");
        } else {
            System.out.println("Invalid candidate name.");
        }
    }
    
    public void printResults() {
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
    
    public static void main(String[] args) {
        citizen votingSystem = new citizen();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Voting System!");
        
        boolean done = false;
        while (!done) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add candidate");
            System.out.println("2. Cast vote");
            System.out.println("3. Print results");
            System.out.println("4. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Enter candidate name: ");
                    String candidateName = scanner.nextLine();
                    votingSystem.addCandidate(candidateName);
                    break;
                case 2:
                    System.out.print("Enter candidate name to vote: ");
                    String voteCandidate = scanner.nextLine();
                    votingSystem.castVote(voteCandidate);
                    break;
                case 3:
                    System.out.println("\nVoting Results:");
                    votingSystem.printResults();
                    break;
                case 4:
                    done = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        System.out.println("Thank you for using the Voting System!");
    }
}
