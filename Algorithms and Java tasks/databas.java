/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MylinkedList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class databas {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost/test";
        String myDriver = "com.mysql.jdbc.Driver";
        Class.forName(myDriver);
        Connection con;
        try{
            con=DriverManager.getConnection(url,"root","");
            System.out.println("Connected to"+url);
            String s = "CREATE TABLE Students("
                    +"id INT(11) NOT NULL AUTO_INCREMENT,"
                    +"name VARCHAR(255),"
                    +"surname VARCHAR(255),"
                    +"gpa DOUBLE(64),PRIMARY_KEY
        
    }catch (Exception e){
        e.printStackTrace();
    }
}
}