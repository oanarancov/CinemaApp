package Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class listView implements Initializable {

    public TextField screen;
    ObservableList list = FXCollections.observableArrayList();

    @FXML
    private ListView<String> cinemaList;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
    }

    private void loadData(){
        list.removeAll(list);
        String a = "Cinema A";
        String b = "Cinema B";
        String c = "Cinema C";
        String d = "Cinema D";

        list.addAll(a,b,c,d);
        cinemaList.getItems().addAll(list);
    }

    @FXML
    public void displaySelected(javafx.scene.input.MouseEvent mouseEvent ) {
        String cinema = cinemaList.getSelectionModel().getSelectedItem();
        if(cinema == null || cinema.isEmpty()){
            screen.setText("Nothing selected");
        }
        else{
            screen.setText(cinema + " selected");
        }
    }
}