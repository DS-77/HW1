public class King extends Character {

    /**
     * This method is the parameterized constructor for the King object.
     * @param name is the String value to be set as the object's name property.
     */
    public King(String name) {
        super(name);
        setWeaponBehavior(new WeaponSword());
    }

    /**
     * This method displays an unique message to the user's screen.
     */
    @Override
    public void display() {
        System.out.printf("%s is a Noble King", this.name);
    }
}
