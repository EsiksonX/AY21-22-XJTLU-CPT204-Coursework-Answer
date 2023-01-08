import java.util.Iterator;

public class ARSet<T> implements Iterable<T> {
    private T[] items;
    private int size;

    /**
     * Create an empty set.
     */
    @SuppressWarnings("unchecked")
    public ARSet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /**
     * @return the number of items in the set
     */
    public int size() {
        return size;
    }

    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    // Copy paste your code from Week 10 here
    // LAB EXERCISE 10.3  ITERATOR

    /**
     * Make an iterator
     */
    @Override
    public Iterator<T> iterator() {

        return new ARSetIterator();

    }

    private class ARSetIterator implements Iterator<T> {

        private int index;
        public ARSetIterator() {index = 0;}

        @Override
        public boolean hasNext(){return index < size;}

        @Override
        public T next(){
            T nextItem = items[index];
            index++;
            return nextItem;
        }
    }


    // CODING ASSIGNMENT 10.1  CONTAINS

    /**
     * Checks whether an item is inside the set.
     * @param item to be checked
     * @return true iff the set contains the item
     */
    public boolean contains(T item) {
        if (item == null) return false;
        for (int i = 0; i < size; i++) if (items[i] == item || item.equals(items[i])) return true;
        return false;
    }


    // CODING ASSIGNMENT 10.2  ADD

    /**
     * Adds an item into the set if it is not already inside.
     * @param item to be added inside the set.
     * @throws IllegalArgumentException if item is null.
     */
    public void add(T item) {
        if (item == null) throw new IllegalArgumentException();
        if (!contains(item)){
            items[size] = item;
            size += 1;
        }
    }


    // CODING ASSIGNMENT 11.2  EQUALS

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object that) {
        if (!(that instanceof ARSet)) return false;
        ARSet<Object> a = (ARSet<Object>) that;
        if (this.size != a.size) return false;
        for (T i : this) {
            if (!a.contains(i)) return false;
        }
        return true;
    }
	
}