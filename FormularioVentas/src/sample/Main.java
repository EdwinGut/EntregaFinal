package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.StageStyle;

import java.util.Scanner;



public class Main extends Application {

    private double xOffset;
    private double yOffset;


    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });

        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setX(event.getScreenX() - xOffset);
                primaryStage.setY(event.getScreenY() - yOffset);
            }
        });


        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setTitle("Registro");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("images/cliente.png")));

        Scene escena = new Scene(root);

        escena.setFill(Color.TRANSPARENT);

        primaryStage.setScene(escena);
        primaryStage.show();




    }

    public static void main(String[] args) {
        launch(args);
    }



}


