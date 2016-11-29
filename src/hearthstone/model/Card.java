package hearthstone.model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
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

    private StringProperty name;
    private CardType cardType;
    private IntegerProperty cost;

    public Card(String name, String cardType, int cost){
        this.name = new SimpleStringProperty(name);
        this.cardType = CardType.valueOf(cardType);
        this.cost = new SimpleIntegerProperty(cost);
    }

    public CardType getCardType() {
        return cardType;
    }

    public StringProperty getName() {
        return name;
    }

    public IntegerProperty getCost() {
        return cost;
    }

}
