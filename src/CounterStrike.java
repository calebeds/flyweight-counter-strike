import factory.PlayerFactory;
import players.Player;

import java.util.Random;

public class CounterStrike {

    // All player types and weapons (used by getRandomPlayerType()
    // and getRandomWeapon())
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};

    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // getPlayer() is called simply using the class name since the method is a static
            Player p = PlayerFactory.getPlayer(getRandomPlayerType());
            
            // Assing a weapon chosen randomly uniformly from the weapon array
            p.assignWeapon(getRandomWeapon());

            // Send this player on a mission
            p.mission();
        }
    }

    private static String getRandomWeapon() {
        Random r = new Random();

        // Will return an integer between [0,2)
        int randInt = r.nextInt(weapons.length);

        // return the weapon stored at index 'randInt'
        return weapons[randInt];
    }

    private static String getRandomPlayerType() {
        Random r = new Random();

        // Will return an integer between [0,2)
        int randInt = r.nextInt(playerType.length);

        // return the player stored at index 'randInt'
        return playerType[randInt];
    }


}
