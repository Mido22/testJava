package jp.co.wap.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jp.co.wap.exam.lib.Interval;

public class Problem1  implements Comparator<Task> {


    public int getMaxIntervalOverlapCount(List<Interval> intervals) {
        
        int mCount=0;
        int count=0;
        if(intervals==null)
            return mCount;
        
        if(intervals.isEmpty())
            return mCount;
        
        if(intervals.contains(null))
            return mCount;
        
        ArrayList<Task> taskList =  new ArrayList<Task>();
        for(Interval i:intervals){
            taskList.add(new Task(i.getBeginMinuteUnit(),1));
            taskList.add(new Task(i.getEndMinuteUnit(),-1));
        }
        
        Collections.sort(taskList, this);
        
        for(Task t : taskList){
            count+=t.getStart();
            if(count>mCount)
                mCount=count;
        }        
        
        return mCount;
    }
    
    
    @Override
    public int compare(Task o1, Task o2) {
        return (o1.getTime() < o2.getTime()) ? -1 : ((o1.getTime() > o2.getTime()) ? 1 : 0);
    }
}
