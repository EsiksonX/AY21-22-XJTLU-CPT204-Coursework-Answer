public class DelimitedARDeque<T> extends ARDeque<T> {

    public DelimitedARDeque() {
        super();
    }

    /* DO NOT MODIFY CODE ABOVE */

    // Part C1

    /**
     * Adds an item to the back of the deque.
     * Throws an exception if the deque already has more than two such items.
     * @param item to be added
     * @throws IllegalArgumentException if item already exists more than twice
     */
    @Override
    public void addLast(T item) {
        int size = super.size();
        for (int i = 0; i < size; i++) {
            T temp = super.get(i);
            if (temp.equals(item)) {
                for (int j = i + 1; j < size; j++) {
                    if (temp.equals(super.get(j))){
                        for (int x = j + 1; x < size; x++){
                            if (temp.equals(super.get(x))){
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                }
            }
        }
        super.addLast(item);

    }

    public static void main(String[] args) {
        DelimitedARDeque<String> dd = new DelimitedARDeque<>();
        dd.addLast("a");
        dd.addLast("b");
        dd.addLast("a");
        dd.addLast("a");
        dd.printDeque();
        try {
            dd.addLast("a");
            dd.printDeque();
        } catch (IllegalArgumentException e) {
            System.out.println("Add failed, item already occurs more than twice.");

        }
    }
}