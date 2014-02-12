/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author mido
 */
public class DistanceTest2 {

    public static String abc = "abcdefghijklmnopqrstuvwxyz";
    public static ArrayList<Integer> al;

    public static void main(String args[]) {
        al = new ArrayList<Integer>();
        for (char c : abc.toCharArray()) {
            al.add(new Integer(c));
        }
        System.out.println("al=" + al);
        String s1 = "SUNDAY", s2 = "SATURDAY";
        System.out.println("diff bet " + s1 + "," + s2 + "=" + Distance2.levensDistance(s1, s2));
        s1 = "SOPHISTICATED";
        s2 = "SHEPHARD";
        System.out.println("diff bet " + s1 + "," + s2 + "=" + Distance2.levensDistance(s1, s2));
        s1 = "BUILDING";
        s2 = "BUSTING";
        System.out.println("diff bet " + s1 + "," + s2 + "=" + Distance2.levensDistance(s1, s2));
        s1 = "CIVILIZE";
        s2 = "SUFFICE";
        System.out.println("diff bet " + s1 + "," + s2 + "=" + Distance2.levensDistance(s1, s2));
        s1 = "TELEVISION";
        s2 = "TELEPHONE";
        System.out.println("diff bet " + s1 + "," + s2 + "=" + Distance2.levensDistance(s1, s2));
        s1 = "MOUNTING";
        s2 = "MOUNTAIN";
        System.out.println("diff bet " + s1 + "," + s2 + "=" + Distance2.levensDistance(s1, s2));
        s1 = "DRIZZLE";
        s2 = "PUZZLED";
        System.out.println("diff bet " + s1 + "," + s2 + "=" + Distance2.levensDistance(s1, s2));
        s1 = "CONQUER";
        s2 = "QUEUE";
        System.out.println("diff bet " + s1 + "," + s2 + "=" + Distance2.levensDistance(s1, s2));
        s1 = "BREAKFAST";
        s2 = "FAST";
        System.out.println("diff bet " + s1 + "," + s2 + "=" + Distance2.levensDistance(s1, s2));
        s1 = "NOWHERE";
        s2 = "NOW";
        System.out.println("diff bet " + s1 + "," + s2 + "=" + Distance2.levensDistance(s1, s2));
        s1 = "IN";
        s2 = "ITALIAN";
        System.out.println("diff bet " + s1 + "," + s2 + "=" + Distance2.levensDistance(s1, s2));
        String dict1 = "uetvd uehz uhq ukhpg vtfil vhoxkl vktsr whz whnza xoxkr ytq yhq ykhz ahix ctvd cnfil etdx etsr enfi ftsx ghp hmaxkl hoxk hpe jnxnx jnbvd max maxkx maxlx makxx manf";

        ArrayList<String> dict = new ArrayList<String>();
        dict.addAll(Arrays.asList(dict1.split(" ")));
        StringBuffer sb = getCorrect("mad jabbed uk yeh coil book wax peter whiz", dict);
        System.out.println("sb=" + sb);
        System.out.println("al=" + al);
        System.out.println("chances=");
        //HashMap<Long,String> hm = chip2("max jnbvd uhq ykhz cnfil hoxk max etsr whz",7);
        //for(Long key:hm.keySet())
        //    System.out.println("key="+key+", value="+hm.get(key));
        StringBuilder sb3;
        sb3 = new StringBuilder("");
        for (String s4 : sb.toString().split(" ")) {
            sb3.append(" ").append(chip2(s4, 7));
        }
        System.out.println("output=" + sb3.toString());
    }

    public static StringBuffer getCorrect(String s, ArrayList<String> dict) {
        ArrayList<String> in = new ArrayList<String>();
        ArrayList<String> out = new ArrayList<String>();

        StringBuffer sb = new StringBuffer("");
        in.addAll(Arrays.asList(s.split(" ")));
        int count, cCount;
        String closest = "";

        for (String s1 : in) {
            cCount = -1;
            for (String s2 : dict) {
                count = Distance2.levensDistance(s1, s2);

                if (cCount == -1) {
                    cCount = count;
                    closest = s2;
                } else {
                    if (count < cCount) {
                        cCount = count;
                        closest = s2;
                    }
                    if ((count==cCount)&&(s2.length()<closest.length())) {
                    //if (count == cCount) {
                        cCount = count;
                        closest = s2;
                    }
                }
            }
            out.add(closest);
        }

        for (String s1 : out) {
            sb.append(" ").append(s1);
        }
        sb = sb.deleteCharAt(0);
        return sb;
    }

    public static HashMap<Long, String> chip1(String s) {
        HashMap<Long, String> hm = new HashMap<Long, String>();
        StringBuffer sb;
        for (int i = 1; i < 26; i++) {
            sb = new StringBuffer("");
            for (String s2 : s.split(" ")) {
                sb.append(" ").append(chip2(s2, i));
            }
            sb.deleteCharAt(0);
            hm.put(new Long(i), sb.toString());
        }
        return hm;
    }

    public static String chip2(String s, int shift) {
        StringBuilder sb = new StringBuilder("");

        for (char c : s.toCharArray()) {
            sb.append((char) al.get((al.indexOf(new Integer(c)) + shift) % 26).intValue());
        }

        return sb.toString();
    }

}
