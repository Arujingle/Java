/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MylinkedList;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("Localhost",8000);
        Socket socket = server.accept();
        
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.nextLine();
            out.writeUTF(s);
            out.flush();
            System.out.print(readUTF(s));
    }
}
