package hearthstone.model;

import java.util.ArrayList;

/**
 * Created by jakegsy on 27/11/16.
 */
public class Player {

    private static final int MAX_HP = 30;
    private static final int MAX_CARDS = 10;
    private static final int MAX_MANA_RATE = 10;

    private int HP = MAX_HP;
    private int mana = 0;
    private int manaRate = 0;

    private String name;

    private CardDeck cardDeck;
    private final ArrayList<Card> cardGrave = new ArrayList<>();
    private final ArrayList<Card> cardHand = new ArrayList<>();

    public Player(String name){
        this.name = name;
    }















// COMPLETED AND TESTED
    public int getHP() {
        return this.HP;
    }

    public String getName() {
        return this.name;
    }

    public int getMana(){
        return this.mana;
    }

    public void setCardDeck(CardDeck cardDeck){
        this.cardDeck = cardDeck;
    }

    public void setMana(int mana){
        this.mana = mana;
    }

    public void setHP(int HP){
        this.HP = HP;
    }

    public void increaseManaRate(){
        if(this.manaRate<MAX_MANA_RATE){
            this.manaRate++;
        }
    }


}
