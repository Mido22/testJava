

package jp.co.wap.exam;

public class Link<E> {
    
    private Link<E> previous;
    private E value;

    public Link(Link<E> previous, E value) {
        this.previous = previous;
        this.value = value;
    } 
    
    public Link<E> getPrevious() {
        return previous;
    }

    public void setPrevious(Link<E> previous) {
        this.previous = previous;
    }

    public E getValue() {
        return value;
    }

}
