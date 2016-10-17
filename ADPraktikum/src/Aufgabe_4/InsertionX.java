package Aufgabe_4;

/******************************************************************************
 *  Compilation:  javac InsertionX.java
 *  Execution:    java InsertionX < input.txt
 *  Dependencies: StdOut.java StdIn.java
 *  Data files:   http://algs4.cs.princeton.edu/21sort/tiny.txt
 *                http://algs4.cs.princeton.edu/21sort/words3.txt
 *  
 *  Sorts a sequence of strings from standard input using an optimized
 *  version of insertion sort that uses half exchanges instead of 
 *  full exchanges to reduce data movement..
 *
 *  % more tiny.txt
 *  S O R T E X A M P L E
 *
 *  % java InsertionX < tiny.txt
 *  A E E L M O P R S T X                 [ one string per line ]
 *
 *  % more words3.txt
 *  bed bug dad yes zoo ... all bad yet
 *
 *  % java InsertionX < words3.txt
 *  all bad bed bug dad ... yes yet zoo   [ one string per line ]
 *
 ******************************************************************************/
/**
 * The {@code InsertionX} class provides static methods for sorting an array
 * using an optimized version of insertion sort (with half exchanges and a
 * sentinel).
 * <p>
 * For additional documentation, see
 * <a href="http://algs4.cs.princeton.edu/21elementary">Section 2.1</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */

public class InsertionX implements SortAlgorithm {

	/**
	 * Rearranges the array in ascending order, using the natural order.
	 * 
	 * @param a
	 *            the array to be sorted
	 */
	public void sort(Comparable[] a) {
		int n = a.length;

		// put smallest element in position to serve as sentinel
		int exchanges = 0;
		for (int i = n - 1; i > 0; i--) {
			if (less(a[i], a[i - 1])) {
				exch(a, i, i - 1);
				exchanges++;
			}
		}
		if (exchanges == 0)
			return;

		// insertion sort with half-exchanges
		for (int i = 2; i < n; i++) {
			Comparable v = a[i];
			int j = i;
			while (less(v, a[j - 1])) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = v;
		}

	}

	/***************************************************************************
	 * Helper sorting functions.
	 ***************************************************************************/

	// is v < w ?
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	// exchange a[i] and a[j]
	private static void exch(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	public String toString() {
		return "Insertion";
	}

}
