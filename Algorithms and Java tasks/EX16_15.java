/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;


public class EX16_15 extends Application{
    protected ComboBox<String> cbox=new ComboBox<>();
    public void start(Stage primaryStage){
        cbox.getItems().addAll("TOP","BOTTOM","LEFT","RIGHT");
        cbox.setValue("LEFT");
        TextField tg=new TextField("0");
        tg.setPrefColumnCount(3);
        HBox hb = new HBox(8);
        hb.setAlignment(Pos.CENTER);
        Label lb1 = new Label("contentDisplay:");
        Label lb2 = new Label("GraphicTextGap:");
        hb.getChildren().addAll(lb1,cbox,lb2,tg);
        
       Image img = new Image(new File("C:\\Users\\Admin\\Downloads\\grapes.jpg").toURI().toString());
       ImageView image = new ImageView(img);
        image.setFitHeight(200);
       image.setFitWidth(300);
       
       Label lgrap = new Label("Grapes",image);
       lgrap.setGraphicTextGap(0);
       
      StackPane pane = new StackPane(lgrap);
      cbox.setOnAction(e->{lgrap.setContentDisplay(setDisplay());
      
      });
      
      tg.setOnAction(e->{
          lgrap.setGraphicTextGap(Integer.parseInt(tg.getText()));
      });
      
      BorderPane bp=new BorderPane();
      bp.setTop(hb);
      bp.setCenter(pane);
      Scene scene = new Scene(bp,400,200);
      primaryStage.setTitle("EX16_15");
      primaryStage.setScene(scene);
      primaryStage.show();
    }
      
      
       private ContentDisplay setDisplay(){
           if(cbox.getValue().equals("TOP"))
               return ContentDisplay.TOP;
           else if(cbox.getValue().equals("LEFT"))
               return ContentDisplay.LEFT;
           else if(cbox.getValue().equals("BOTTOM"))
               return ContentDisplay.BOTTOM;
           else 
               return ContentDisplay.RIGHT;
       }
                
   
	
         public static void main(String[] args) {
        launch(args);
    }
}