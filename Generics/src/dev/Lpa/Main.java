package dev.Lpa;

interface Player {
    String name();
}

record BaseballPlayer(String name, String position) implements Player {
}

record FootballPlayer(String name, String position) implements Player {
}
record VolleyballPlayer(String name, String position) implements Player {
}

public class Main {
    public static void main(String[] args) {
        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillis");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);
//Sports Team
        SportsTeam phillies2 = new SportsTeam("Philadelphia Phillis");
        SportsTeam astros2 = new SportsTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);

        //using generic class Team with BaseballPlayer record
        Team<BaseballPlayer> phillies = new Team<>("Philadelphia Phillis");
        Team<BaseballPlayer> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        //ADDING TEAM MEMBERS
//creating entries in record BaseballPLayer
        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var Guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
        phillies.addTeamMember(Guthrie);
        //printing the list teamMembers
        phillies.listTeamMembers();
//Creating new sports Team
        SportsTeam afc1 = new SportsTeam("Adelaide Crows");

//using generic class Team with FootballPlayer record
        Team<FootballPlayer> afc = new Team<>("Adelaide Crows");

        var tex = new FootballPlayer("Tex Walker", "Center half forward");
        afc.addTeamMember(tex);
        afc.listTeamMembers();

//Problem with thi solution we can add a baseball player to footbball player team which was solved
        // by using Generic class Team afc
//        var max=new BaseballPlayer("Maxer t","Striker");
//        afc.addTeamMember(max); error
//        afc1.addTeamMember(max); no error
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();
//Team of generic type String
        Team<VolleyballPlayer>adelaide=new Team<>("Adelaide Storm");
        adelaide.addTeamMember("N Roberts");
        adelaide.listTeamMembers();
//Another Team of generic type String
        var canbera=new Team<String>("Canberra Heat");
        canbera.addTeamMember("B Black");
        canbera.listTeamMembers();
//Comparing both teams
        scoreResult(canbera,0,adelaide,1);
//        Team<Integer>melbourneVB=new Team<>("Melborne Vipers");


    }

    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
        //Displays the result
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
        //Displays the result
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
        //Displays the result
    }
}
