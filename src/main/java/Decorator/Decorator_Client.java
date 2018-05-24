package Decorator;

public class Decorator_Client {
    public static void main(String[] args) {

        IWeapon weapon = new Sight(new BasicWeapon());

        System.out.println(weapon.getDescription());

        weapon = new Fire(weapon);

        System.out.println(weapon.getDescription());

        System.out.println(weapon.getClass());

    }
}
