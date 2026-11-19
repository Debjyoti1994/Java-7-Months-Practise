package dev.Lpa;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> teamMember = new ArrayList<>();
    private int totalWin = 0;
    private int totalLoss = 0;
    private int totalTies = 0;


    public Team(String teamName) {
        this.teamName = teamName;
    }
    //adding Team Members
    public void addTeamMember(Player player){
        if (!teamMember.contains(player)){
            teamMember.add(player);
        }
    }
    //Printing out team Members
    public void listTeamMembers(){
        System.out.println(teamName+" Roster:");
        System.out.println(teamMember);
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
