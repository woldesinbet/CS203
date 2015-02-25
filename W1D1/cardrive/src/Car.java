/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lealemmum
 */
public class Car {
    private int x;
    private int y;
    
    
    
    public void moveUp(){
        this.y +=1;
    }
    public void moveLeft(){
        this.x -=1;
    }
    
    public void printLocation(){
        System.out.println("("+ this.x + "," + this.y + ")");
    }
    
    public static void main(String[] args){
        Car myCar = new Car();
        Car yourCar = new Car();
        myCar.moveUp();
        yourCar.moveLeft();
        myCar.printLocation();
        yourCar.printLocation();
    }
    
}
