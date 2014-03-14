/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.wap.exam;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mido
 */
public class AllCombn {

    public static void main(String arfs[]) {
        System.out.println("output=" + perm(null, new StringBuilder("ABCD"), null));
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
