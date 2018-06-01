/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Chapter30 {
    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                Thread t2 = new Thread(new PrintNum("t2"));
                t2.start();
                try{
                    for(int i=1;i<=3000;i++){
                        System.out.println(i+" ");
                        
                    Thread.sleep(1000);
                    }
                }catch(InterruptedException e){}
                }
        
    });
        t1.start();
}
}

