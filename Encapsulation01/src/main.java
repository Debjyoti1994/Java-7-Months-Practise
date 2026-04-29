public class main {

    public static void main(String[] args) {

    Player player=new Player();
    player.name="Tim";
    player.health=20;
    player.weapon="Sword";

    int damage=10;
    player.loseHealt(damage);
    System.out.println("Remaning heath ="+player.healthRemaining());
    player.health=200;

   player.loseHealt(11);
    System.out.println("Remaning heath ="+player.healthRemaining());

EnhancedPlayer tim=new EnhancedPlayer("tim");
EnhancedPlayer kim=new EnhancedPlayer("kim",-90,"Dagger");
        System.out.println("Remaning heath ="+tim.healthRemaining());
        System.out.println("Remaning heath ="+kim.healthRemaining());




    }

}
