
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
public class Sudoku {
private static int n;
private static int m;
    public static void main(String[] args){


int[][] grid = readASolution();
  
    System.out.println(isValid(grid)? "Correct solution":"Incorrect solution");
    }
  public static int[][] readASolution(){
  Scanner in = new Scanner(System.in);
  System.out.println("Enter a number N:");
  int n=in.nextInt();
  System.out.println("Enter a Sudukku puzzle:");
  m=(int) Math.pow(n,2);
   int[][] grid = new int[m][m];
    for(int i=0;i<m;i++)
    for(int j=0;j<m;j++)
        grid[i][j]=in.nextInt();
  
        return grid;
    }

    public static boolean isValid(int[][] grid){
       
        for(int i=0;i<m;i++)
            for(int j=0;j<m;j++)
                if((grid[i][j]< 1 ||grid[i][j]> m )|| !isValid(i,j,grid))
                        return false;
                   return true;
    }
    
    
    public static boolean isValid(int i,int j,int[][] grid){
    
    for(int column=0;column<m;column++)
if(column!=j && grid[i][column]==grid[i][j])
return false;
    
    for(int row =0;row<m;row++)
        if(row!=i && grid[row][j]==grid[i][j])
            return false;

return true;

}
}
