package Decorator;

public class Sight extends Decorator {

    public Sight(IWeapon weapon) {
        super(weapon);
    }

    @Override
    public String getDescription () {
        return wrappenWeapon.getDescription() + ", sight";
    }

    @Override
    public Double getDamages() {
        return wrappenWeapon.getDamages();
    }
}
