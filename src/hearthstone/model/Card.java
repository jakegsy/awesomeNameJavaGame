package hearthstone.model;

public class Card {

    enum CardType{
        Creature{
            @Override
            public String toString(){
                return "Creature";
            }
        },
        Spell{
            @Override
            public String toString(){
                return "Spell";
            }
        }
    }

    private String name;
    private CardType cardType;
    private int cost;

    public Card(String name, String cardType, int cost){
        this.name = name;
        this.cardType = CardType.valueOf(cardType);
        this.cost = cost;
    }

    public CardType getCardType() {
        return cardType;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

}
