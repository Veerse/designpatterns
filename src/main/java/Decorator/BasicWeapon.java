package Decorator;

public class BasicWeapon implements IWeapon {
    @Override
    public String getDescription() {
        return "Basic Weapon";
    }

    @Override
    public Double getDamages() {
        return 10d;
    }
}
