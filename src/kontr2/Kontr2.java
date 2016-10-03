/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontr2;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class Kontr2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int numberString;
        int[][]randomArray = new int[10][10];
        int sum = 0;
        
        int[] offSum = new int[10];
        
        for (int x = 0; x < randomArray.length; x++) {
            for (int c = 0; c < randomArray.length; c++) {
                randomArray[x][c] = rnd.nextInt(10);
                System.out.print(randomArray[x][c] + "\t");
                sum += randomArray[x][c];
                offSum[c] += randomArray [x][c];
                
            }
        
            System.out.printf("|  ", sum);
            System.out.println(sum);
            sum = 0;
            System.out.println("");
        }
        System.out.println("------------------");
        for (int x = 0; x < offSum.length; x++) {
            System.out.printf("%3d", offSum[x]);
        }             
        
        
            //RandomArray[x][c] = (int) (math.random() * 10);
            //System.out.print(RandomArray[x] + "");
        }
        
}
    
