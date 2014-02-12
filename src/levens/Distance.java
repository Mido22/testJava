/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levens;

import java.util.ArrayList;

/**
 *
 * @author mido
 */
public class Distance {

    public static int levensDistance(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        ArrayList<Long> a1 = new ArrayList<Long>();
        for (char c : s1.toCharArray()) {
            a1.add(new Long(c));
        }

        ArrayList<Long> a2 = new ArrayList<Long>();
        for (char c : s2.toCharArray()) {
            a2.add(new Long(c));
        }
        return levens(a1, a2);
    }

    public static int levens(ArrayList<Long> s1, ArrayList<Long> s2) {
        if (s1.isEmpty()) {
            return s2.size();
        }

        if (s2.isEmpty()) {
            return s1.size();
        }

//        if (s1.size() == s2.size()) {
//            return equalLength(s1, s2);
//        }

        if (s1.get(0).equals(s2.get(0))) {
            s1.remove(0);
            s2.remove(0);
            return levens(s1, s2);

        }
        if (s1.get(s1.size()-1).equals(s2.get(s2.size()-1))) {
            s1.remove(s1.size() - 1);
            s2.remove(s2.size() - 1);
            return levens(s1, s2);
        }
        return levens2(s1, s2);
    }

    public static int levens2(ArrayList<Long> s1, ArrayList<Long> s2) {

        if (s1.isEmpty()) {
            return s2.size();
        }

        if (s2.isEmpty()) {
            return s1.size();
        }

        ArrayList<Long> s3 = (ArrayList<Long>) s1.clone();
        ArrayList<Long> s4 = (ArrayList<Long>) s2.clone();

        int c1, c2, c3;

//        if (s1.size() == s2.size()) {
//            return equalLength(s1, s2);
//        }

        if (s3.get(0).equals(s3.get(0)))
            c1 = 0;
         else 
            c1 = 1;
        

        s3.remove(0);
        s4.remove(0);
        c1 =c1+ levens2(s3,s4);
        ArrayList<Long> s01 = (ArrayList<Long>) s1.clone();
        ArrayList<Long> s02 = (ArrayList<Long>) s2.clone();
        s01.remove(0);        
        s02.remove(0);
        c2 = 1 + levens2(s01, s2);
        c3 = 1 + levens2(s1, s02);
        return min(c1, c2, c3);

//        ArrayList<Long> smaller, larger;
//        if (s1.size() > s2.size()) {
//            smaller = s2;
//            larger = s1;
//        } else {
//            smaller = s1;
//            larger = s2;
//        }
//        
//        ArrayList<Long> larger1 = (ArrayList<Long>) larger.clone();
//        ArrayList<Long> smaller1 = (ArrayList<Long>) smaller.clone();
//        larger1.remove(larger.size()-1);
//        
//        smaller1.remove(smaller.size()-1);
//        c2 = 1 + levens2(larger1, smaller);
//        c3 = 1 + levens2(larger, smaller1);
//        return min(c1, c2, c3);
        
        
        
    }

//    public static int equalLength(ArrayList<Long> s1, ArrayList<Long> s2) {
//        int count = 0;
//        for (int i = 0; i < s1.size(); i++) {
//            if (!s1.get(i).equals(s2.get(i))) {
//                count++;
//            }
//        }
//
//        return count;
//    }

    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        if (b < c) {
            return b;
        }
        return c;
    }
}
