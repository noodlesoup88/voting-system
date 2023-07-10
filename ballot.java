/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

/**
 *
 * @author Prof.Katana
 */
public class ballot {
    private String voter;
    private String election;
    private String selectedCandidate;

    public ballot(String voter, String election, String selectedCandidate) {
        this.voter = voter;
        this.election = election;
        this.selectedCandidate = selectedCandidate;
    }

    public String getVoter() {
        return voter;
    }

    public String getElection() {
        return election;
    }

    public String getSelectedCandidate() {
        return selectedCandidate;
    }
}
