/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaFormulario;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import java.util.Scanner;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
/**
 *
 * @author edwin
 */
public class Principal extends Application {  
    
    @Override
    public void start(Stage primaryStage) {    
        
        Label labelTitle = new Label(" Formulario ");
        Label labelAsesor = new Label(" Nombre asesor ");
        TextField textAsesor = new TextField();
        
        Label labelIdentificacion = new Label(" Identificacion del asesor ");
        TextField textIdentificacion = new TextField();
        
        Label labelCliente = new Label(" Nombre cliente ");
        TextField textCliente = new TextField();
        
        Label labelTelefono = new Label(" Telefono cliente ");
        TextField textTelefono = new TextField();
        
        Label labelCompra = new Label(" Compra realizada ");
        TextField textCompra = new TextField();
        
        Button botonInicio = new Button (" Registrar ");
      
        VBox root = new VBox();
        
        
        root.getChildren().addAll(labelTitle, labelAsesor, textAsesor, 
                labelIdentificacion, textIdentificacion, labelCliente, textCliente, labelTelefono,
                textTelefono, labelCompra, textCompra);
        Scene scene = new Scene(root, 600, 400);
        
        primaryStage.setTitle(" VBox Layout ");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
        
    }
    
   
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
