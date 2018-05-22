public class Vehicle extends Army implements IAttack {
    public Vehicle(String type, int healthValue, int attackValue){
        super(type, healthValue, attackValue);
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
