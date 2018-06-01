/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MylinkedList;
 import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class Quiz3 {
   


 public static void main(String[] args) throws Exception {
 
     
     
      String myDriver="com.mysql.jdbc.Driver";
                    String myURl ="jbdc:mysql://Localhost/dbname";
                    
       try {
            Connection conn = DriverManager.getConnection(myURl, root, "");
 
            String sql = "SELECT";
            PrepareStatement statement = conn.prepareStatement(sql);
            statement.setString("");
            statement.setInt("");
 
            ResultSet result = statement.executeQuery();
            
            if (result.next()) {
               
           ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Downloads\\f.dat"));;
               ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Downloads\\f.dat"));;
                 
                int value;
                while ((value = input.read()) != -1)
                    System.out.print(value + " ");
 
                input.close();
                output.close();
                System.out.println("File saved");
            }
            conn.close();
            
            int[] i = new int[3];
            String s = new String();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
     
     
     
     
     
     
     
     
     
        

       try(
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("f.dat"));
               ){
        for (int i = 1; i <= 10; i++){
            output.write(i);}
        try(
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("f.dat"));
                )

            }
      
       

            

                    while ((value = in.read()) != -1)
                        output.write(value);
                    String myDriver="com.mysql.jdbc.Driver";
                    String myURl ="jbdc:mysql://Localhost/dbName";
                    Connection conn = DriverManager.getConnection(myURl, root, "");

                }
            }
        }

    }
}
}
