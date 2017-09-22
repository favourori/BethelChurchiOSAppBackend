package BChurch;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXTextField;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LoginController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private JFXPasswordField password;

    @FXML
    public JFXTextField id;


    @FXML
    private Label status;




    @FXML
    void login(ActionEvent event) throws IOException {


        String uname = id.getText();
        String pass = password.getText();
        if (uname.isEmpty()) {
            status.setText("Username required");

           id.requestFocus();
        } else if (pass.isEmpty()) {
            status.setText("Password required");
            password.requestFocus();


        } else if (uname.equals("admin") && pass.equals("1234")) {

            //load dashboard
            Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Main.mainStage.setTitle("Dashboard | Bethel Church");
            Main.mainStage.setScene(new Scene(root, 1100, 650));
            Main.mainStage.show();

            Main.mainStage.setResizable(false);
            Main.mainStage.centerOnScreen();
            Main.mainStage.getIcons().add(new Image(getClass().getResourceAsStream("images/icon.png")));



        } else {




                status.setText("Incorrect Details");

                id.setText("");
                password.setText("");


            }



        }
 

    @FXML
    void newEVent(ActionEvent event) {


    }

    @FXML
    void newSermon(ActionEvent event) {


    }

}
