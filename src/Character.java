/**
 * Description: This program implements the Strategy Design Pattern to create the characters and weapons in a Medieval Game.
 * @author Deja Scott
 * @version 1.00
 * @since 09 - 06 - 19
 *
 * Professor: Plante
 * Section: CSCE 247 001
 */

public abstract class Character {

//    Protected class variables for the Character Class.
    protected String name;
    protected WeaponBehavior weaponBehavior;

    /**
     * This method is the parameterized constructor for the Character class.
     * @param name is the string that will be set as the character's name.
     */
    public Character(String name) {
        this.name = name;
    }

    /**
     * This method calls the WeaponBehavior class's attack method.
     */
    public void attack() {
        weaponBehavior.attack();
    }

    /**
     * This method is defined by the children classes.
     */
    public abstract void display ();

    /**
     * This method changes the type of weaponBehavior the character has.
     * @param wb is the weaponBehavior object to be set as the character object's weaponBehavior.
     */
    public void setWeaponBehavior(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }
}

