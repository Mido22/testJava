/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.propertyguru;

import java.util.HashSet;

/**
 *
 * @author mido
 */
public class Jaba {
    
    public int findBestSet(int[] A) {
        int best = 0;
        if (A == null || A.length == 0) {
            return best;
        }
        HashSet<Integer> done = new HashSet<Integer>();
        int tmp, tmpI;
        for (int i = 0; i < A.length; i++) {
            if (done.contains(i)) {
                continue;
            }
            tmp = 0;
            tmpI = i;
            do {
                done.add(tmpI);
                tmpI = A[tmpI];
                tmp++;
            } while (!done.contains(tmpI));
            if (tmp > best) {
                best = tmp;
            }
            
        }
        return best;
    }
    
    private int solution(Tree T) {
        if (T.l == null || T.r == null) {
            return 0;
        }
        return getAmplitude(T, new X(T.x)).get();
        // write your code in Java SE 7
    }
    
    private X getAmplitude(Tree T, X x) {
        X y = new X(x);
        if (T.l == null || T.r == null) {
            y.set(T.x);
            return y;
        }
        X yl = getAmplitude(T.l, y);
        X yr = getAmplitude(T.r, y);
        
        return yl.best(yr);
    }
    
    class Tree {
        
        public int x;
        public Tree r, l;
    };
    
    class X {
        
        int min;
        int max;
        
//        X() {
//            min = 0;
//            max = 0;
//        }
//        
        X(X x) {
            this.min = x.min;
            this.max = x.max;
        }
        
        X(int m, int n) {
            min = n;
            max = m;
        }       
        
        X(int m) {
            min = m;
            max = m;
        }
        
        public void set(int n) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        
        public int get() {
            return max - min;
        }
        
        public X best(X x2) {
            if (x2.get() > this.get()) {
                return x2;
            }
            return this;
        }        
    };
    
}
