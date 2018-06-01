/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.input.KeyCode;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;

public class EX16_21 extends Application {
	protected TextField txf = new TextField();
	protected Media media = new Media(new File("C:\\Users\\Admin\\Downloads\\classic.mp3").toURI().toString());
	protected MediaPlayer mediaPlayer = new MediaPlayer(media);
	protected Timeline animation;
        public void start(Stage primaryStage){
            txf.setAlignment(Pos.CENTER);
            txf.setFont(Font.font(60));
            txf.setPrefColumnCount(4);
            
            mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
            StackPane pane = new StackPane(txf);
            animation = new Timeline(new KeyFrame(Duration.millis(1000),e->run()));
            animation.setCycleCount(Timeline.INDEFINITE);
            
            txf.setOnKeyPressed(e->{
                if(e.getCode()==KeyCode.ENTER){
                    animation.play();
                }
            });
            
        Scene scene = new Scene(pane);
        primaryStage.setTitle("EX16_21");
        primaryStage.setScene(scene);
        primaryStage.show();
}

private void run(){
    if(Integer.parseInt(txf.getText())>0){
        mediaPlayer.pause();
        mediaPlayer.seek(Duration.ZERO);
        txf.setText(String.valueOf(Integer.parseInt(txf.getText())-1));
    }
    if(txf.getText().equals("0")){
        animation.pause();
        mediaPlayer.play();
    }
}
	
        
        
         public static void main(String[] args) {
        Application.launch(args);
    }
}
