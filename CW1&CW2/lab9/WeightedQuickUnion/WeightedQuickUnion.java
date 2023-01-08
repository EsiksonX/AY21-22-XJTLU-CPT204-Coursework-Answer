public class WeightedQuickUnion {

    private int[] parent;

    /*
     * Returns the parent of element p.
     * If p is the root of a tree, returns the negative size
     * of the tree for which p is the root.
     */
    public int parent(int p) {
        return parent[p];
    }

    /* Prints the parents of the elements, separated by a space */
    public void printParent() {
        for (int element : parent) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    /*
     ***** HELPER METHODS START *****
     */

    // Add your own helper methods here
	// INCLUDE your helper methods in your submission !
	
	//finding the root
    private int find(int p){
        while (parent(p) >= 0){
            p = parent(p);
        }
        return p;
    }
	

    /*
     ***** HELPER METHODS END *****
     */


    // LAB EXERCISE 9.3  CONSTRUCTOR

    /**
     * Creates a Union Find data structure with n elements,
     * 0 through n-1.
     * Initially, each element is in its own set.
     * @param N the number of elements
     */
    public WeightedQuickUnion(int N) {
        parent = new int[N];
		for(int i = 0; i < N; i++) parent[i] = -1;
    }


    // LAB EXERCISE 9.4 VALIDATE

    /**
     * Validates that p is a valid element/index.
     * @throws IllegalArgumentException if p is not a valid index.
     */
    public void validate(int p) {
        if (p < 0 || p >= parent.length) throw new IllegalArgumentException();
    }


    // CODING ASSIGNMENT 9.1  SIZE OF

    /**
     * Returns the size of the set element p belongs to.
     * @param p an element
     * @return the size of the set containing p
     */
    public int sizeOf(int p) {
        return -parent(find(p));
    }
	
	
	// CODING ASSIGNMENT 9.2  IS SAME GROUP

    /**
     * Returns true iff elements p is in the same group as q.
     * @param p an element
     * @param q the other element
     * @return true if p and q are in the same group
     *         false otherwise
     * @throws IllegalArgumentException if p or q is not a valid index.
     */
    public boolean isSameGroup(int p, int q) {
        if (p < 0 || q < 0 || p >= parent.length || q >= parent.length) throw new IllegalArgumentException();
        return find(p) == find(q);
    }


    // CODING ASSIGNMENT 9.3  UNION

    /**
     * Combines two elements p and q together,
     * by combining the sets containing them.
     * @param p an element
     * @param q the other element
     * @throws IllegalArgumentException if p or q is not a valid index.
     */
    public void union(int p, int q) {
        if (isSameGroup(p, q)) return;
        p = find(p);
        q = find(q);
        if (parent(p) > parent(q)) {
            parent[p] = - (sizeOf(p) + sizeOf(q));
            parent[q] = p;
        }
        else{
            parent[q] = - (sizeOf(p) + sizeOf(q));
            parent[p] = q;
        }

    }


    public static void main(String[] args) {
//        WeightedQuickUnion uf = new WeightedQuickUnion(4);
//        uf.union(1, 0);
//        uf.union(3, 2);
//        uf.union(3, 1);
//        uf.printParent();

        WeightedQuickUnion uf = new WeightedQuickUnion(19);
        for(int i=1; i<=15; i+=2) {
            uf.union(i+1, i);
        }
        uf.printParent();
        //1 -2 1 -2 3 -2 5 -2 7 -2 9 -2 11 -2 13 -2 15 -1 -1
    }

}
