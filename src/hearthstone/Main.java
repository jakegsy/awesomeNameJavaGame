package hearthstone;
import hearthstone.model.Card;
import hearthstone.model.Creature;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.collections.ObservableList;

import java.io.IOException;

public class Main extends Application implements EventHandler<ActionEvent>{

    Stage window;
    Button button;
    Scene scene1, scene2;
    private BorderPane rootLayout;
    private Stage primaryStage;
    private ObservableList<Card> p1Hand;

    public static void main(String[] args) {

        Creature creature = new Creature("Jake",10,10,100);
        System.out.println(creature);
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("PTSD Java Final Project");
        initRootLayout();

    }

    /*
     *Initializes the root layout
     *
     */
    public void initRootLayout(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("./view/Game.fxml"));
            rootLayout = (BorderPane) loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            System.out.println("Ok");
        }
    }
}
