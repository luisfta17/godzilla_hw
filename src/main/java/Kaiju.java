public abstract class Kaiju {
    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String roar(){
        return this.name + " Roarsss!";
    }

    public String getName() {
        return this.name;
    }

    public int getHealthValue(){
        return healthValue;
    }

    public int getAttackValue(){
        return attackValue;
    }
}
