package org.example.finalproject1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.example.finalproject1.DAL.UserType;
import org.example.finalproject1.DAL.UsersRepository;

import java.io.IOException;

public class HelloController {
    private final UsersRepository usersRepository = new UsersRepository();
    @FXML // fx:id="connectButton"
    private Button connectButton; // Value injected by FXMLLoader

    @FXML // fx:id="create_accont_button"
    private Hyperlink create_accont_button; // Value injected by FXMLLoader

    @FXML // fx:id="password"
    private PasswordField password; // Value injected by FXMLLoader

    @FXML // fx:id="username"
    private TextField username; // Value injected by FXMLLoader

    @FXML // fx:id="welcomeText"
    private Label welcomeText; // Value injected by FXMLLoader

    @FXML // fx:id="wrongDetails"
    private Label wrongDetails; // Value injected by FXMLLoader


    @FXML
    void create_an_account(ActionEvent event) {

    }

    @FXML
        //check if the details are correct, if they not show an error
    void onConnectButtonClick(ActionEvent event) throws IOException {
        int user = -1;
        try {
            user = Integer.parseInt(username.getText());
        } catch (NumberFormatException e) {
            wrongDetails.setText("Invalid username, the user name should only contain numbers");
        }
        if (user == -1 || password.getText().isEmpty()) {
            wrongDetails.setText("Please fill all the fields");
        } else if (!usersRepository.userExists(user)) {
            wrongDetails.setText("User not found, you can create a new account");
        } else if (usersRepository.correctPassword(user, password.getText())) {
            if (usersRepository.getUserType(user, password.getText()) == UserType.valueOf("Admin")) {
                HelloApplication.setRoot("manager_personal_page.fxml");
            }
        } else {
            wrongDetails.setText("One or more fields are wrong, please try again");
        }


    }

}
