
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Ch30 {
    static Account account = new Account();
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(3);
  for(int i =0;i<100;i++)
      executor.execute(new AddTenge());
      executor.shutdown();
    
    while(!executor.isTerminated()){}
    System.out.println("Balance:"+account.getBalance());
    

    }
    static class AddTenge implements Runnable{
        public void run(){
            account.deposit(1);
        }
    }
    
    
    static class Account{
        private int balance =0;
        public int getBalance(){
            return balance;
        }
        public void deposit(int amount){
            int temp = balance +amount;
            try{
                Thread.sleep(1);
                
            }catch(InterruptedException e){}
            balance =temp;
        }
    }
    
    
}
