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
public class d3 {

    public static Sp levensDistance(String s1, String s2) {
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

    public static Sp levens(ArrayList<Long> s1, ArrayList<Long> s2) {

        Sp sp = new Sp("", 0);
        String head = "";
        while (s1.get(0).equals(s2.get(0))) {
            s1.remove(0);
            s2.remove(0);
            head = head + "C";

        }
        String tail = "";
        while (s1.get(s1.size() - 1).equals(s2.get(s2.size() - 1))) {
            s1.remove(s1.size() - 1);
            s2.remove(s2.size() - 1);
            tail = tail + "C";
        }
        sp = levens2(sp, s1, s2);
        sp.addHead(head);
        sp.addTail(tail);
        return sp;
    }

    public static Sp levens2(Sp sp, ArrayList<Long> s1, ArrayList<Long> s2) {

        if (s1.isEmpty()) {
            sp.inc0(s2.size());
            return sp;
        }

        if (s2.isEmpty()) {
            sp.inc0(s1.size());
            return sp;
        }

        ArrayList<Long> s3 = new ArrayList<Long>();
        ArrayList<Long> s4 = new ArrayList<Long>();
        for (Long l : s1) {
            s3.add(l);
        }
        for (Long l : s2) {
            s4.add(l);
        }

        Sp c1 = new Sp(sp);
        Sp c2 = new Sp(sp);
        Sp c3 = new Sp(sp);

        if (s3.get(0).equals(s3.get(0))) {
            c1.incS('C');
        } else {
            c1.incS('S');
            c1.inc();
        }

        s3.remove(0);
        s4.remove(0);
        c1 = levens2(c1, s3, s4);

        ArrayList<Long> s01 = new ArrayList<Long>();
        ArrayList<Long> s02 = new ArrayList<Long>();
        for (Long l : s1) {
            s01.add(l);
        }
        for (Long l : s2) {
            s02.add(l);
        }
        s01.remove(0);
        s02.remove(0);
        c2.incS('D');
        c2.inc();
        c3.incS('I');
        c3.inc();
        c2 = levens2(c2,s01, s2);
        c3 = levens2(c3,s1, s02);
        return min(c1, c2, c3);
    }

    public static Sp min(Sp a, Sp b, Sp c) {
        if (a.getCount() < b.getCount() && a.getCount() < c.getCount()) {
            return a;
        }
        if (b.getCount() < c.getCount()) {
            return b;
        }
        return c;
    }
}
