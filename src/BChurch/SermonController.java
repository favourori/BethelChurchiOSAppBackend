package BChurch;

/**
 * Created by FAVOUR on 5/22/2017.
 */

import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;

import java.awt.*;


public class SermonController {


    @FXML
    private JFXTextField title;

    @FXML
    private JFXTextArea desc;

    @FXML
    private JFXTextField pastor;

    @FXML
    private JFXDatePicker date;

    @FXML
    private JFXTextField file;

    @FXML
    private Label valLabel;


    @FXML
    private JFXButton addNew;
    @FXML
    private AnchorPane addNewPanel;
    @FXML
    private ImageView statusIcon;


    @FXML
    void addNew(ActionEvent event) {
        addNewPanel.setDisable((false));
        addNew.setDisable(true);


    }

    @FXML
    void uploadSermon(ActionEvent event) {
        String sermonTitle = title.getText();
        String sermonDesc = desc.getText();
        String sermonPastor = pastor.getText();


        if (sermonTitle.isEmpty()) {
            title.requestFocus();
            title.setFocusColor(Color.RED);
            statusIcon.setVisible(true);
            valLabel.isVisible();

            valLabel.setText("Sermon\'s title is required!");

        } else if (sermonPastor.isEmpty()) {
            pastor.requestFocus();
            pastor.setFocusColor(Color.RED);
            statusIcon.setVisible(true);
            valLabel.setText("Pastor\'s name is required!");
        }

        //more validations here

        else {
            statusIcon.setVisible(false);
            valLabel.setText("Uploading..");

            //code for db connection and upload of files and data goes here..
        }


    }


}

