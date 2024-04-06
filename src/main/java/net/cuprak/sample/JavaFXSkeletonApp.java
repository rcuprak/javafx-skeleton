package net.cuprak.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Skeleton Application
 */
public class JavaFXSkeletonApp extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        ResourceBundle bundle = ResourceBundle.getBundle("net.cuprak.sample.resources");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/net/cuprak/sample/App.fxml"),bundle);
        Parent root = loader.load();
        Controller controller = loader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle(bundle.getString("appTitle"));
        stage.show();
    }

}
