package MachineCoding_HLD.CacheSystem.MultiLevelCache.cacheProvider.algorithms;


public class DoublyLinkedListNode<E> {
    DoublyLinkedListNode<E> next;
    DoublyLinkedListNode<E> prev;
    E element;

    public DoublyLinkedListNode(DoublyLinkedListNode<E> next, DoublyLinkedListNode<E> prev, E element) {
        this.next = next;
        this.prev = prev;
        this.element = element;
    }

    public DoublyLinkedListNode<E> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode<E> next) {
        this.next = next;
    }

    public DoublyLinkedListNode<E> getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedListNode<E> prev) {
        this.prev = prev;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public DoublyLinkedListNode(E element) {
        this.next = null;
        this.prev = null;
    }
}
