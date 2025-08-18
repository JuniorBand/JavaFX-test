package com.app.javafx.application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends javafx.application.Application {

    private static Scene mainScene;

    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com/app/javafx/MainView.fxml"));
            mainScene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("JavaFX Application");
            stage.setScene(mainScene);
            stage.setHeight(400);
            stage.setWidth(600);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Scene getMainScene(){ return mainScene;}

}
