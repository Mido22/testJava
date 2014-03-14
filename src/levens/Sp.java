/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package levens;

/**
 *
 * @author mido
 */
public class Sp {
    private StringBuffer sb;
    private int count;
    
    public Sp(Sp sp){
        this.sb=new StringBuffer(sp.toString());
        this.count=sp.count;
    }
    
    public Sp(String s, int c){
        this.sb=new StringBuffer(s);
        this.count=c;
    }

    public StringBuffer getSb() {
        return sb;
    }

    public void setSb(StringBuffer sb) {
        this.sb = sb;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Sol{" + "edits=" + sb + ", count=" + count + '}';        
    }
    
    public void addHead(String s){
        this.sb.insert(0, s);
    }
    
    public void addTail(String s){
        this.sb.append(s);
    }
    
    public void inc(){
        this.count++;
    }
    
    public void incS(char c){
        this.sb.append(c);
    }
    
    public void inc0(int i){
        while(i>0){
            count++;
            sb.append('C');
        }
    }
    
    
}
