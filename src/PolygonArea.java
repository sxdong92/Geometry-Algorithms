
public class PolygonArea {

	public static double polygonArea(double[][] p) {
		int area = 0;
		int N = p.length;
		//We will triangulate the polygon
		//into triangles with points p[0],p[i],p[i+1]
		
		for(int i = 1; i+1<N; i++){
			double x1 = p[i][0] - p[0][0];
			double y1 = p[i][1] - p[0][1];
			double x2 = p[i+1][0] - p[0][0];
			double y2 = p[i+1][1] - p[0][1];
			double cross = x1*y2 - x2*y1;
		    area += cross;
		}
		return Math.abs(area/2.0);
	}
}
