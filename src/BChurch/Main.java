package BChurch;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.sql.*;


public class Main extends Application {

    public static Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        mainStage.setTitle("Login | Bethel Church");
        mainStage.setScene(new Scene(root) );
        mainStage.show();
        mainStage.setResizable(false);
        mainStage.centerOnScreen();
        mainStage.getIcons().add(new Image(getClass().getResourceAsStream("images/icon.png")));

    }


    public static void main(String[] args) {


        launch(args);


    }
}
