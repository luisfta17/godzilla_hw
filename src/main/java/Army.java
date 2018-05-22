public abstract class Army {
    String type;
    int healthValue;
    int attackValue;

    public Army(String type, int healthValue, int attackValue){
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return this.type;
    }

    public int getHealthValue(){
        return healthValue;
    }

    public int getAttackValue(){
        return attackValue;
    }
}


