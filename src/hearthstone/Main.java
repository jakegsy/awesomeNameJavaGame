package hearthstone;
import hearthstone.model.Creature;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent>{

    Stage window;
    Button button;
    Scene scene1, scene2;

    public static void main(String[] args) {

        Creature creature = new Creature("Jake",10,10,100);
        System.out.println(creature);
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the Window");
        this.button = new Button();
        button.setText("Click Me");

        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            System.out.println("Ok");
        }
    }
}
