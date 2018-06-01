/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class EX_15 extends Application {
   Pane pane = new Pane();
   public void start(Stage primaryStage){
       double width = 400;
       double height=400;
       
       pane.setOnMouseClicked(e->{
           double x =e.getX();
           double y = e.getY();
           
           if(e.getButton()==MouseButton.PRIMARY){
               Circle c = drawPoint(x,y);
               pane.getChildren().add(c);
           }else if(e.getButton()==MouseButton.SECONDARY){
               removePoint(x,y);
           }
       });
       Scene scene = new Scene(pane,width,height);
       primaryStage.setScene(scene);
       primaryStage.setTitle("Draw circle");
       primaryStage.show();
       
       
   }
   private Circle drawPoint(double x,double y){
       Circle c = new Circle(x,y,15);
       c.setStroke(Color.BLACK);
       c.setFill(Color.BLUE);
       return c;
   }

    private void removePoint(double x,double y){
        ObservableList<Node> a = pane.getChildren();
        for(int i=c.length();i>=0;i--)
           a.remove(x,y);
            
            
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}