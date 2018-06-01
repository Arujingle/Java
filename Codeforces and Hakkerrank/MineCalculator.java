/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class MineCalculator extends Application {
    double a=0;
    double m=0;
    String n;
    @Override
    public void start(Stage primaryStage) {
         Button b1 = new Button("1");
          b1.setPrefSize(40,30);
          Button b2 = new Button("2");
          b2.setPrefSize(40,30);
          Button b3 = new Button("3");
          b3.setPrefSize(40,30);
          Button b4 = new Button("4");
          b4.setPrefSize(40,30);
          Button b5 = new Button("5");
          b5.setPrefSize(40,30);
          Button b6 = new Button("6");
          b6.setPrefSize(40,30);
          Button b7 = new Button("7");
          b7.setPrefSize(40,30);
          Button b8 = new Button("8");
          b8.setPrefSize(40,30);
          Button b9 = new Button("9");
          b9.setPrefSize(40,30);
          Button b0 = new Button("0");
          b0.setPrefSize(40,30);
          Button bmod = new Button("mod");
          bmod.setPrefSize(40,30);
          Button bmu = new Button("*");
          bmu.setPrefSize(40,30);
          Button bdi = new Button("/");
          bdi.setPrefSize(40,30);
          Button bpl = new Button("+");
          bpl.setPrefSize(40,30);
          Button bmi = new Button("-");
          bmi.setPrefSize(40,30);
          Button bp = new Button(".");
          bp.setPrefSize(40,30);
          Button beq = new Button("=");
          beq.setPrefSize(40,30);
          
          Button bsin = new Button("sin");
          bsin.setPrefSize(40,30);
          Button bcos = new Button("cos");
          bsin.setPrefSize(40,30);
          Button btan = new Button("tan");
          btan.setPrefSize(40,30);
          Button bcot = new Button("cot");
          bsin.setPrefSize(40,30);
          Button broot = new Button("root");
          bsin.setPrefSize(40,30);
          Button bce = new Button("CE");
          bce.setPrefSize(40,30);
          Button bc = new Button("C");
          bsin.setPrefSize(40,30);
        
        
       GridPane root = new GridPane();
       root.setStyle("-fx-border-color:black;"+"-fx-background-color:green;");
       root.setAlignment(Pos.TOP_LEFT);
       root.setPadding(Insets.EMPTY);
       root.setHgap(5);
       root.setVgap(10);
       
       
       
       TextField txt = new TextField(" ");
       root.add(txt, 0, 0,10,1);
       root.add(b1, 1, 1);root.add(b2,2,1);root.add(b3,3,1);root.add(bpl, 4,1);
       root.add(b4, 1, 2);root.add(b5,2,2);root.add(b6,3,2);root.add(bmu, 4, 2);
       root.add(b7, 1, 3);root.add(b8,2,3);root.add(b9,3,3);root.add(bdi, 4, 3);
       root.add(beq, 4, 5);root.add(bc,5,1);root.add(b0,2,4);root.add(bmi, 3, 4);
       root.add(bp, 4, 4);root.add(broot,2,5);root.add(bcot,5,4);root.add(bmod, 1, 4);
       root.add(bcos, 5,5);root.add(btan,5,3);root.add(bsin,5,2);root.add(bce, 3, 5);
       
       
       
       root.setOnKeyPressed(e->{
           switch(e.getCode()){
               case NUMPAD0:txt.setText(txt.getText()+"0");root.add(txt,0,0);break;
               case NUMPAD1:txt.setText(txt.getText()+"1");root.add(txt,0,0);break;
               case NUMPAD2:txt.setText(txt.getText()+"2");root.add(txt,0,0);break;
               case NUMPAD3:txt.setText(txt.getText()+"3");root.add(txt,0,0);break;
               case NUMPAD4:txt.setText(txt.getText()+"4");root.add(txt,0,0);break;
               case NUMPAD5:txt.setText(txt.getText()+"5");root.add(txt,0,0);break;
               case NUMPAD6:txt.setText(txt.getText()+"6");root.add(txt,0,0);break;
               case NUMPAD7:txt.setText(txt.getText()+"7");root.add(txt,0,0);break;
               case NUMPAD8:txt.setText(txt.getText()+"8");root.add(txt,0,0);break;
               case NUMPAD9:txt.setText(txt.getText()+"9");root.add(txt,0,0);break;
                case BACK_SPACE:{String temp = txt.getText();
                          txt.setText(temp.substring(0,temp.length()-1));
                          };break;
               case ADD: a=Double.parseDouble(txt.getText()); n="add";txt.setText("");root.add(txt,0,0);break;
               case SUBTRACT:a=Double.parseDouble(txt.getText());n="minus";txt.setText("");root.add(txt,0,0);break;
             case MULTIPLY:a=Double.parseDouble(txt.getText());n="product";txt.setText("");root.add(txt,0,0);break;
             case DIVIDE:a=Double.parseDouble(txt.getText());n="divide";txt.setText("");root.add(txt,0,0);break;
             case ENTER: double k=0.0; m=Double.parseDouble(txt.getText());
             if(n.equals("add"))k=a+m;
             if(n.equals("minus"))k=a-m;
             if(n.equals("product"))k=a*m;
             if(n.equals("divide"))k=a/m;
             if(n.equals("mod")) k=a%m;
             txt.setText(""+k);
            root.add(txt,0,0);break;}});
       
       b1.setOnAction(e->{txt.setText(txt.getText()+"1");root.add(txt,0,0);});
       b2.setOnAction(e->{txt.setText(txt.getText()+"2");root.add(txt,0,0);});
       b3.setOnAction(e->{txt.setText(txt.getText()+"3");root.add(txt,0,0);});
       b4.setOnAction(e->{txt.setText(txt.getText()+"4");root.add(txt,0,0);});
       b5.setOnAction(e->{txt.setText(txt.getText()+"5");root.add(txt,0,0);});
       b6.setOnAction(e->{txt.setText(txt.getText()+"6");root.add(txt,0,0);});
       b7.setOnAction(e->{txt.setText(txt.getText()+"7");root.add(txt,0,0);});
       b8.setOnAction(e->{txt.setText(txt.getText()+"8");root.add(txt,0,0);});
       b9.setOnAction(e->{txt.setText(txt.getText()+"9");root.add(txt,0,0);});
       b0.setOnAction(e->{txt.setText(txt.getText()+"0");root.add(txt,0,0);});
       bpl.setOnAction(e->{a=Double.parseDouble(txt.getText());
       n="add";
       txt.setText("");root.add(txt, 0, 0);
       });
         bmi.setOnAction(e->{a=Double.parseDouble(txt.getText());
       n="minus";
       txt.setText("");root.add(txt, 0, 0);
       });
          bmu.setOnAction(e->{a=Double.parseDouble(txt.getText());
       n="product";
       txt.setText("");root.add(txt, 0, 0);});
          
       
         bdi.setOnAction(e->{a=Double.parseDouble(txt.getText());
       n="divide";
       txt.setText("");root.add(txt, 0, 0);});
       
           bmod.setOnAction(e->{a=Double.parseDouble(txt.getText());
       n="mod";
       txt.setText("");root.add(txt, 0, 0);
       });
             broot.setOnAction(e->{double r = Double.parseDouble(txt.getText());
             txt.setText(Math.sqrt(r)+"");root.add(txt,0,0);});
             
        bc.setOnAction(e->{
       txt.setText("");root.add(txt, 0, 0); });
        
     bce.setOnAction(e->{String temp = txt.getText();
             txt.setText(temp.substring(0,temp.length()-1));root.add(txt,0,0);});
             
         bp.setOnAction(e->{ if(txt.getText().contains("."))
                    txt.getText();
         else txt.setText(txt.getText()+".");root.add(txt,0,0); });
                
                
         bsin.setOnAction(e->{double r = Double.parseDouble(txt.getText());
               txt.setText(Math.sin(r)+"");root.add(txt,0,0);});
               
         bcos.setOnAction(e->{double r = Double.parseDouble(txt.getText());
               txt.setText(Math.cos(r)+"");root.add(txt,0,0);});
         
          btan.setOnAction(e->{double r = Double.parseDouble(txt.getText());
               txt.setText(Math.tan(r)+"");root.add(txt,0,0);});
          bcot.setOnAction(e->{double r=Double.parseDouble(txt.getText());
              txt.setText((1/(Math.tan(Math.toRadians(r))))+""); root.add(txt,0,0);});
          
          beq.setOnAction(e->{
              double k=0.0;
              m=Double.parseDouble(txt.getText());
              if(n.equals("add")) k= a+m;
              if(n.equals("minus")) k=a-m;
              if(n.equals("mod")) k=a%m;
              if(n.equals("product")) k=a*m;
              if(n.equals("divide")) k=a/m;
              txt.setText(""+k);
              root.add(txt,0,0);
          });     
          
        Scene scene = new Scene(root, 250, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
          primaryStage.setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
