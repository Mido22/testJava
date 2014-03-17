/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.co.wap.exam;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mido
 */
public class Brackets2 {
    
    
    public static void main(String arfs[]) {
        System.out.println("output=" + bracks(10));
    }
    
    public static ArrayList<String> bracks(int count){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<count;i++)
            sb.append("()");
        
        Set<String> s=perm(null, sb, null);
        System.out.println("s"+s);
        ArrayList<String> al= new ArrayList<String>();
        for(Object st:s.toArray())
            if(validateBracks((String)st))
                al.add((String)st);
        return al;
        
    }

    public static boolean  validateBracks(String s){
        int i=0;
        for(char ch:s.toCharArray()){
            if(ch=='(')
                i++;
            else
                i--;
            if(i<0)
                return false;
        }
        if(i==0)
            return true;
        return false;
    }
    
    public static boolean  validateBracks2(String s){
        int i=0;
        for(char ch:s.toCharArray()){
            if(ch=='(')
                i++;
            else
                i--;
            if(i<0)
                return false;
        }
        return true;
    }
    
    public static Set<String> perm(StringBuilder a, StringBuilder b, Set<String> s) {
        StringBuilder a1, b1;
        if (a == null) {
            a = new StringBuilder("");
        }
        if (s == null) {
            s = new TreeSet<String>();
        }
        if (b.length() == 0) {
            return s;
        }
        if(!validateBracks2(a.toString()))
            return s;
        a1 = new StringBuilder(a);
        b1 = new StringBuilder(b);
        if (b1.length() == 1) {
            s.add(a1.append(b1).toString());
            return s;
        }
        for (int i = 0; i < b.length(); i++) {
            perm(a1.append(b.charAt(i)), b1.deleteCharAt(i), s);
            a1 = new StringBuilder(a);
            b1 = new StringBuilder(b);
        }

        return s;
    }
    
}
