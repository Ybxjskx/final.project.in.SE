package org.example.finalproject1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class HomePage {

    @FXML // fx:id="MyCartBottun"
    private Button MyCartBottun; // Value injected by FXMLLoader

    @FXML // fx:id="aboutButton"
    private Button aboutButton; // Value injected by FXMLLoader

    @FXML // fx:id="connectButton"
    private Button connectButton; // Value injected by FXMLLoader

    @FXML // fx:id="reserveButton"
    private Button reserveButton; // Value injected by FXMLLoader

    @FXML // fx:id="showMenu"
    private Button showMenu; // Value injected by FXMLLoader


    @FXML
    void showAbout(ActionEvent event) {

    }

    @FXML
    void showMyCart(ActionEvent event) {

    }

    @FXML
    void showTheMenu(ActionEvent event) {

    }

    @FXML
    void toConnect(ActionEvent event) throws IOException {
        HelloApplication.setRoot("hello-view.fxml");
    }

    @FXML
    void toResrveAtable(ActionEvent event) {

    }

}
