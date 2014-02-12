/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.wap.exam;

import java.util.Collections;
import java.util.List;
import jp.co.wap.exam.lib.Interval;
/**
 *
 * @author seshasayana
 */
public class Problem2 {
    
    
    
      public   int  getMaxWorkingTime(List<Interval> intervals) {
          if(intervals== null) return 0;
          if(intervals.isEmpty()) return 0;
            if(intervals.size()>10000) return 0;
            
            
            
            IntervalComparer comparator = new IntervalComparer(); 
          Collections.sort(intervals ,comparator);
          
         
          
          return getMaxWorkingTimeWithRecursion(0, intervals, 0) ;
      }

    private int getMaxWorkingTimeWithRecursion(int indexer, List<Interval> intervals, int result) {
      if(indexer== intervals.size()) return result;
      int nextIndexer =   indexer+1, tempResult=0, thisResult=0, maxResult=0;
     
      thisResult =  intervals.get(indexer).getIntervalMinute() + result ;
      
    
      while(nextIndexer<intervals.size()&& intervalsOverlaps(intervals.get(indexer), intervals.get(nextIndexer)))
              {
    
                tempResult=  getMaxWorkingTimeWithRecursion(nextIndexer, intervals, result);
              
           
                if(tempResult> maxResult)
                maxResult= tempResult;
                        nextIndexer++;
             
              }
      
      thisResult= getMaxWorkingTimeWithRecursion(nextIndexer,intervals, thisResult);
      
      if (thisResult> maxResult)
        return thisResult;
      
      return maxResult;
        
    }

    private boolean intervalsOverlaps(Interval int1, Interval int2) {
       if(int1.getEndMinuteUnit()< int2.getBeginMinuteUnit())
       {
           return false;
       }
       return true;
    }
    
}
