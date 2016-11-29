package hearthstone.model;

import java.util.ArrayList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 * Created by jakegsy on 27/11/16.
 */
public class Player {

    private static final IntegerProperty MAX_HP = new SimpleIntegerProperty(30);
    private static final IntegerProperty MAX_CARDS = new SimpleIntegerProperty(10);
    private static final IntegerProperty MAX_MANA_RATE = new SimpleIntegerProperty(10);

    private IntegerProperty HP = MAX_HP;
    private IntegerProperty mana = new SimpleIntegerProperty(0);
    private IntegerProperty manaRate = new SimpleIntegerProperty(0);

    private StringProperty name;

    private CardDeck cardDeck;
    private final ArrayList<Card> cardGrave = new ArrayList<>();
    private final ArrayList<Card> cardHand = new ArrayList<>();

    public Player(String name){
        this.name = new SimpleStringProperty(name);
    }















// COMPLETED AND TESTED
    public int getHP() {
        return this.HP.get();
    }

    public StringProperty getName() {
        return this.name;
    }

    public int getMana(){
        return this.mana.get();
    }

    public void setCardDeck(CardDeck cardDeck){
        this.cardDeck = cardDeck;
    }

    public void setMana(int mana){
        this.mana = new SimpleIntegerProperty(mana);
    }

    public void setHP(int HP){
        this.HP = new SimpleIntegerProperty(HP);
    }

    public void increaseManaRate(){
        if(this.manaRate.get()<MAX_MANA_RATE.get()){
            this.manaRate.add(1);
        }
    }


}
