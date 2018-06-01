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
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class EX15_09 extends Application {
       Pane pane = new Pane();
       double width = 600;
       double height=600;
       double X=width/2;
       double Y = height/2;
       
    @Override
    public void start(Stage primaryStage) {
      pane.setOnKeyPressed(e->{
        switch(e.getCode()){
            case UP :walkup();break;
            case DOWN:walkdown();break;
            case LEFT:walkleft();break;
            case RIGHT:walkright();break;
            
        }
    });
       
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(new Scene(pane,width,height));
        primaryStage.show();
        pane.requestFocus();
    }
    private void walkup(){
        pane.getChildren().add(new Line(X,Y,X,Y-8));
        Y=Y-8;
    }
    private void walkdown(){
        pane.getChildren().add(new Line(X,Y,X,Y+8));
        Y=Y+8;
    }
    private void walkright(){
        pane.getChildren().add(new Line(X,Y,X+8,Y));
        X=X+8;
        
    }
    private void walkleft(){
        pane.getChildren().add(new Line(X,Y,X-8,Y));
        X=X-8;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
