package dev.Lpa;
interface Player{}
record BaseballPlayer(String name,String position) implements Player{}
record FootballPlayer(String name,String position) implements Player{}
public class Main {
    public static void main(String[] args) {
        //creating new baseball Team
BaseballTeam phillies1=new BaseballTeam("Philadephia Phillies1");
BaseballTeam astros1=new BaseballTeam("Houston Astros1");
//calling score method to compare and check score
    scoreResult(phillies1,3,astros1,5);



    SportsTeam phillies=new SportsTeam("Philadephia Phillies");
        SportsTeam astros=new SportsTeam("Houston Astros");
        scoreResult(phillies,3,astros,5);

    //adding players
    var harper=new BaseballPlayer("B Harper","Right Fielder");
    var marsh=new BaseballPlayer("B Marsh","Right Fielder");
    phillies.addTeamMember(harper);
    phillies.addTeamMember(marsh);
    phillies.listTeamMembers();
//Creating a sports team and adding a Football PLayer
    SportsTeam  afc=new SportsTeam("Adelaide Crows");
    var tex=new FootballPlayer("Tex Walker","Center half forward");
    afc.addTeamMember(tex);
    //We can add BASEBALL & FOOTBALL player n SPORTS TEAM(AFC-football team)
    var gutherie=new BaseballPlayer("D Guthrie","Center Fielder");
    afc.addTeamMember(gutherie);
    afc.listTeamMembers();

    }
//Comparing score via set scoreMethod
    public static void scoreResult(BaseballTeam team1,int t1_score,BaseballTeam team2,int t2_score){
        String message =team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,message,team2);

    }

public static void scoreResult(SportsTeam team1,int t1_score,SportsTeam team2,int t2_score){
    String message =team1.setScore(t1_score,t2_score);
    team2.setScore(t2_score,t1_score);
    System.out.printf("%s %s %s %n",team1,message,team2);

}
}

