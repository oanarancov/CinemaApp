import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import services.UserService;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        UserService.loadUsersFromFile();

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("REGISTRATIONandLOGIN.fxml"));
        primaryStage.setTitle("CinemaApp");
        primaryStage.setScene(new Scene(root, 700, 600));
        primaryStage.show();
    }
}