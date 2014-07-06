/*
 * Example of how Java Inheritance works,
 */

package test;

import java.util.*;

/**
 *
 * @author mido
 */
public class Child extends Father{
    
    
    public int a=2;
    
    public void print(){
        System.out.println("haha3");
    }
    public void print2(){
        System.out.println("haha4="+a);
        a=4;
    }
    
    public static void main(String args[]){
    
        Father f= new Child();
        System.out.println("a="+f.a);
        f.print();
        f.print2();
        System.out.println("a="+f.a);
        f.print2();
    
    }
}
