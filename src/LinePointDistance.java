
public class LinePointDistance {

	//Compute the distance from AB to C
    //if isSegment is true, AB is a segment, not a line.
	public static double linePointDist(double[] A, double[] B, double[] C, boolean isSegment) {
		double dist = CrossProduct.cross(A,B,C) / Distance.distance(A,B);
        if(isSegment){
        	double dot1 = DotProduct.dot(A,B,C);
            if(dot1 > 0) return Distance.distance(B,C);
            double dot2 = DotProduct.dot(B,A,C);
            if(dot2 > 0) return Distance.distance(A,C);
        }
        return Math.abs(dist);
	}
	
	public static void main(String[] args) {
		double[] A = {2,0};
		double[] B = {1,0};
		double[] C = {0,1};
		System.out.println(LinePointDistance.linePointDist(A, B, C, false));
		System.out.println(LinePointDistance.linePointDist(A, B, C, true));
	}
}
