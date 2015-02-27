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
public class SmallestNumber {
   public static void main (String[] args){
        double [] nums= new double[100];
        double smallest=nums[0];
        for(int i=0; i<nums.length;i++){
            nums[i]= Math.random()*100;
            if(nums[i]<smallest){
                smallest= nums[i];
            }   
        }
        System.out.println( "The smallest number is " +smallest);
    }
}
    

