public class Main {
    public static void main(String[] args) {
//        Player player1=new Player();
//        player1.name="Rahul";
//        player1.health=100;
//        player1.weapon="Sword";
//
//        player1.loseHealth(10);
//        System.out.println("Reaminig health of player "+ player1.health);
//        player1.health=300;
//        System.out.println("Reaminig health of player "+ player1.healthRemaining());
        EnhancedPlayer tim=new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("Initial health is "+tim.healthRemaining());
    }
}
