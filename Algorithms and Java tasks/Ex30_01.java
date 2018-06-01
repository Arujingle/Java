/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MylinkedList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class Ex30_01 extends Application { 
 
 @Override 
 public synchronized void start(Stage primaryStage) { 
 TextArea area = new TextArea(); 
 StackPane root = new StackPane(); 
 Runnable printA = new PrintChar('a', 100, area); 
 Runnable printB = new PrintChar('b', 100, area); 
 Runnable print100 = new PrintNum(100, area); 
 
 Thread thread1 = new Thread(printA); 
 Thread thread2 = new Thread(printB); 
 Thread thread3 = new Thread(print100); 
 thread1.start(); 
 thread2.start(); 
 thread3.start(); 
 root.getChildren().add(area); 
 Scene scene = new Scene(root, 300, 250); 
 primaryStage.setTitle("Hello World!"); 
 primaryStage.setScene(scene); 
 primaryStage.show(); 
 } 
 
 class PrintChar implements Runnable { 
 
 private char charToPrint; 
 private int times; 
 private TextArea area; 
 
 public PrintChar(char c, int t, TextArea area) { 
 charToPrint = c; 
 times = t; 
 this.area = area; 
 } 
 
 @Override 
 
 public synchronized void run() { 
 for (int i = 0; i < times; i++) { 
 synchronized (area) { 
 area.appendText(charToPrint + ""); 
 } 
 } 
 } 
 
 } 
 
 class PrintNum implements Runnable { 
 
 private int lastNum; 
 private TextArea area; 
 
 public PrintNum(int n, TextArea area) { 
 lastNum = n; 
 this.area = area; 
 } 
 
 @Override 
 public synchronized void run() throws IndexOutOfBoundsException { 
 for (int i = 1; i <= lastNum; i++) { 
 synchronized (area) { 
 area.appendText(" " + i); 
 } 
 } 
 } 
 
 } 
 
 public static void main(String[] args) { 
 launch(args); 
 
 } 
 
}
    /**
     * @param args the command line arguments
     */
   