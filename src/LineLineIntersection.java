
public class LineLineIntersection {

	public static double[] lineLineIntersection(double[] P1, double[] P2, double[] P3, double[] P4) {
		double[] para1 = FindLineByTwoPoints.findLineByTwoPoints(P1, P2);
		double[] para2 = FindLineByTwoPoints.findLineByTwoPoints(P3, P4);
		double A1 = para1[0];
		double B1 = para1[1];
		double C1 = para1[2];
		double A2 = para2[0];
		double B2 = para2[1];
		double C2 = para2[2];
		
		double[] point = new double[2];
		double det = A1*B2 - A2*B1;
	    if(det == 0){
	    	//Lines are parallel
	    	return null;
		}
	    else{
	    	point[0] = (B2*C1 - B1*C2) / det;
	    	point[1] = (A1*C2 - A2*C1) / det;
		}
	    
	    return point;
	}
	
	
	public static double[] lineLineIntersection(double[] para1, double[] para2) {
		double A1 = para1[0];
		double B1 = para1[1];
		double C1 = para1[2];
		double A2 = para2[0];
		double B2 = para2[1];
		double C2 = para2[2];
		
		double[] point = new double[2];
		double det = A1*B2 - A2*B1;
	    if(det == 0){
	    	//Lines are parallel
	    	return null;
		}
	    else{
	    	point[0] = (B2*C1 - B1*C2) / det;
	    	point[1] = (A1*C2 - A2*C1) / det;
		}
	    
	    return point;
	}
	
	
	public static void main(String[] args) {
		double[] p1 = {0, 3};
		double[] p2 = {0, 5};
		double[] p3 = {-1, -1};
		double[] p4 = {5, 5};
		double[] p = LineLineIntersection.lineLineIntersection(p1, p2, p3, p4);
		System.out.print("(" + p[0] + "," + p[1] + ")");
	}
}
