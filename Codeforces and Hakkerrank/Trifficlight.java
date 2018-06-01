/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class Trifficlight extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
       protected BorderPane getPane(){
           BorderPane pane = super.getPane();
           
           BorderPane paneForTextField=new BorderPane();
           paneForTextField.setPadding(new Insets(5,5,5,5));
           paneForTextField.setLeft(new Label("Enter a new message:"));
           
           TextField tf = new TextField();
           tf.setAlignment(Pos.BOTTOM_RIGHT);
           
        
        
        
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
      
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
