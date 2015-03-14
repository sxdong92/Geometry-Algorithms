package algos;

public class FindLineByTwoPoints {

	public static double[] findLineByTwoPoints(double[] P1, double[] P2) {
		// Ax+By=C
		// return {A,B,C}
		double A = P2[1] - P1[1];
		double B = P1[0] - P2[0];
		double C = A*P1[0] + B*P1[1];
		double[] parameters = {A, B, C};
		return parameters;
	}
	
	public static void main(String[] args) {
		double[] p1 = {0,0};
		double[] p2 = {1,2};
		double[] para = FindLineByTwoPoints.findLineByTwoPoints(p1, p2);
		for(double i : para) {
			System.out.print(i + " ");
		}
	}
}
