/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MylinkedList;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Server {
    public static void main(String args[]) throws Exception {
        ServerSocket server = new ServerSocket(8000);
     Scanner sc = new Scanner(System.in);
     
        Socket socket = server.accept();
        
       
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
       
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        while(true){
            String cname = in.readUTF();
            
           String s = in.readUTF();
           System.out.println(cname + ":"+s);
           String msg = sc.nextLine();
           out.writeUTF(s+" "+s);
           
        }
    }
}
