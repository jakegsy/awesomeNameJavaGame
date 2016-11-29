package hearthstone.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import hearthstone.model.Creature;
import hearthstone.Main;

public class CreatureCardController {
    @FXML
    private Label ATK;
    @FXML
    private Label HP;
    @FXML
    private Label cost;
    @FXML
    private Label name;
    @FXML
    private Label effect;
    @FXML
    private Main main;
    @FXML
    private Button choose;

    private Creature creature;

    public CreatureCardController(Creature creature){
        this.ATK = new Label(String.valueOf(creature.getATK().get()));
        this.HP = new Label(String.valueOf(creature.getHP().get()));
        this.cost = new Label(String.valueOf(creature.getCost().get()));
        this.name = new Label(creature.getName().get());
        this.creature = creature;

    }

    @FXML
    private void initialize(){
        ATK.textProperty().bind(creature.getATK().asString());
        HP.textProperty().bind(creature.getHP().asString());
        cost.textProperty().bind(creature.getCost().asString());


    }
}
