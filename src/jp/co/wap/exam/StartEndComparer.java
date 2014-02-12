/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.wap.exam;
import java.util.Comparator;
/**
 *
 * @author seshasayana
 */
class StartEndComparer implements Comparator<StartEndList> {
      
    @Override
    public int compare(StartEndList x, StartEndList y) {
       int startComparison = compare(x.getPoint(), y.getPoint());
        return startComparison ;
    }

    private int compare(long a, long b) {
        return a < b ? -1
         : a > b ? 1
         : 0;
    }
}
