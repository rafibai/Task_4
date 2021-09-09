/************************************
 * Md. Jafrul Haque Rafi            *
 * ID: 2012020259                   *
 * Sec: F                           *
 * email: cse_2012020259@lus.ac.bd  *
 * Date: 09/09/21                   *
 ***********************************/
package Rafi;

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;

    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println("Match type: "+matchType);
        System.out.println("Over of the match: "+over);
        System.out.println("Name of a player: "+player.playerName);
        System.out.println("Jersey number of a player: "+player.jerseyNumber);

    }
}
