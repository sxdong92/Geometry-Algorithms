
public class Distance {

	//Compute the distance from A to B
	public static double distance(double[] A, double[] B) {
		double d1 = A[0] - B[0];
		double d2 = A[1] - B[1];
        return Math.sqrt(d1*d1 + d2*d2);
	}
}
