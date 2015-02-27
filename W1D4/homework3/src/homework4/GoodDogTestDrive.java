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
class GoodDogTestDrive {

    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.print("Dog one:" + one.getSize());
        System.out.print("Dog one:" + two.getSize());
        one.bark();
        two.bark();
    }
}
