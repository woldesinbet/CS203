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
class GoodDog {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("woof! Woof");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff");
        } else {
            System.out.println("Yip!Yip");
        }
    }

}
