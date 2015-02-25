/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lealemmum
 */
public class Cat {
    private String name;
    private String gender;
    private int age;
    
    Cat(){
        
    }
    
    Cat(String nam, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void purr(){
        System.out.println(this.name + " is purring");
    }
    
    public void sleep(){
        System.out.println(this.name + " is sleeping");
    }
    
    public static void main(String[] args){
        Cat rich = new Cat();
        rich.setName("Rich");
        rich.purr();
        System.out.println(rich.getAge());
        Cat bob = new Cat("Bob", "Male", 2);
        bob.purr();
        System.out.println(bob.getAge());
        
    }
    
}
