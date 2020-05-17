package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import java.io.IOException;


public class REGISTRATIONandLOGINCONTROLLER {
    //private ObservableList list= FXCollections.observableArrayList();
    @FXML
    private AnchorPane rootPane;
    @FXML
    private Text loginMessage;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private Button registerButton;
    @FXML

    public void click(ActionEvent event) {       //login
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username == null || username.isEmpty()) {
            loginMessage.setText("Please type in a username!");
            return;
        }

        if (password == null || password.isEmpty()) {
            loginMessage.setText("Password cannot be empty");
            return;
        }

        if( username != null || !username.isEmpty() && password != null || !password.isEmpty() )
            loginMessage.setText("Account doesn't exist!");
    }
    @FXML

    public void register(ActionEvent event) throws IOException     //register
    {
        AnchorPane secondPane = FXMLLoader.load(getClass().getResource("Registration.fxml"));
        rootPane.getChildren().setAll(secondPane);
    }
}


