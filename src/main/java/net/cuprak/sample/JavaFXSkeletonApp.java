package net.cuprak.sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXSkeletonApp extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Demo Application");
        int width = 640;
        int height = 480;
        stage.show();
    }

}
