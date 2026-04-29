public class Player {
    public String name;
    public String weapon;
    public int health;

    public void loseHealt(int damage){
        health= health-damage;
        if (health<=0){
            System.out.println("Player knocked out of the game");

        }
    }
    public int healthRemaining(){
        return health;
    }
    public void restoreHealth(int extraHealth){
        health=health+extraHealth;
        if (health>100){
            System.out.println("Player health completely restored");
            health=100;
        }
    }

}
