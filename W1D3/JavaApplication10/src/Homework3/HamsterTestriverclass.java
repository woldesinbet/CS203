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
public class HamsterTestriverclass {
    public static void main (String [] args){
        Hamster[] hums= new Hamster[100];
        double TotalAge=0;
        for (int i=0; i<hums.length;i++){
            hums[i]= new Hamster();
            hums[i].age = Math.random()*3;
            TotalAge = hums[i].age+TotalAge;
        }
        double AverageAge= TotalAge/100;
        System.out.println("The average age of the hamster = " + AverageAge);   
    }
    
}
