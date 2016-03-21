package pl.pwr.java.lab;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import pl.pwr.java.lab.Controller.MainController;

public class Main extends Application {

    private Stage primaryStage;
    private StackPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("LAB03 - Rysowanie Figur");

        inicjujGlownaRamke();
    }

    public void inicjujGlownaRamke() {
        Button button = new Button();
        button.setText("Nacisnij mnie");

        button.setOnAction(event -> pokazUkadWspolrzednych());

        rootLayout = new StackPane();
        rootLayout.getChildren().add(button);

        Scene scene = new Scene(rootLayout, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void pokazUkadWspolrzednych() {
        MainController mainController = new MainController();
        mainController.wykonajOperacjeNaObiektach();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public StackPane getRootLayout() {
        return rootLayout;
    }
}
