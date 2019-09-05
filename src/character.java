public abstract class character {

    protected String name;

//    TODO: Implement this class.
    protected WeaponBehavior weaponBehavior;

//    Parameterized Constructor
    public character( String name) {
        this.name = name;
//        TODO: Don't forget to set weapon here.
    }

    public void attack() {
//        TODO: Use the method provided by the weapon.
    }

//    This method needs to be implemented by the children.
    public abstract void display ();

    public setWeaponBehavior(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }
}

