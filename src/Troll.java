public class Troll extends Character {

    /**
     * This method is the parameterized constructor for the King object. It also sets the default weaponBehavior.
     * @param name
     */
    public Troll(String name) {
        super(name);
        setWeaponBehavior(new WeaponAxe());
    }

    @Override
    public void display() {
        System.out.printf("%s is a funny troll", this.name);
    }
}
