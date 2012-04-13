package nqueens.solver;

// Permute.java -- A class generating all permutations

public class Permute {

	private final int size;
	private final int [] elements;  // copy of original 0 .. size-1
	private final int [] ar;           // array for output,  0 .. size-1
	private final int [] permutation;  // perm of nums 1..size, perm[0]=0
	private boolean next = true;

	// int[], double[] array won't work :-(
	public Permute (int [] e) {
		size = e.length;
		elements = new int [size];    // not suitable for primitives
		System.arraycopy (e, 0, elements, 0, size);
		ar = new int[size];
		System.arraycopy (e, 0, ar, 0, size);
		permutation = new int [size+1];
		for (int i=0; i<size+1; i++) {
			permutation [i]=i;
		}
	}

	private void formNextPermutation () {
		for (int i=0; i<size; i++) {
			// i+1 because perm[0] always = 0
			// perm[]-1 because the numbers 1..size are being permuted
			ar[i] = elements[permutation[i+1]-1];
		}
	}

	public boolean hasNext() {
		return next;
	}

	private void swap (final int i, final int j) {
		final int x = permutation[i];
		permutation[i] = permutation [j];
		permutation[j] = x;
	}

	// does not throw NoSuchElement; it wraps around!
	public int[] next() {
		formNextPermutation ();  // copy original elements

		int i = size-1;
		while (permutation[i]>permutation[i+1]) i--;

		if (i==0) {
			next = false;
			for (int j=0; j<size+1; j++) {
				permutation [j]=j;
			}
			return ar;
		}

		int j = size;

		while (permutation[i]>permutation[j]) j--;
		swap (i,j);
		int r = size;
		int s = i+1;
		while (r>s) { swap(r,s); r--; s++; }

		return ar;
	}
}
