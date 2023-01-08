public class LLDeque<T> {

    public LLDeque() {
        sentinel = new Node(null, null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

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


    // EXERCISE 6.1 COPY CONSTRUCTOR

    /**
     * Creates a (deep) copy of another Deque object.
	 * @param other is another LLDeque<T> object.
     */
    public LLDeque(LLDeque<T> other) {
//        Node p = sentinel;
//        Node q = other.sentinel;
//        int index = other.size;
//        while (index > 0) {
//            p.next = new Node(p, q.next.item, null);
//            p = p.next;
//            q = q.next;
//            index--;
//        }
        this();
        Node q = other.sentinel;
        int index = other.size;
        while (index > 0){
            this.addLast(q.next.item);
            q = q.next;
            index--;
        }
    }


    // EXERCISE 6.2 ADD NOT NULL TO FRONT

    /**
     * Adds an non-null item of type T to the front of the deque.
     * @param item is a type T object.
     * @throws IllegalArgumentException if the item is null.
     */
    public void addFirst(T item) {
        if (item == null) throw new IllegalArgumentException();
        else {
            Node node = new Node(sentinel, item, sentinel.next);
            sentinel.next.prev = node;
            sentinel.next = node;
            size = size + 1;
        }
    }


    // EXERCISE 6.3 ADD LEGAL ITEM TO FRONT

    /**
     * Adds the first item of type T to the front of the deque,
     * or the second item of type T instead if the first item is illegal.
     * @param item1 is a type T object.
     * @param item2 is a type T object.
     */
    public void addLegalFirst(T item1, T item2) {
        try {
            addFirst(item1);
        } catch (IllegalArgumentException e) {
            Node node = new Node(sentinel, item2, sentinel.next);
            sentinel.next.prev = node;
            sentinel.next = node;
            size = size + 1;
        }
    }
	
	
	
	
    /*
     *************************************************************
     * You can copy paste Lab 5 codes below if you want to use it
     *************************************************************
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

    public void addLast(T item) {
        Node node = new Node(sentinel.prev, item, sentinel);
        sentinel.prev.next = node;
        sentinel.prev = node;
        size = size + 1;
    }
	
	

}
