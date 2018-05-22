public class Pratzo extends Kaiju implements IAttack {
    public Pratzo(String name, int healthValue, int attackValue){
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
