/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class EX15_13 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      Pane pane = new Pane();
    Rectangle rec = new  Rectangle(100,60,100,40);
    rec.setFill(Color.WHITE);
    rec.setStroke(Color.BLACK);
    pane.getChildren().add(rec);
    
    
    pane.setOnMouseMoved(e->{
        pane.getChildren().clear();
        Text text=new Text(e.getX(),e.getY(),"Mouse is:"+(rec.contains(e.getX(),e.getY())?" inside ":" outside ")+"of rectangle");
        pane.getChildren().addAll(rec,text);
    });
    
          
       
        
       
        Scene scene = new Scene(pane, 400, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
