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
import javafx.scene.control.Button;

//mvn javafx:run
public class App extends Application {
    int xpos = 1;
    int ypos = 1;
    String y1 = "                                                                                                              ";
    StringBuilder sb1 = new StringBuilder(y1);
    String y2 = "                                                                                                              ";
    StringBuilder sb2 = new StringBuilder(y2);
    String y3 = "                                                                                                              ";
    StringBuilder sb3 = new StringBuilder(y3);
    String y4 = "                                                                                                              ";
    StringBuilder sb4 = new StringBuilder(y4);
    String y5 = "                                                                                                              ";
    StringBuilder sb5 = new StringBuilder(y5);
    String y6 = "                                                                                                              ";
    StringBuilder sb6 = new StringBuilder(y6);
    String y7 = "                                                                                                              ";
    StringBuilder sb7 = new StringBuilder(y7);
    String y8 = "                                                                                                              ";
    StringBuilder sb8 = new StringBuilder(y8);
    String y9 = "                                                                                                              ";
    StringBuilder sb9 = new StringBuilder(y9);
    String y10 = "                                                                                                              ";
    StringBuilder sb10 = new StringBuilder(y10);

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
        stage.setTitle("JavaFX App");
        stage.show();

        VBox root = new VBox();

        root.getChildren().addAll(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);

        scene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            if (event.getCode() == KeyCode.W) {
                ypos--;
                update();
            }
            if (event.getCode() == KeyCode.S) {
                ypos++;
                update();
            }
            if (event.getCode() == KeyCode.A) {
                xpos--;
                update();
            }
            if (event.getCode() == KeyCode.D) {
                xpos++;
                update();
            }
        });

        update();

        scene.setRoot(root);
    }


   
    private void clear(int exclude) {
        if (exclude != 1) {
        sb1.replace(0, 110,
                "                                                                                                              ");
        } else if (exclude != 2) {
        sb2.replace(0, 110,
                "                                                                                                              ");
        } else if (exclude != 3) {
        sb3.replace(0, 110,
                "                                                                                                              ");
        } else if (exclude != 4) {
        sb4.replace(0, 110,
                "                                                                                                              ");
        } else if (exclude != 5) {
        sb5.replace(0, 110,
                "                                                                                                              ");
        } else if (exclude != 6) {
        sb6.replace(0, 110,
                "                                                                                                              ");
        } else if (exclude != 7) {
        sb7.replace(0, 110,
                "                                                                                                              ");
        } else if (exclude != 8) {
        sb8.replace(0, 110,
                "                                                                                                              ");
        } else if (exclude != 9) {
        sb9.replace(0, 110,
                "                                                                                                              ");
        } else if (exclude != 10) {
        sb10.replace(0, 110,
                "                                                                                                              ");
        }
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
                clear(0);
                sb1.setCharAt((xpos - 1) * 11, '^');
                row1.setText(sb1.toString());
                break;
            case 2:
                clear(0);
                sb2.setCharAt((xpos - 1) * 11, '^');
                row2.setText(sb2.toString());
                break;
            case 3:
                clear(0);
                sb3.setCharAt((xpos - 1) * 11, '^');
                row3.setText(sb3.toString());
                break;
            case 4:
                clear(0);
                sb4.setCharAt((xpos - 1) * 11, '^');
                row4.setText(sb4.toString());
                break;
            case 5:
                clear(0);
                sb5.setCharAt((xpos - 1) * 11, '^');
                row5.setText(sb5.toString());
                break;
            case 6:
                clear(0);
                sb6.setCharAt((xpos - 1) * 11, '^');
                row6.setText(sb6.toString());
                break;
            case 7:
                clear(0);
                sb7.setCharAt((xpos - 1) * 11, '^');
                row7.setText(sb7.toString());
                break;
            case 8:
                clear(0);
                sb8.setCharAt((xpos - 1) * 11, '^');
                row8.setText(sb8.toString());
                break;
            case 9:
                clear(0);
                sb9.setCharAt((xpos - 1) * 11, '^');
                row9.setText(sb9.toString());
                clear(9);
                break;
            case 10:
                clear(0);
                sb10.setCharAt((xpos - 1) * 11, '^');
                row10.setText(sb10.toString());
                break;
            default:
                break;
        }
    }

    private void pick_attack() {
        Random rand1 = new Random();
        boolean attack;
        attack = rand1.nextBoolean();
        if (attack) {
            attackx();
        } else {
            attacky();
        }
    }

    private void attackx() {
        Random rand2 = new Random();
        int which_x = rand2.nextInt(10 - 1 + 1) + 1;
        switch (which_x) {
            case 1:
                for (int i = 0; i <= 110; i += 11) {
                    sb1.setCharAt(i, '!');
                }
                break;
            case 2:
                for (int i = 0; i <= 110; i += 11) {
                    sb2.setCharAt(i, '!');
                }
                break;
            case 3:
                for (int i = 0; i <= 110; i += 11) {
                    sb3.setCharAt(i, '!');
                }
                break;
            case 4:
                for (int i = 0; i <= 110; i += 11) {
                    sb4.setCharAt(i, '!');
                }
                break;
            case 5:
                for (int i = 0; i <= 110; i += 11) {
                    sb5.setCharAt(i, '!');
                }
                break;
            case 6:
                for (int i = 0; i <= 110; i += 11) {
                    sb6.setCharAt(i, '!');
                }
                break;
            case 7:
                for (int i = 0; i <= 110; i += 11) {
                    sb7.setCharAt(i, '!');
                }
                break;
            case 8:
                for (int i = 0; i <= 110; i += 11) {
                    sb8.setCharAt(i, '!');
                }
                break;
            case 9:
                for (int i = 0; i <= 110; i += 11) {
                    sb9.setCharAt(i, '!');
                }
                break;
            case 10:
                for (int i = 0; i <= 110; i += 11) {
                    sb10.setCharAt(i, '!');
                }
                break;
            default:
                break;
        }
    }

    private void attacky() {
        Random rand3 = new Random();
        int which_y = rand3.nextInt(10 - 1 + 1) + 1;
        switch (which_y) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}