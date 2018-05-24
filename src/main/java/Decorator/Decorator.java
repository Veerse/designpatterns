package Decorator;

public abstract class Decorator implements IWeapon {

    protected IWeapon wrappenWeapon;

    public Decorator (IWeapon weapon) {
        this.wrappenWeapon = weapon;
    }

    @Override
    public String getDescription() {
        return wrappenWeapon.getDescription();
    }

    @Override
    public Double getDamages() {
        return wrappenWeapon.getDamages();
    }
}
