package jp.co.wap.exam;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jp.co.wap.exam.lib.Interval;

public class Problem2  implements Comparator<Interval> {


    public int getMaxWorkingTime(List<Interval> intervals) {
        if(intervals==null)
            return 0;
        
        if(intervals.isEmpty())
            return 0;        
        
        if(intervals.contains(null))
            return 0;
        
        if(intervals.size()==1)
            return intervals.get(0).getIntervalMinute();
        
        if(intervals.size()>10000)
            return 0;
        
        Collections.sort(intervals, this);   
        return maxWorkingTime(0,intervals,0 );
    }
    
    
    
    public int maxWorkingTime(int idx, List<Interval> intervals, int sum){
        if (idx == intervals.size()) 
            return sum;
                
        int tSum, mSum=0, i=idx+1;
        
        while (i < intervals.size() && intervalOverlaps(intervals.get(idx), intervals.get(i))) {
            
            tSum = maxWorkingTime(i, intervals, sum);
            if (tSum > mSum) 
                mSum = tSum;            
            i++;            
        }
        
        tSum = maxWorkingTime(i, intervals, intervals.get(idx).getIntervalMinute() + sum);
        if (tSum > mSum) 
            mSum = tSum;              
        return mSum;
    }
    
    
    
    public boolean intervalOverlaps(Interval o1, Interval o2){
        return o2.getBeginMinuteUnit()<=o1.getEndMinuteUnit();
    }
    
    
    
    @Override
    public int compare(Interval o1, Interval o2) {
        int result = o1.getBeginMinuteUnit()-o2.getBeginMinuteUnit();
        if(result>0)
            return 1;
        if(result<0)
            return -1;
        
        return (o1.getEndMinuteUnit()> o2.getEndMinuteUnit()) ? 1 : ((o1.getEndMinuteUnit() < o2.getEndMinuteUnit()) ? -1 : 0);
    }
    
    
}
