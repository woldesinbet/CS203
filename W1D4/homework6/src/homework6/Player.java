/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework6;
import java.util.Scanner;
/**
 *
 * @author lealemmum
 */
public class Player {
    int number;
    public int guess(){
        Scanner input = new Scanner(System.in);
        String console = input.nextLine();
        number= Integer.parseInt(console);
        //System.out.println("I'm guessing"+ console);
       return number;
    
}
}
