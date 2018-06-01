/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 

/**
 *
 * @author Admin
 */
public class EX30_04 {
    private static integer a = new integer(); 
 
 public static void main(String args[]) { 
 long startTime = System.currentTimeMillis(); 
 
 ExecutorService exe = Executors.newCachedThreadPool(); 
 for (int i = 0; i < 1000; i++) { 
 exe.execute(new AddOne()); 
 } 
 exe.shutdown(); 
 while (!exe.isTerminated()) { 
 } 
 System.out.println("Value: " + a.getSum()); 
 long timeSpent = System.currentTimeMillis() - startTime; 
 System.out.println("time spend " + timeSpent); 
 } 
 
 static class AddOne implements Runnable { 
 
 @Override 
 public void run() { 
 a.addone(); 
 } 
 
 } 
 
 static class integer { 
 
 private int sum = 0; 
 
 public int getSum() { 
 return sum; 
 } 
 
 public synchronized void addone() { 
 int temp = sum + 1; 
 sum = temp; 
 
 } 
 } 
}

