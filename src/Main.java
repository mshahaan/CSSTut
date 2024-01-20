import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root;

        try {
            root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            Scene scene = new Scene(root);

            //css string that stores file location of css file
            String css = this.getClass().getResource("application.css").toExternalForm();

            //short way to add css file to scene 
            //allows you to re-use css string to add same css file to multiple scenes
            scene.getStylesheets().add(css);

            //long version to addd css file into scene
            //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }

    public static void main(String[] args) {
        launch(args);
    }


}