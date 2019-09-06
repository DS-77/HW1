public class King extends Character {

    public King(String name) {
        super(name);
        setWeaponBehavior(new WeaponSword());
    }

    @Override
    public void display() {
        System.out.printf("%s is a Noble King", this.name);
    }
}
