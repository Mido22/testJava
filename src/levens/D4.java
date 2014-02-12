package levens;

import java.util.ArrayList;

public class D4 {

    public static String levensDistance(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        ArrayList<Long> a1 = new ArrayList<Long>();
        ArrayList<Long> a2 = new ArrayList<Long>();
        StringBuilder sbHead = new StringBuilder("");
        StringBuilder sbTail = new StringBuilder("");
        StringBuilder sb = new StringBuilder("");

        for (char c : s1.toCharArray()) {
            a1.add(new Long(c));
        }
        for (char c : s2.toCharArray()) {
            a2.add(new Long(c));
        }
        while ((a2.size() > 0) && (a1.size() > 0)) {
            if (a1.get(0).equals(a2.get(0))) {
                a1.remove(0);
                a2.remove(0);
                sbHead.append('C');
            } else {
                break;
            }
        }
        while ((a2.size() > 0) && (a1.size() > 0)) {
            if (a1.get(a1.size() - 1).equals(a2.get(a2.size() - 1))) {
                a1.remove(a1.size() - 1);
                a2.remove(a2.size() - 1);
                sbTail.append('C');
            } else {
                break;
            }
        }
        sb = levens(sb, a1, a2);
        return sbHead.append(sb).append(sbTail).toString();
    }

    public static StringBuilder levens(StringBuilder sb, ArrayList<Long> s1, ArrayList<Long> s2) {
        if (s1.isEmpty()) {
            for (Long l : s2) {
                sb.append('I');
            }
            return sb;
        }

        if (s2.isEmpty()) {
            for (Long l : s1) {
                sb.append('D');
            }
            return sb;
        }
        return levens2(sb, s1, s2);
    }

    public static StringBuilder levens2(StringBuilder sb, ArrayList<Long> s1, ArrayList<Long> s2) {
        if (s1.isEmpty()) {
            for (Long l : s2) {
                sb.append('I');
            }
            return sb;
        }

        if (s2.isEmpty()) {
            for (Long l : s2) {
                sb.append('D');
            }
            return sb;
        }

        StringBuilder c1 = new StringBuilder(""), c2 = new StringBuilder(""), c3 = new StringBuilder("");
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

        for (char ch : sb.toString().toCharArray()) {
            c1.append(ch);
            c2.append(ch);
            c3.append(ch);
        }

        if (s11.get(0).equals(s12.get(0))) {
            c1.append('C');
        } else {
            c1.append('S');
        }

        s11.remove(0);
        s12.remove(0);
        c1 = levens2(c1, s11, s12);
        s01.remove(0);
        s02.remove(0);
        c2.append('D');
        c3.append('I');
        c2 = levens2(c2, s01, s2);
        c3 = levens2(c3, s1, s02);
        return min(c1, c2, c3);

    }

    public static StringBuilder min(StringBuilder a1, StringBuilder b1, StringBuilder c1) {

        int a = 0, b = 0, c = 0;
        for (char ch : a1.toString().toCharArray()) {
            if (ch != 'C') {
                a++;
            }
        }
        for (char ch : b1.toString().toCharArray()) {
            if (ch != 'C') {
                b++;
            }
        }
        for (char ch : c1.toString().toCharArray()) {
            if (ch != 'C') {
                c++;
            }
        }
        if (a <= b && a <= c) {
            return a1;
        }
        if (b <= c) {
            return b1;
        }
        return c1;
    }
}
