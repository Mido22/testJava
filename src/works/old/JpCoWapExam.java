/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package works.old;
import works.old.lib.Interval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author seshasayana
 */
public class JpCoWapExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
          List<Interval> mylist = new ArrayList<Interval> ();

     
        Interval int3= new Interval("01:00", "03:59"); 
        Interval int2= new Interval("03:00", "08:59");
        Interval int1= new Interval("10:00", "11:59");
        Interval int4= new Interval("08:00", "09:59");
        Interval int5= new Interval("02:00", "07:59");
          //  Interval int6= new Interval("14:30", "15:00");
       //  List<Interval> l2 = new Arrays.asList(int1,int2,int3) ;
         
                 mylist.add(int1);
                mylist.add(int2);
               mylist.add(int3);
               mylist.add(int4);
                mylist.add(int5);
               //  mylist.add(int6);
                 
                 Problem1 p =new   Problem1();
                 
                 
         int res=    p.getMaxIntervalOverlapCount(mylist);
        System.out.println(res);
          
          
           Problem2 p1 =new   Problem2();
       int res1=    p1.getMaxWorkingTime(mylist);
       
        System.out.println(res1);
       
      // pq1.dequeue(p);
      
       PersistentQueue pq0 = new  PersistentQueue();
       PersistentQueue pq1= pq0.enqueue(1);
         
        PersistentQueue pq2 = pq1.enqueue(2);
        PersistentQueue pq3 = pq2.enqueue(3);
        PersistentQueue pq4=pq2.enqueue(4);
            
            
             System.out.println(pq3.size());
             System.out.println(pq3.peek());
              PersistentQueue pq5=pq3.dequeue();
              System.out.println(pq5.peek());
              pq1= pq5.dequeue();
               System.out.println(pq1.peek());
               pq2=pq1.dequeue();
               System.out.println(pq4.peek());
               pq2=pq4.dequeue();
                  System.out.println(pq2.peek());
                    pq4=pq2.dequeue();
                    System.out.println(pq4.peek());
                    pq1=pq4.dequeue();
                   // System.out.println(pq1.peek());
           //   pq0 =pq4.dequeue();
        
         //   
            //System.out.println(pq0.peek());
            
       
            
    }
}
