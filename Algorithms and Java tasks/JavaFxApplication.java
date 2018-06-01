/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class JavaFxApplication extends Application {
    String text = "";
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Label lbl = new Label(text);
        root.getChildren().add(lbl);
        
        new Thread(new Runnable(){
           
            public void run(){
                try{
                    while(true){
                        if(lbl.getText().length()==0)
                            text="1C04";
                                    else
                            text="";
                        Platform.runLater(new Runnable(){
                            public void run(){
                                lbl.setText(text);
                            }
                                  
                        });
                                
                        
                    Thread.sleep(300);
                }
            }catch(InterruptedException e){}
        }
                }).start();
        
        
        
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
