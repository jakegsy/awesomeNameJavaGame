package hearthstone.model;

public class Creature extends Card {

    private int ATK;
    private int HP;

    public Creature(String name, int cost, int ATK, int HP){
        super(name,"Creature",cost);
        this.ATK = ATK;
        this.HP = HP;
    }

    public int getATK() {
        return ATK;
    }

    public int getHP() {
        return HP;
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() + " | Type: " + this.getCardType().toString()
                + " | " + "Mana Cost: " + this.getCost() + " | " + "ATK: " + this.getATK()
                + " | " + "HP: " + this.getHP();
    }
}
