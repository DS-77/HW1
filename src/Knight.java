/**
 * Author: Deja Scott
 * Professor: Plante
 * Section: CSCE 247 001
 * Date: September 06 2019
 * PURPOSE: This program implements the Strategy Design Pattern to create the characters and weapons in a Medieval Game.
 */

public class Knight extends Character {

    /**
     * This method is the parameterized constructor for the Knight object. It also sets the default weaponBehavior.
     * @param name is the String value to be set as the object's name property.
     */
    public Knight(String name) {
        super(name);
        setWeaponBehavior(new WeaponBow());
    }

    /**
     * This method displays an unique message with object's name to the user's screen.
     */
    @Override
    public void display() {
        System.out.printf("%s is a valiant knight %n", this.name);
    }

    /**
     * This method changes the type of weaponBehavior the Knight has.
     * @param wb is the weaponBehavior object to be set as the Knight object's weaponBehavior.
     */
    @Override
    public void setWeaponBehavior(WeaponBehavior wb) {
        super.setWeaponBehavior(wb);
    }
}
