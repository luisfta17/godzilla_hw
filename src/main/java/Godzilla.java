public class Godzilla extends Kaiju implements IAttack{
    public Godzilla(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    @Override
    public void attack(Kaiju kaiju) {
        kaiju.healthValue -= this.attackValue;
    }
    @Override
    public void attack(Army army) {
        army.healthValue -= this.attackValue;
    }
}
