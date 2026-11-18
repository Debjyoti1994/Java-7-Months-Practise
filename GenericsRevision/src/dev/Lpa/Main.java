package dev.Lpa;
record BaseballPlayer(String name,String position){}
public class Main {
    public static void main(String[] args) {
        //creating new baseball Team
BaseballTeam phillies=new BaseballTeam("Philadephia Phillies");
BaseballTeam astros=new BaseballTeam("Houston Astros");
//calling score method to compare and check score
    scoreResult(phillies,3,astros,5);
    //adding players
    var harper=new BaseballPlayer("B Harper","Right Fielder");
    var marsh=new BaseballPlayer("B Marsh","Right Fielder");
    phillies.addTeamMember(harper);
    phillies.addTeamMember(marsh);
    phillies.listTeamMembers();
    }
//Comparing score via set scoreMethod
    public static void scoreResult(BaseballTeam team1,int t1_score,BaseballTeam team2,int t2_score){
        String message =team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,message,team2);

    }
}
