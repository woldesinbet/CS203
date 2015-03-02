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
public class TestComparison {
    public static void main(String[] args){
        byte b = 5;
short s = 5;
int i = 5;
long L= 5;
float f = 5.0f;
double d = 5.0;
String s1 = "Mi";
String s2 = "Mi";
String s3 = "MiMi";
String s4=s1+s2;
 System.out.println((short)s == (int)i);
 System.out.println((long)L == (float)f);
 System.out.println((float)f == (double)i);
 System.out.println((long)L == (int)i);
 System.out.println((float)f == (int)i);
 System.out.println((double)i == (int)i);
  System.out.println(s4.equals(s3));
  
  
  
  
 
 
 

    }
    
}
