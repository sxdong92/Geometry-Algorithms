package algos;
/**
 * 
 * @author sxd
 * @version 1.0
 * @see Test
 *
 */
public class DotProduct {
	
	/**
	 * 
	 * @param A 点A
	 * @param B 共点B
	 * @param C 点C
	 * @return 返回double型变量
	 */
	//Compute the dot product AB·BC
	//A, B, C are points, expressed by int array with two elements. i.e. int[] A = {1,1};
	public static double dot(double[] A, double[] B, double[] C) {
		double[] AB = new double[2];
		double[] BC = new double[2];
		AB[0] = B[0]-A[0];
        AB[1] = B[1]-A[1];
        BC[0] = C[0]-B[0];
        BC[1] = C[1]-B[1];
        double dot = AB[0] * BC[0] + AB[1] * BC[1];
        return dot;
	}
	
	public static void main(String[] args) {
		double[] A = {0,0};
		double[] B = {1,1};
		double[] C = {1,0};
		System.out.print(DotProduct.dot(A, B, C));
	}
}
