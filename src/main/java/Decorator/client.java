package Decorator;

public class client {
    public static void main(String[] args) {
        IWeapon weapon = new Fire(new BasicWeapon());
        weapon = new Sight(weapon);
        System.out.println(weapon.getDescription());
    }
}
