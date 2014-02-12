/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.wap.exam;

/**
 *
 * @author seshasayana
 */
public class ListNode<T> {
    private  ListNode<T> next; 
    private T myEntiy ;

    public ListNode(ListNode<T> next, T myEntiy) {
        this.next = next;
      
        this.myEntiy = myEntiy;
    }

    public ListNode(T myEntiy) {
        this.myEntiy = myEntiy;
    }

   public ListNode() {
       
    }

   
    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

   
    public T getMyEntiy() {
        return myEntiy;
    }

    public void setMyEntiy(T myEntiy) {
        this.myEntiy = myEntiy;
    }
    
    
}
