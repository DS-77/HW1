public abstract class character {

    protected String name;
    protected WeaponBehavior weaponBehavior;

    /**
     * This method is the parameterized constructor for the Character class.
     * @param name is the string that will be set as the character's name.
     */
    public character( String name) {
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

