package dev.Lpa;

import java.util.ArrayList;
import java.util.List;
record Affiliation(String name, String type, String countryCode){
    @Override
    public String toString() {
        return name+ " ("+type+" in "+countryCode+")";
    }
}

public class Team<T extends Player,S> {
    private String teamName;
    private List<T> teamMember = new ArrayList<>();
    private int totalWin = 0;
    private int totalLoss = 0;
    private int totalTies = 0;
    private S affiliation;

    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation = affiliation;
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }
    //adding Team Members
    public void addTeamMember(T t){
        if (!teamMember.contains(t)){
            teamMember.add(t);
        }
    }
    //Printing out team Members
    public void listTeamMembers(){
        System.out.print(teamName+" Roster:");
        System.out.println((affiliation==null)?"":"AFFILIATON: "+affiliation);
        for (T t:teamMember){
            System.out.println(t.name());
        }
    }
    //Calculating Ranking of team;
    public int ranking(){
        return (totalLoss*2)+totalTies+1;
    }
    //Calculating loss,wins or ties
     public String setScore(int ourScore,int theirScore){
        String message="lost to";
        if(ourScore>theirScore){
            totalWin++;
            message="beat";

        } else if (ourScore==theirScore) {
            totalTies++;
            message="tied";

        }else{
            totalLoss++;
        }
        return message;

     }
   //Print out the team Name and ranking from Baseball Team toString method
    @Override
    public String toString() {
        return teamName+" (Ranked "+ranking()+" )";
    }
}
