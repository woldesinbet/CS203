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
public class Dog {
    String name;
   
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.bark();
        dog1.name="barty";
        Dog[] myDogs=new Dog[3];
        myDogs[0]=new Dog();
        myDogs[1]=new Dog();
        myDogs[2]=dog1;
        myDogs[0].name="fred";
        myDogs[1].name="marge";
        System.out.print("last dog's name is");
        System.out.print(myDogs[2].name);
        int x=0;
        while(x<myDogs.length){
            myDogs[x].bark();
            myDogs[x].chaseCat();
            myDogs[x].eat();
            x=x+1;
        }
       
        }
    public void bark(){
        System.out.println(name+"say Ruff");
    }
    public void eat(){
        System.out.println(name+"say eat");
    }
    public void chaseCat(){
        System.out.print(name+"say ChaseCat");
    }
        
            
           
        
        
        
        
        
        // TODO code application logic here
    }
    

