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
    string y1 ="                                                                                                              ";
    StringBuilder sb1 = new StringBuilder(y1);
    string y2 ="                                                                                                              ";
    StringBuilder sb2 = new StringBuilder(y2);
    string y3 ="                                                                                                              ";
    StringBuilder sb3 = new StringBuilder(y3);
    string y4 ="                                                                                                              ";
    StringBuilder sb4 = new StringBuilder(y4);
    string y5 ="                                                                                                              ";
    StringBuilder sb5 = new StringBuilder(y5);
    string y6 ="                                                                                                              ";
    StringBuilder sb6 = new StringBuilder(y6);
    string y7 ="                                                                                                              ";
    StringBuilder sb7 = new StringBuilder(y7);
    string y8 ="                                                                                                              ";
    StringBuilder sb8 = new StringBuilder(y8);
    string y9 ="                                                                                                              ";
    StringBuilder sb9 = new StringBuilder(y9);
    string y10 ="                                                                                                              ";
    StringBuilder sb10 = new StringBuilder(y10);



   @Override
   public void start(Stage stage) {
       Scene scene = new Scene(new Label("Hello, JavaFX!"), 400, 200);
       stage.setScene(scene);
       stage.setTitle("JavaFX App");
       stage.show();


    scene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.UP) {
        ypos -= 1;
        }
    });
    scene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.DOWN) {
        ypos += 1;
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
    if (xpos > 110){
        xpos = 110;
    }
    if (ypos < 1){
        ypos = 1;
    }
    if (ypos > 10){
        ypos = 10;
    }

    switch (ypos) {
        case 1:
            clear();
            sb1.setCharAt('^',xpos*11);
            break;
        case 2:
            clear();
            sb2.setCharAt('^',xpos*11);
            break;
        case 3:
            clear();
            sb3.setCharAt('^',xpos*11);
            break;
        case 4:
            clear();
            sb4.setCharAt('^',xpos*11);
            break;
        case 5:
            clear();
            sb5.setCharAt('^',xpos*11);
            break;
        case 6:
            clear();
            sb6.setCharAt('^',xpos*11);
            break;
        case 7:
            clear();
            sb7.setCharAt('^',xpos*11);
            break;
        case 8:
            clear();
            sb8.setCharAt('^',xpos*11);
            break;
        case 9:
            clear();
            sb9.setCharAt('^',xpos*11);
            break;
        case 10:
            clear();
            sb10.setCharAt('^',xpos*11);
            break;
        default:
            break;
    }

       VBox root = new VBox();
       Label row1 = new Label (y1);
       Label row2 = new Label (y2);
       Label row3 = new Label (y3);
       Label row4 = new Label (y4);
       Label row5 = new Label (y5);
       Label row6 = new Label (y6);
       Label row7 = new Label (y7);
       Label row8 = new Label (y8);
       Label row9 = new Label (y9);
       Label row10 = new Label (y10);
       root.getChildren().addAll(row1,row2,row3,row4,row5,row6,row7,row8,row9,row10);

       scene.setRoot(root);
   }

   private void clear() {
    y1 ="                                                                                                              ";
    y2 ="                                                                                                              ";
    y3 ="                                                                                                              ";
    y4 ="                                                                                                              ";
    y5 ="                                                                                                              ";
    y6 ="                                                                                                              ";
    y7 ="                                                                                                              ";
    y8 ="                                                                                                              ";
    y9 ="                                                                                                              ";
    y10 ="                                                                                                              ";
   }

   public static void main(String[] args) {
       launch(args);
   }
}