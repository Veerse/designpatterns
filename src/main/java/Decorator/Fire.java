package Decorator;

public class Fire extends Decorator {

    public Fire(IWeapon weapon) {
        super(weapon);
    }

    @Override
    public String getDescription (){
        return wrappenWeapon.getDescription() + ", Fire";
    }

    @Override
    public Double getDamages (){
        return wrappenWeapon.getDamages() + 40d;
    }
}
