/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class PrintNum implements Runnable {
    String name;
    public PrintNum(String name){
        this.name = name;
    }
    public void run(){
        for(int i =1;i<=3000;i++)
            System.out.println(name+":"+i+" ");
    }
    
    
    
}
