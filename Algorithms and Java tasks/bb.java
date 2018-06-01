/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class bb extends Application {
      private TextField textField = new TextField(); 
    @Override
    public void start(Stage primaryStage) {
      
       
        
      List<String> buttons = Arrays.asList("7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "=", "/", "EE");

    FlowPane pane = new FlowPane();
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(30, 20, 30, 20));
    pane.setHgap(5);
    pane.setVgap(5);
    pane.setMinWidth(400);
    pane.setPrefWidth(400);
    pane.setMaxWidth(400);

    textField.setEditable(false);
    textField.setAlignment(Pos.CENTER);
    textField.setMinSize(336, 40);
    // Rezultat.textProperty().bind(Bindings.format("%.0f", value));
    pane.getChildren().add(textField);

    for (String button : buttons) {
        Button b = new Button(button);
        b.setMinSize(80, 80);
        pane.getChildren().add(b);
        b.setOnAction((e) -> doSomething(b.getText()));
    }

        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


private void doSomething(String text) {

    if (text.equalsIgnoreCase("=")) {
        // Calc
    }

    else if (text.equalsIgnoreCase("EE")) {
        // EE
    } else if (text.equalsIgnoreCase("+") || text.equalsIgnoreCase("-") || text.equalsIgnoreCase("*") || text.equalsIgnoreCase("/")) {
        // + - * /
    }
    // ....
    else {
        // numeric
        textField.appendText(text);
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
