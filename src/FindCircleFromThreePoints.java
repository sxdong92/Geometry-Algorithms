
public class FindCircleFromThreePoints {

	public static double[] findCircleFromThreePoints(double[] X, double[] Y, double[] Z) {
		//find line XY: ax+by=c
		double[] para1 = FindLineByTwoPoints.findLineByTwoPoints(X, Y);
		//find perpendicular line: -bx+ay=d
		double midx1 = (X[0] + Y[0]) / 2;
		double midy1 = (X[1] + Y[1]) / 2;
		double[] perpenPara1 = {(-1)*para1[1], para1[0], (-1)*para1[1]*midx1 + para1[0]*midy1};
		
		//find line YZ
		double[] para2 = FindLineByTwoPoints.findLineByTwoPoints(Y, Z);
		double midx2 = (Z[0] + Y[0]) / 2;
		double midy2 = (Z[1] + Y[1]) / 2;
		double[] perpenPara2 = {(-1)*para2[1], para2[0], (-1)*para2[1]*midx2 + para2[0]*midy2};
		
		double[] point = LineLineIntersection.lineLineIntersection(perpenPara1, perpenPara2);
		double r = Distance.distance(X, point);
		
		//return {x,y,radius}
		double[] res = {point[0], point[1], r};
		return res;
	}
	
	public static void main(String[] args) {
		double[] X = {0,1};
		double[] Y = {1,0};
		double[] Z = {1,2};
		double[] res = FindCircleFromThreePoints.findCircleFromThreePoints(X, Y, Z);
		for(double i : res) {
			System.out.print(i + " ");
		}
	}
}
