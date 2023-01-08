import org.w3c.dom.Node;

public class LLDeque<T> {

    private class Node {
        Node prev;
        T item;
        Node next;

        Node(Node p, T i, Node n) {
            prev = p;
            item = i;
            next = n;
        }
    }

    private Node sentinel;
    private int size;

    /**
     * @return the number of items in the deque.
     */
    public int size() {
        return size;
    }

    /**
     * @return true if deque is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    // LAB EXERCISE 5.1 EMPTY CONSTRUCTOR

    /**
     * Creates an empty deque.
     */
    public LLDeque() {
		sentinel = new Node(null, null, null);
		sentinel.prev = sentinel;
        sentinel.next = sentinel;
		size = 0;
    }


    // LAB EXERCISE 5.2 ADD TO FRONT

    /**
     * Adds an item of type T to the front of the deque.
     * @param item is a type T object added to the deque.
     */
    public void addFirst(T item) {
        try {
            Node node = new Node(sentinel, item, sentinel.next);
            sentinel.next.prev = node;
            sentinel.next = node;
            size = size + 1;
        } catch (NullPointerException e) {

        }
    }


    public void addFirstNotNull(T item) {
        if (item == null) throw new IllegalArgumentException();
        else {
            Node node = new Node(sentinel, item, sentinel.next);
            sentinel.next.prev = node;
            sentinel.next = node;
            size = size + 1;
        }
    }

    public void addLegalFirst(T item1, T item2) {
        try {
            addFirstNotNull(item1);
        } catch (IllegalArgumentException e) {
            Node node = new Node(sentinel, item2, sentinel.next);
            sentinel.next.prev = node;
            sentinel.next = node;
            size = size + 1;
        }
    }


    // LAB EXERCISE 5.3 PRINT ITEMS

    /**
     * Prints the items in the deque from first to last,
     * separated by a space, ended with a new line.
     */
    public void printDeque() {
		Node p = sentinel.next;
        while (p != sentinel) {
            System.out.print(p.item + " ");
            p = p.next;
        }
		System.out.println();
    }


    // LAB EXERCISE 5.4 ITERATIVE GET ITEM

    /**
     * Gets the item at the given index.
     * If no such item exists, returns null.
     * Does not mutate the deque.
     * @param index is an index where 0 is the front.
     * @return the ith item of the deque, null if it does not exist.
     */
    public T iterGet(int index) {
		if (size == 0 || index >= size || index < 0) {
            return null;
        }
        Node p = sentinel.next;
		while (index > 0) {
            p = p.next;
            index--;
        }
		return p.item;
    }


    // EXERCISE 5.1 ADD TO BACK

    /**
     * Adds an item of type T to the back of the deque.
     * @param item is a type T object added to the deque.
     */
    public void addLast(T item) {
        Node node = new Node(sentinel.prev, item, sentinel);
        sentinel.prev.next = node;
        sentinel.prev = node;
        size = size + 1;
    }


    // EXERCISE 5.2 DELETE FRONT

    /**
     * Deletes and returns the item at the front of the deque.
     * If no such item exists, returns null.
     * @return the first item of the deque, null if it does not exist.
     */
    public T delFirst() {
		if (size == 0) {
            return null;
        }
        T tmp = sentinel.next.item;
        sentinel.next = sentinel.next.next;
        sentinel.next.prev = sentinel;
        size--;
		return tmp;
    }


    // EXERCISE 5.3 DELETE BACK

    /**
     * Deletes and returns the item at the back  of the deque.
     * If no such item exists, returns null.
     * @return the last item of the deque, null if it does not exist.
     */
    public T delLast() {
        if (size == 0) {
            return null;
        }
        T tmp = sentinel.prev.item;
        sentinel.prev = sentinel.prev.prev;
        sentinel.prev.next = sentinel;
        size--;
        return tmp;
    }


    // EXERCISE 5.4 RECURSIVE GET ITEM

    /**
     * Gets the item at the given index.
     * If no such item exists, returns null.
     * Does not mutate the deque.
     * @param index is an index where 0 is the front.
     * @return the ith item of the deque, null if it does not exist.
     */
    public T recGet(int index) {
        return recGetHelper(sentinel, index);
    }

    public T recGetHelper(Node target, int index) {
        if (size == 0 || index >= size || index < 0) {
            return null;
        }
        if (index == 0) {
            T t =target.next.item;
            return t;
        }
        return recGetHelper(target.next,index - 1);
    }
	

    public static void main(String[] args) {
        LLDeque<String> deque = new LLDeque<>();
        deque.addFirst("b");
        deque.addFirst("a");
        deque.printDeque();
    }

}
