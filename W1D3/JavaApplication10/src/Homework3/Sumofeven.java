/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework3;

/**
 *
 * @author lealemmum
 */
public class Sumofeven {
    public static void main (String [] args){
    int[] nums= {3, 8, 4, 10, 14, 5, 21};
    int i=0;
    int sum=0;
    while (i<nums.length){
        if(nums[i]%2==0){
            sum= nums[i]+sum;
        }
        i++;
    }
    System.out.println("Total sum = "+ sum);
    }
}
    
    
    

    
    
    
    
    

