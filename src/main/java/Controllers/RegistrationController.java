package Controllers;

import exceptions.UsernameAlreadyExistsException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import services.UserService;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
/*
public abstract class RegistrationController implements Initializable {

     ObservableList list = FXCollections.observableArrayList();
    @FXML
    private Text registrationMessage;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private ChoiceBox<String> role;

    ///private ChoiceBox<String> series;
   /// private MenuButton;

      @FXML
      public void initialize() {
      role.getItems().addAll("Client", "Admin");
    }
*/
   /* public void initialize(URL location, ResourceBundle resources) {
     loadData();
    }
*/
/*
    @FXML
   public void handleRegisterAction() {
        try {
            UserService.addUser(usernameField.getText(), passwordField.getText(), (String) role.getValue());
            registrationMessage.setText("Account created successfully!");
        } catch (UsernameAlreadyExistsException e) {
            registrationMessage.setText(e.getMessage());
        }
    }
*/
 /*   private void loadData () {
    list.removeAll(list);
    String a = "Client";
    String b = "Admin";
    list.addAll(a,b);
    MenuButton.getItems().addAll(list);
    }
*/

public abstract class RegistrationController implements Initializable {
    private ObservableList list = FXCollections.observableArrayList();

    @FXML
    private ChoiceBox<String> choiceBox = new ChoiceBox<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData(); //choiceBox
    }

    private void loadData() { //choiceBox
        list.addAll("Admin", "Client");
        choiceBox.getItems().addAll(list);
    }

    @FXML
    public void method(ActionEvent event) throws IOException {     //cancel
        AnchorPane pane = FXMLLoader.load(getClass().getResource("REGISTRATIONandLOGIN.fxml"));
        Group mainPane = null;
        mainPane.getChildren().setAll(pane);
    }
}

/*
public abstract class RegistrationController implements Initializable {

    @FXML
    private Text registrationMessage;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private ChoiceBox role;

    @FXML
    public void initialize() {
        role.getItems().addAll("Client", "Admin");
    }

    @FXML
    public void handleRegisterAction() {
        try {
            UserService.addUser(usernameField.getText(), passwordField.getText(), (String) role.getValue());
            registrationMessage.setText("Account created successfully!");
        } catch (UsernameAlreadyExistsException e) {
            registrationMessage.setText(e.getMessage());
        }
    }
}
*/
