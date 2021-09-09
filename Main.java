/************************************
 * Md. Jafrul Haque Rafi            *
 * ID: 2012020259                   *
 * Sec: F                           *
 * email: cse_2012020259@lus.ac.bd  *
 * Date: 09/09/21                   *
 ***********************************/
package Rafi;

public class Main {

    public static void main(String[] args)
    {
        Player player = new Player("Shakib",75 );
        Cricket cricket = new Cricket("International match",20, player);

        cricket.display();
        Football football = new Football();
    }
}
