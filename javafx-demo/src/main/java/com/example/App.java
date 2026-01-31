package com.example;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
//mvn javafx:run
public class App extends Application {
    int xpos = 1;
    int ypos = 1;
   @Override
   public void start(Stage stage) {
       Scene scene = new Scene(new Label("Hello, JavaFX!"), 400, 200);
       stage.setScene(scene);
       stage.setTitle("JavaFX App");
       stage.show();


    scene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.UP) {
        ypos += 1;
        }
    });
    scene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.DOWN) {
        ypos -= 1;
        }
    });
    scene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.LEFT) {
        xpos -= 1;
        }
    });
    scene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
        xpos += 1;
        }
    });

    if (xpos < 1){
        xpos = 1;
    }
    if (xpos > 118){
        xpos = 118;
    }
    if (ypos < 1){
        ypos = 1;
    }
    if (ypos > 11){
        ypos = 11;
    }

       VBox root = new VBox();
       Label row1 = new Label("^                                                                                                                     ");
       Label row2 = new Label ("                                                                                                                      ");
       Label row3 = new Label("                                                                                                                      ");
       Label row4 = new Label ("                                                                                                                      ");
       Label row5 = new Label("                                                                                                                      ");
       Label row6 = new Label ("                                                                                                                      ");
       Label row7 = new Label("                                                                                                                      ");
       Label row8 = new Label ("                                                                                                                      ");
       Label row9 = new Label("                                                                                                                      ");
       Label row10 = new Label ("                                                                                                                      ");
       Label row11 = new Label ("                                                                                                                      ");
       root.getChildren().addAll(row1,row2,row3,row4,row5,row6,row7,row8,row9,row10,row11);

       scene.setRoot(root);
   }


   public static void main(String[] args) {
       launch(args);
   }
}
