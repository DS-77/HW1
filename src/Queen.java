public class Queen  extends Character{

    /**
     * This method is the parameterized constructor for the Queen object.
     * @param name is the String value to be set as the object's name property.
     */
    public Queen(String name) {
        super(name);
        setWeaponBehavior(new WeaponKnife());
    }

    /**
     * This method displays an unique message to the user's screen.
     */
    @Override
    public void display() {
        System.out.printf("%s is a beautiful queen", this.name);
    }
}