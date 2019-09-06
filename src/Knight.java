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
        System.out.printf("%s is a valiant knight", this.name);
    }
}
