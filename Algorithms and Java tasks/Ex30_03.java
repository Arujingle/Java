/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MylinkedList;



/**
 *
 * @author Admin
 */
import java.io.File;
import javafx.application.Application; 
import javafx.application.Platform; 
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView; 
import javafx.scene.layout.Pane; 
import javafx.stage.Stage; 
 
/** 
 * 
 * @author Lenovo 
 */ 
public class Ex30_03 extends Application { 
 
 int i = 200; 
 public void start(Stage primaryStage) { 
 Pane root = new Pane(); 
  Image img = new Image(new File("C:\\Users\\Admin\\Downloads\\flag.jpg").toURI().toString());
       ImageView iv = new ImageView(img);
 
 
 
 Scene scene = new Scene(root, 300, 250); 
 iv.setFitHeight(75); 
 iv.setFitWidth(150); 
 iv.setLayoutX(80); 
 new Thread(new Runnable() { 
 @Override 
 public synchronized void run() { 
 try { 
 while (true) { 
 if (i>0) { 
 i--; 
 } else if(i==0) { 
 i=200; 
 } 
 Platform.runLater(new Runnable() { 
 @Override 
 public void run() { 
 iv.setLayoutY(i); 
 } 
 }); 
 
 Thread.sleep(15); 
 } 
 } catch (InterruptedException e) { 
 } 
 } 
 }).start(); 
 
 
 root.getChildren().add(iv); 
 
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

    /**
     * @param args the command line arguments
     */
   
