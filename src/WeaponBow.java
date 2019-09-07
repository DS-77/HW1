/**
 * Author: Deja Scott
 * Professor: Plante
 * Section: CSCE 247 001
 * Date: September 06 2019
 * PURPOSE: This program implements the Strategy Design Pattern to create the characters and weapons in a Medieval Game.
 */

public class WeaponBow implements WeaponBehavior {
    /**
     * This method prints out the attack behavior of the weapon: Bow.
     */
    @Override
    public void attack() {
        System.out.println("Draw and loose an arrow");
    }
}
