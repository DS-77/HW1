public class Queen  extends Character{

    /**
     * This method is the parameterized constructor for the Queen object. It also sets the default weaponBehavior.
     * @param name is the String value to be set as the object's name property.
     */
    public Queen(String name) {
        super(name);
        setWeaponBehavior(new WeaponKnife());
    }

    /**
     * This method displays an unique message with object's name to the user's screen.
     */
    @Override
    public void display() {
        System.out.printf("%s is a beautiful queen %n", this.name);
    }

    /**
     * This method changes the type of weaponBehavior the Queen has.
     * @param wb is the weaponBehavior object to be set as the Queen object's weaponBehavior.
     */
    @Override
    public void setWeaponBehavior(WeaponBehavior wb) {
        super.setWeaponBehavior(wb);
    }
}