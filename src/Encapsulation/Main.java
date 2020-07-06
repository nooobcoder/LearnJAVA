package Encapsulation;

public class Main {
    public static void main(String[] args) {
       /* Player player = new Player();
        player.name = "Ankur";
        player.health = 20;
        player.weapon = "Sword";

        player.loseHealth(10);
        System.out.println("Remaining Health:  " + player.healthRemaining());

        player.health = 200;
        player.loseHealth(11);
        System.out.println("Remaining Health:  " + player.healthRemaining());*/

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Ankur", 45, "Dagger");
        System.out.println("Initial Health is, " + enhancedPlayer.getHitPoints());

        EnhancedPlayer enhancedPlayer2 = new EnhancedPlayer("Ankur", 200, "Dagger");
        System.out.println("Initial Health is, " + enhancedPlayer2.getHitPoints());
    }
}
