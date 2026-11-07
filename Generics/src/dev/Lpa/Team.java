package dev.Lpa;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Player>{
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }
    ///Adding T to the list if T(T) is not present in the list
    public void addTeamMember(T t) {
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }
//Printing out all elements on this list
    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        for (T t:teamMembers){
            System.out.println(t.name());
        }
    }
//Assingning points
    public int ranking() {
        return (totalLosses * 2) + totalTies + 1;
    }
//Checkiing score no wins,losses and ties
    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";

        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName+ " (Ranked "+ranking()+" )";
    }
}
