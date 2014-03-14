/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package works.old;

/**
 *
 * @author mido
 */
public class ssd {
    
    public static void main(String args[]){
        String s="asdasdas,,**asd,,asdasd";
        int i=s.indexOf('*');
        System.out.println("s1="+s.substring(0, i));
        System.out.println("s2="+s.substring( i+1));
    }
}
