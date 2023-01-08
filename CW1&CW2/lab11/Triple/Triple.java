public class Triple<T extends Comparable<T>, S extends Comparable<S>, U extends Comparable<U>>
        implements Comparable<Triple<T, S, U>> {

    private T first;
    private S second;
    private U third;

    public Triple(T firstElement, S secondElement, U thirdElement) {
        first = firstElement;
        second = secondElement;
        third =  thirdElement;
    }

    public T getFirst() { return first; }
    public S getSecond() { return second; }
    public U getThird() { return third; }


    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */

    // CODING ASSIGNMENT 11.1  COMPARETO
//    private int function(T number){
//
//    }

    @Override
    public int compareTo(Triple<T, S, U> other) {
        if (this.first instanceof Integer) {
            if ((Integer) this.first < (Integer) other.first) return -1;
            else if ((Integer) this.first > (Integer) other.first) return 1;
        } else if (this.first instanceof String) {
            if (this.first.compareTo(other.first) < 0) return -1;
            if (this.first.compareTo(other.first) > 0) return 1;
        } else if (this.first instanceof Double){
            if ((Double) this.first < (Double) other.first) return -1;
            else if ((Double) this.first > (Double) other.first) return 1;
        }

        if (this.second instanceof Integer) {
            if ((Integer) this.second < (Integer) other.second) return -1;
            else if ((Integer) this.second > (Integer) other.second) return 1;
        } else if (this.second instanceof String) {
            if (this.second.compareTo(other.second) < 0) return -1;
            if (this.second.compareTo(other.second) > 0) return 1;
        } else if (this.second instanceof Double){
            if ((Double) this.second < (Double) other.second) return -1;
            else if ((Double) this.second > (Double) other.second) return 1;
        }

        if (this.third instanceof Integer) {
            if ((Integer) this.third < (Integer) other.third) return -1;
            else if ((Integer) this.third > (Integer) other.third) return 1;
        } else if (this.third instanceof String) {
            if (this.third.compareTo(other.third) < 0) return -1;
            if (this.third.compareTo(other.third) > 0) return 1;
        } else if (this.third instanceof Double){
            if ((Double) this.third < (Double) other.third) return -1;
            else if ((Double) this.third > (Double) other.third) return 1;
        }

        return 0;
    }

}