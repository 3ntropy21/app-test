package com.example;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class App extends Application {
   @Override
   public void start(Stage stage) {
       Scene scene = new Scene(new Label("Hello, JavaFX!"), 400, 200);
       stage.setScene(scene);
       stage.setTitle("JavaFX App");
       stage.show();
   }


   public static void main(String[] args) {
       launch(args);
   }
}
