package jp.co.wap.exam;

import java.util.NoSuchElementException;

public class PersistentQueue<E> {

    private Link<E> head;
    private Link<E> tail;
    int count;

    public PersistentQueue() {
        head = null;
        tail = null;
        count = 0;
    }

    public PersistentQueue(Link<E> head, Link<E> tail, int count) {
        this.head = head;
        this.tail = tail;
        this.count = count;
    }

    public PersistentQueue<E> enqueue(E e) {
        Link<E> link;
        PersistentQueue<E> newQueue;

        if (e == null) 
            throw new IllegalArgumentException();
        

        if (count == 0) {
            link = new Link<E>(null, e);
            newQueue = new PersistentQueue<E>(link, link, 1);
        } else {
            link = new Link<E>(tail, e);
            newQueue = new PersistentQueue<E>(head, link, count + 1);
        }

        return newQueue;
    }

    public PersistentQueue<E> dequeue() {
        Link<E> link;
        PersistentQueue<E> newQueue;

        if (count == 0) 
            throw new NoSuchElementException();        

        if (count == 1) {
            newQueue = new PersistentQueue<>();
        } else {
            link = tail;
            while (link.getPrevious() != head) 
                link = link.getPrevious();
            
            newQueue = new PersistentQueue<E>(link, tail, count - 1);
        }

        return newQueue;
    }

    public E peek() {
        
        if (head == null) 
            throw new NoSuchElementException();     
        
        return head.getValue();
    }

    public int size() {
        
        return count;
    }

}
