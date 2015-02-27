/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

/**
 *
 * @author lealemmum
 */
public class BetterCar {

    private int x;
    private int y;

    public void moveUp(int num) {
        this.y += num;
    }

    public void moveLeft(int num) {
        this.x -= num;
    }

    public void moveRight(int num) {
        this.x += num;

    }

    public void moveDown(int num) {
        this.y -= num;

    }

    public String returnLocation() {
        return "(" + this.x + "," + this.y + ")";
    }

    public static void main(String[] args) {
        BetterCar myCar = new BetterCar();
        BetterCar yourCar = new BetterCar();
        myCar.moveUp(2);
        yourCar.moveLeft(3);
        myCar.moveDown(2);
        yourCar.moveRight(3);

    }
}
