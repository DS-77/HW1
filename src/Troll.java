public class Troll extends Character {

    /**
     * This method is the parameterized constructor for the King object. It also sets the default weaponBehavior.
     * @param name is the String value to be set as the object's name property.
     */
    public Troll(String name) {
        super(name);
        setWeaponBehavior(new WeaponAxe());
    }

    /**
     * This method displays an unique message with object's name to the user's screen.
     */
    @Override
    public void display() {
        System.out.printf("%s is a funny troll", this.name);
    }

    /**
     * This method changes the type of weaponBehavior the Troll has.
     * @param wb is the weaponBehavior object to be set as the Troll object's weaponBehavior.
     */
    @Override
    public void setWeaponBehavior(WeaponBehavior wb) {
        super.setWeaponBehavior(wb);
    }
}
