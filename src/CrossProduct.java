
public class CrossProduct {

	//Compute the cross product AB x AC
	public static double cross(double[] A, double[] B, double[] C) {
		double[] AB = new double[2];
		double[] AC = new double[2];
        AB[0] = B[0]-A[0];
        AB[1] = B[1]-A[1];
        AC[0] = C[0]-A[0];
        AC[1] = C[1]-A[1];
        double cross = AB[0] * AC[1] - AB[1] * AC[0];
        return cross;
	}
}
