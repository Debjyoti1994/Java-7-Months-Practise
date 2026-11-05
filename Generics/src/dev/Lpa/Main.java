package dev.Lpa;

interface Player{}
record BaseballPlayer(String name,String position) implements Player{}
record FootballPlayer(String name,String position) implements Player{}

public class Main {
    public static void main(String[] args) {
        BaseballTeam phillies1=new BaseballTeam("Philadelphia Phillis");
        BaseballTeam astros1=new BaseballTeam("Houston Astros");
   scoreResult(phillies1,3,astros1,5);
//Sports Team
   SportsTeam phillies =new SportsTeam("Philadelphia Phillis");
        SportsTeam astros=new SportsTeam("Houston Astros");
        scoreResult(phillies,3,astros,5);



   //ADDING TEAM MEMBERS
//creatng entries in record BaseballPLayer
       var harper=new BaseballPlayer("B Harper","Right Fielder");
        var marsh=new BaseballPlayer("B Marsh","Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        //printing the list teamMembers
        phillies.listTeamMembers();

        //Creating new sports Team
        SportsTeam afc=new SportsTeam("Adelaide Crows");
        var tex=new FootballPlayer("Tex Walker","Center half forward");
        afc.addTeamMember(tex);
        afc.listTeamMembers();

    }
   public static void scoreResult(BaseballTeam team1,int t1_score,
                                  BaseballTeam team2,int t2_score){
        String message=team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,message,team2);
        //Displays the result
   }
    public static void scoreResult(SportsTeam team1,int t1_score,SportsTeam team2,int t2_score){
        String message=team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,message,team2);
        //Displays the result
    }
}
