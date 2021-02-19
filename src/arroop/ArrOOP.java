/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arroop;

import domain.Exercise;
import java.util.Scanner;

/**
 *
 * @author vipbi
 */
public class ArrOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String[] arr = Exercise.Calculate(in.nextInt(),in.nextInt());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
