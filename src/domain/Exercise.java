/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author vipbi
 */

public class Exercise {
    /**
     * This method populates and outputs an array of prime numbers in the interval between specified values.
     * @param Number1
     * @param Number2
     * @return String[] arr
     */
    public static String[] Calculate(int Number1, int Number2){
        String result = ""; Number1++;
        while(true){
            for(int i = 1, l=0; i<=Number1; i++){
                if(Number1%i==0&&i!=1&&i!=Number1){
                    break;
                }
                else{
                    if(i==Number1){
                        result=result+String.valueOf(Number1)+",";
                    }
                }
            }
            if(Number1==Number2){
                break;
            }
            Number1++;
        }
        if (result != null && result.length() > 0) {
            result = result.substring(0, result.length() - 1);
        }
        String[] arr = new String[10];
        arr = result.split(",");
        return arr;
    }
}
