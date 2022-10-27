package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		double sum = 0.0;
		if (n==0) return 0;
		else return geometricSum(n-1) + 1.0/(Math.pow(2.0, n));
	
			// FIXME compute the geometric sum for the first n terms recursively
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if (q==0) return p;
		
		int temp = q;
		q = p % q;
		p = temp;
		return gcd (p,q);	
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int[] reversed = new int[array.length];
		if (array.length > 0) {
			int lastIndex = array.length - 1;
		for (int index = 0; index <= array.length / 2; ++index) {
			int mirrorIndex = lastIndex - index;
			reversed[index] = array[mirrorIndex];
			reversed[mirrorIndex] = array[index];
		if (index>array.length/2) return reversed;
		else return toReversed();
		}
	}
		
		public static int [] helperMethod(int left, int right, int [] toReversed, int [ reversed]) {
			
		}
		
			// FIXME create a helper method that can recursively reverse the given array
			return new int[0];
		
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
