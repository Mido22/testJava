package works.old;

import java.util.NoSuchElementException;

public class PersistentQueue<E> {

    private ListNode<E> head;
    private ListNode<E> tail;
    private int count;

    public PersistentQueue() {

        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    private PersistentQueue(ListNode<E> head, ListNode<E> tail, int count) {
        this.head = head;
        this.tail = tail;
        this.count = count;
    }

    public PersistentQueue<E> enqueue(E e) {
        if (e == null) {
            throw new IllegalArgumentException();
        }
        ListNode<E> focus = new ListNode(e);

        if (head == null) {
            return (new PersistentQueue(focus, focus, 1));
        }

        focus.setNext(tail);

        return (new PersistentQueue(head, focus, count + 1));

    }

    public PersistentQueue<E> dequeue() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        if (count == 1) {
            return (new PersistentQueue(null, null, 0));
        }

        ListNode<E> focus = tail;

        while (focus.getNext() != head) {
            focus = focus.getNext();
        }

        return (new PersistentQueue(focus, tail, count - 1));

    }

    public E peek() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.getMyEntiy();
    }

    public int size() {

        return count;
    }
}
