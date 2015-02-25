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
public class Persontestdriver {
     public static void main(String[] args){
        Person[] person= new Person[5];
        Person person1= new Person();
        person1.name = "John Doe";
        for (int i=0; i<person.length; i++){
            person[i]= person1;
        }
        person[0].name= "John Smith";
        for (int j=0; j<person.length; j++) {
            System.out.println(person[j].name);
    
}
     }
}
