
import java.io.File;
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
public class Museum {
    public static void main(String[] args)throws Exception{
        File file = new File("C:\\Users\\Admin\\Desktop\\museum.txt");
        Scanner scn = new Scanner(file);
        int n = Integer.parseInt(scn.next());
        int min = 24*60;
        int max=0;
        int MaxPeople=0;
        int[][]AllTime = new int[n][2];
        
        for(int i=0;i<n;i++){
            String first = scn.next();
            String second = scn.next();
            AllTime[i][0]=Integer.parseInt(first.split(":")[0])*60+Integer.parseInt(first.split(":")[1]);
            AllTime[i][1]=Integer.parseInt(second.split(":")[0])*60+Integer.parseInt(second.split(":")[1]);
            if(AllTime[i][0]<min)
                min = AllTime[i][0];
            if(AllTime[i][1]>max)
                max = AllTime[i][1];
        }
        for(int i=min;i<max;i++){
            int counter =0;
            for(int j=0;j<n;j++){
                if(AllTime[j][0]<=i&&i<=AllTime[j][1]) counter++;
                if(counter>MaxPeople)
                    MaxPeople=counter;
                
            }
                
            
            
                    
        }
        
        
        System.out.println(MaxPeople);
    }
}
