/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class Mediawork extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
      BorderPane root = new BorderPane();
      Media media = new Media(new File("C:\\Users\\Admin\\Desktop\\PHP MySQL Tutorial_ Create a Database and Table in phpMyAdmin -HD.mp4").toURI().toString());
      MediaPlayer mp = new MediaPlayer(media);
      MediaView mv = new MediaView(mp);
      mv.setFitWidth(800);
      mv.setFitHeight(600);
      mp.play();
      root.setCenter(mv);
      HBox hb = new HBox(10);
      hb.setAlignment(Pos.CENTER);
      Button b = new Button(">");
      hb.getChildren().add(b);
      b.setOnAction(e->{
          if(b.getText().equals(">")){
              mp.play();
              b.setText("||");
          }else mp.pause();
          b.setText(">");
      
          });
      
   
      root.setCenter(mv);
      root.getButton()
      
        
        Scene scene = new Scene(root, 300, 250);
        
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
