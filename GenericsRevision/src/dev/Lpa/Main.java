package dev.Lpa;

interface Player {
}

record BaseballPlayer(String name, String position) implements Player {
}

record FootballPlayer(String name, String position) implements Player {
}

public class Main {
    public static void main(String[] args) {
        //creating new baseball Team
        BaseballTeam phillies1 = new BaseballTeam("Philadephia Phillies1");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros1");
//calling score method to compare and check score
        scoreResult(phillies1, 3, astros1, 5);

        SportsTeam phillies2 = new SportsTeam("Philadephia Phillies2");
        SportsTeam astros2 = new SportsTeam("Houston Astro2");
        scoreResult(phillies2, 3, astros2, 5);

        Team<BaseballPlayer> phillies = new Team<>("Philadephia Phillies");
        Team<BaseballPlayer> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        //adding players
        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var gutherie = new BaseballPlayer("D Guthrie", "Center Fielder");
        phillies.addTeamMember(gutherie);
        phillies.listTeamMembers();
//Creating a sports team and adding a Football PLayer
        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer> afc = new Team<>("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker", "Center half forward");
        afc.addTeamMember(tex);
        //We can add BASEBALL & FOOTBALL player n SPORTS TEAM(AFC-football team)
//        var gutherie1 = new BaseballPlayer("D Guthrie", "Center Fielder");
//        afc1.addTeamMember(gutherie1);
        var rory=new FootballPlayer("Rory Lard","Midfeld");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

    }

    //Comparing score via set scoreMethod
    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }
}

