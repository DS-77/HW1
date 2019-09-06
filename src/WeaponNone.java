public class WeaponNone implements WeaponBehavior {

    /**
     * This method prints out the attack behavior of the weapon: None.
     */
    @Override
    public void attack() {
        System.out.println("Oh no! I lost my weapon");
    }
}
