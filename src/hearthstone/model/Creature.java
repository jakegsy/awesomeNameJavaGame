package hearthstone.model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Creature extends Card {

    private IntegerProperty ATK;
    private IntegerProperty HP;

    public Creature(String name, int cost, int ATK, int HP){
        super(name,"Creature",cost);
        this.ATK = new SimpleIntegerProperty(ATK);
        this.HP = new SimpleIntegerProperty(HP);
    }

    public IntegerProperty getATK() {
        return ATK;
    }

    public IntegerProperty getHP() {
        return HP;
    }

    public StringProperty getName() {return super.getName();}

    @Override
    public String toString(){
        return "Name: " + this.getName() + " | Type: " + this.getCardType().toString()
                + " | " + "Mana Cost: " + this.getCost() + " | " + "ATK: " + this.getATK()
                + " | " + "HP: " + this.getHP();
    }
}
