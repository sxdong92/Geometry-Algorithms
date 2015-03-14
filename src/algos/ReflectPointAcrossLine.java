package algos;

public class ReflectPointAcrossLine {

	//P1,P2 define the line, X is the point
	public static double[] reflectPointAcrossLine(double[] P1, double[] P2, double[] X) {
		//find line XY: ax+by=c
		double[] para = FindLineByTwoPoints.findLineByTwoPoints(P1, P2);
		//find perpendicular line: -bx+ay=d
		double[] perpenPara = {(-1)*para[1], para[0], (-1)*para[1]*X[0] + para[0]*X[1]};
		
		//find intersection point Y
		double[] Y = LineLineIntersection.lineLineIntersection(para, perpenPara);
		//find X' based on X and Y
		double[] refX = {2*Y[0]-X[0], 2*Y[1]-X[1]};
		return refX;
	}
	
	//para define the line ax+by=c, para = {a,b,c}
	public static double[] reflectPointAcrossLine(double[] para, double[] X) {
		//find perpendicular line: -bx+ay=d
		double[] perpenPara = {(-1)*para[1], para[0], (-1)*para[1]*X[0] + para[0]*X[1]};
		
		//find intersection point Y
		double[] Y = LineLineIntersection.lineLineIntersection(para, perpenPara);
		//find X' based on X and Y
		double[] refX = {2*Y[0]-X[0], 2*Y[1]-X[1]};
		return refX;
	}
	
	public static void main(String[] args) {
		double[] X = {-1, -1};
		double[] P1 = {-5, 5};
		double[] P2 = {10.88, -10.88};
		double[] res = ReflectPointAcrossLine.reflectPointAcrossLine(P1, P2, X);
		for(double i : res) {
			System.out.print(i + " ");
		}
		
		System.out.println(" ");
		
		double[] para = {1,1,0};
		double[] res2 = ReflectPointAcrossLine.reflectPointAcrossLine(para, X);
		for(double i : res2) {
			System.out.print(i + " ");
		}
	}
}
