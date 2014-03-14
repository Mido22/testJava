
package works.old;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import works.old.lib.Interval;

public class Problem1 {

    
    public   int  getMaxIntervalOverlapCount(List<Interval> intervals) {
        
        if(intervals== null) return 0;
        if(intervals.isEmpty()) return 0;
        
        
        int maxCount =0,  count =0;
        
        List<StartEndList> sl =    new ArrayList<> ();
        for (Interval i : intervals) {
            sl.add(new  StartEndList(i.getBeginMinuteUnit(), 1));
            sl.add(new  StartEndList(i.getEndMinuteUnit(), -1));
        }
        
         StartEndComparer comparator = new StartEndComparer(); 
        
        Collections.sort(sl ,comparator);
        
        for(StartEndList slItem: sl)
        {
            
            count = count+ slItem.getMarker();
            if(count>maxCount )
                maxCount = count;
        }
              
        return maxCount;
    }
       
    
}
