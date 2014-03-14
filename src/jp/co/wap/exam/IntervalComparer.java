/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.wap.exam;
import java.util.Comparator;
import jp.co.wap.exam.lib.Interval;

public class IntervalComparer implements Comparator<Interval> {

    @Override
    public int compare(Interval x, Interval y) {
        int startComparison = compare(x.getBeginMinuteUnit(), y.getBeginMinuteUnit());
        return startComparison !=0 ?  startComparison : compare(x.getEndMinuteUnit(), y.getEndMinuteUnit()); 
    }
     private static int compare(long a, long b) {
    return a < b ? -1
         : a > b ? 1
         : 0;
  }
}
