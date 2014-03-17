/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.co.wap.exam;

/**
 *
 * @author mido
 */
public class MissingNumber {
    
    public static void main(String args[]){
        String a="1112131516171819";
        System.out.println("missing="+length(a));  
        
        
    }
    
    public static long length(String a){
        long i=-1;
        Long b,c;
        for(int j=1;j<=a.length()/2;j++){
           b=Long.parseLong(a.substring(0, j));
           c=Long.parseLong(a.substring(j, 2*j));
           if(c-b==1 || c-b==2){
               i=seqFit(a,j);
               if(i!=-1)
                   return i;
           }                       
        }
        return i;
    }
    
    public static long seqFit(String a, int b){
        if(a.length()%b!=0)
            return -1;
        Long d,c,e,f=new Long(-1);
        for(int i=0;i<a.length()-b;i=i+b){
           c=Long.parseLong(a.substring(i, i+b));
           d=Long.parseLong(a.substring(i+b, 2*b+i));
           e=d-c;
           if(!(e==2 || e==1))
               return -1;
           if(e==2)
               f=c+1;
        }
        return f;
    }
}
