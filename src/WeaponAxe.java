/**
 * Description: This program implements the Strategy Design Pattern to create the characters and weapons in a Medieval Game.
 * @author Deja Scott
 * @version 1.00
 * @since 09 - 06 - 19
 *
 * Professor: Plante
 * Section: CSCE 247 001
 */

public class WeaponAxe implements WeaponBehavior{
    /**
     * This method prints out the attack behavior of the weapon: Axe.
     */
    @Override
    public void attack() {
        System.out.println("Swing an axe");
    }
}
