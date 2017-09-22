package BChurch;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


/**
 * Created by FAVOUR on 5/22/2017.
 */
public class DashboardController {



    @FXML
    void manageSermon(ActionEvent event) throws Exception {


        Stage primaryStage = new Stage();
        //load dashboard
        Parent root = FXMLLoader.load(getClass().getResource("sermon.fxml"));
        primaryStage.setTitle("Manage Sermon | Bethel Church");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("images/icon.png")));


    }

    //Logout Method goes hereadmn
    @FXML
    void logout(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Main.mainStage.setTitle("Login | Bethel Church");
        Main.mainStage.setScene(new Scene(root));
        Main.mainStage.show();

        Main.mainStage.setResizable(false);
        Main.mainStage.centerOnScreen();
        Main.mainStage.getIcons().add(new Image(getClass().getResourceAsStream("images/icon.png")));

    }

}
