package levens;

import java.util.ArrayList;

public class Distance2 {

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

        if (s1.get(0).equals(s2.get(0))) {
            s1.remove(0);
            s2.remove(0);
            return levens(s1, s2);
        }
        if (s1.get(s1.size() - 1).equals(s2.get(s2.size() - 1))) {
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

        int c1, c2, c3;
        ArrayList<Long> s11 = new ArrayList<Long>();
        ArrayList<Long> s12 = new ArrayList<Long>();
        ArrayList<Long> s01 = new ArrayList<Long>();
        ArrayList<Long> s02 = new ArrayList<Long>();
        for (Long l : s1) {
            s01.add(l);
        }
        for (Long l : s2) {
            s02.add(l);
        }
        for (Long l : s1) {
            s11.add(l);
        }
        for (Long l : s2) {
            s12.add(l);
        }

        if (s11.get(0).equals(s12.get(0))) {
            c1 = 0;
        } else {
            c1 = 1;
        }

        s11.remove(0);
        s12.remove(0);
        c1 = c1 + levens2(s11, s12);
        s01.remove(0);
        s02.remove(0);
        c2 = 1 + levens2(s01, s2);
        c3 = 1 + levens2(s1, s02);
        return min(c1, c2, c3);

    }

    public static int min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        }
        if (b <= c) {
            return b;
        }
        return c;
    }
}
