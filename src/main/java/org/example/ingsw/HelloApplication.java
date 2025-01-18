package org.example.ingsw;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("interface.fxml"));
        Pane root = fxmlLoader.load();

        Image background = new Image(getClass().getResource("/org/example/ingsw/images/background.jpg").toExternalForm());
        BackgroundImage bg = new BackgroundImage(
                background, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));

        root.setBackground(new Background(bg));
        Scene scene = new Scene(root, 1024, 768);
        stage.setTitle("ingsw");
        stage.setScene(scene);
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}