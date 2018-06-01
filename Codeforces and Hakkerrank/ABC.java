
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ABC {
    String[] aa;
    static ArrayList<Integer> aq = new ArrayList<Integer>();
    static ArrayList<Integer> bq = new ArrayList<Integer>();
    static ArrayList<Integer> cq = new ArrayList<Integer>();
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt();
        int b =scn.nextInt();
        int c=scn.nextInt();
        pro(a+"","",aq);
        pro(b+"","",bq);
        pro(c+"","",cq);
        
        
        
        for(int i=0;i<aq.size();i++){
            for(int j=0;j<bq.size();j++){
                for(int g=0;g<cq.size();g++){
                    if(aq.get(g)+bq.get(j)==cq.get(i)){System.out.println(aq.get(g)+"+"+bq.get(j)+"="+cq.get(i));}
                }
            }
        }
    }
    static void pro(String in, String ou,ArrayList<Integer> list){
        if(in.length()==0) list.add(Integer.parseInt(ou));
        else{
            for(int i=0;i<in.length();i++){
                pro(in.substring(0,i)+in.substring(i+1),ou+in.charAt(i),list);
                
                    
                    
                    
                }
            }
        } 
        
    }

