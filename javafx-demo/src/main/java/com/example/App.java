package com.example;

import javafx.event.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.application.*;
import java.util.Random;
import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.Button;

//mvn javafx:run
public class App extends Application {
    int xpos = 1;
    int ypos = 1;
    String empty = "                                                                                                              ";
    StringBuilder sb1 = new StringBuilder(empty);
    StringBuilder sb2 = new StringBuilder(empty);
    StringBuilder sb3 = new StringBuilder(empty);
    StringBuilder sb4 = new StringBuilder(empty);
    StringBuilder sb5 = new StringBuilder(empty);
    StringBuilder sb6 = new StringBuilder(empty);
    StringBuilder sb7 = new StringBuilder(empty);
    StringBuilder sb8 = new StringBuilder(empty);
    StringBuilder sb9 = new StringBuilder(empty);
    StringBuilder sb10 = new StringBuilder(empty);

    Label row1 = new Label(sb1.toString());
    Label row2 = new Label(sb2.toString());
    Label row3 = new Label(sb3.toString());
    Label row4 = new Label(sb4.toString());
    Label row5 = new Label(sb5.toString());
    Label row6 = new Label(sb6.toString());
    Label row7 = new Label(sb7.toString());
    Label row8 = new Label(sb8.toString());
    Label row9 = new Label(sb9.toString());
    Label row10 = new Label(sb10.toString());

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Label("Hello, JavaFX!"), 400, 200);
        stage.setScene(scene);
        stage.setTitle("???");
        stage.show();

        VBox root = new VBox();

        root.getChildren().addAll(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);

        scene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            if (event.getCode() == KeyCode.W || event.getCode() == KeyCode.UP) {
                ypos--;
                update();
                spawn(5);
            }
            if (event.getCode() == KeyCode.S || event.getCode() == KeyCode.DOWN) {
                ypos++;
                update();
                spawn(5);
            }
            if (event.getCode() == KeyCode.A || event.getCode() == KeyCode.LEFT) {
                xpos--;
                update();
                spawn(5);
            }
            if (event.getCode() == KeyCode.D || event.getCode() == KeyCode.RIGHT) {
                xpos++;
                update();
                spawn(5);
            }
        });

        update();
        scene.setRoot(root);
    }

    private void clear() {
        empty = "                                                                                                              ";

        sb1.replace(0, sb1.length(),
                empty);
        row1.setText(sb1.toString());

        sb2.replace(0, sb2.length(),
                empty);
        row2.setText(sb2.toString());

        sb3.replace(0, sb3.length(),
                empty);
        row3.setText(sb3.toString());

        sb4.replace(0, sb4.length(),
                empty);
        row4.setText(sb4.toString());

        sb5.replace(0, sb5.length(),
                empty);
        row5.setText(sb5.toString());

        sb6.replace(0, sb6.length(),
                empty);
        row6.setText(sb6.toString());

        sb7.replace(0, sb7.length(),
                empty);
        row7.setText(sb7.toString());

        sb8.replace(0, sb8.length(),
                empty);
        row8.setText(sb8.toString());

        sb9.replace(0, sb9.length(),
                empty);
        row9.setText(sb9.toString());

        sb10.replace(0, sb10.length(),
                empty);
        row10.setText(sb10.toString());
    }


    private void update() {
        if (xpos <= 0) {
            xpos = 1;
        }
        if (xpos >= 10) {
            xpos = 10;
        }
        if (ypos <= 0) {
            ypos = 1;
        }
        if (ypos >= 10) {
            ypos = 10;
        }
        switch (ypos) {
            case 1:
                clear();
                sb1.setCharAt((xpos - 1) * 11, '^');
                row1.setText(sb1.toString());
                break;
            case 2:
                clear();
                sb2.setCharAt((xpos - 1) * 11, '^');
                row2.setText(sb2.toString());
                break;
            case 3:
                clear();
                sb3.setCharAt((xpos - 1) * 11, '^');
                row3.setText(sb3.toString());
                break;
            case 4:
                clear();
                sb4.setCharAt((xpos - 1) * 11, '^');
                row4.setText(sb4.toString());
                break;
            case 5:
                clear();
                sb5.setCharAt((xpos - 1) * 11, '^');
                row5.setText(sb5.toString());
                break;
            case 6:
                clear();
                sb6.setCharAt((xpos - 1) * 11, '^');
                row6.setText(sb6.toString());
                break;
            case 7:
                clear();
                sb7.setCharAt((xpos - 1) * 11, '^');
                row7.setText(sb7.toString());
                break;
            case 8:
                clear();
                sb8.setCharAt((xpos - 1) * 11, '^');
                row8.setText(sb8.toString());
                break;
            case 9:
                clear();
                sb9.setCharAt((xpos - 1) * 11, '^');
                row9.setText(sb9.toString());
                break;
            case 10:
                clear();
                sb10.setCharAt((xpos - 1) * 11, '^');
                row10.setText(sb10.toString());
                break;
            default:
                break;
        }
    }

    private void spawn(int amount){
        for (int i=0; i<amount; i++){
            int x = new Random().nextInt(10) + 1;
            int y = new Random().nextInt(10) + 1;
            switch (y) {
                case 1:
                    sb1.setCharAt((x - 1) * 11, 'X');
                    row1.setText(sb1.toString());
                    break;
                case 2:
                    sb2.setCharAt((x - 1) * 11, 'X');
                    row2.setText(sb2.toString());
                    break;
                case 3:
                    sb3.setCharAt((x - 1) * 11, 'X');
                    row3.setText(sb3.toString());
                    break;
                case 4:
                    sb4.setCharAt((x - 1) * 11, 'X');
                    row4.setText(sb4.toString());
                    break;
                case 5:
                    sb5.setCharAt((x - 1) * 11, 'X');
                    row5.setText(sb5.toString());
                    break;
                case 6:
                    sb6.setCharAt((x - 1) * 11, 'X');
                    row6.setText(sb6.toString());
                    break;
                case 7:
                    sb7.setCharAt((x - 1) * 11, 'X');
                    row7.setText(sb7.toString());
                    break;
                case 8:
                    sb8.setCharAt((x - 1) * 11, 'X');
                    row8.setText(sb8.toString());
                    break;
                case 9:
                    sb9.setCharAt((x - 1) * 11, 'X');
                    row9.setText(sb9.toString());
                    break;
                case 10:
                    sb10.setCharAt((x - 1) * 11, 'X');
                    row10.setText(sb10.toString());
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}