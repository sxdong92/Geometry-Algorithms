import java.util.ArrayList;
import java.util.List;


public class PolygonArea {

	// points passed through 2d array p: double[NumOfPoints][2]
	public static double polygonArea(double[][] p) {
		double area = 0;
		int N = p.length;
		//We will triangulate the polygon
		//into triangles with points p[0],p[i],p[i+1]
		
		for(int i=1; i+1<N; i++) {
			double x1 = p[i][0] - p[0][0];
			double y1 = p[i][1] - p[0][1];
			double x2 = p[i+1][0] - p[0][0];
			double y2 = p[i+1][1] - p[0][1];
			double cross = x1*y2 - x2*y1;
		    area += cross;
		}
		return Math.abs(area/2.0);
	}
	
	// points passed through 2d array p: double[NumOfPoints][2]
	public static double polygonArea(List<double[]> points) {
		double area = 0;
		int N = points.size();
		
		for(int i=1; i+1<N; i++) {
			double x1 = points.get(i)[0] - points.get(0)[0];
			double y1 = points.get(i)[1] - points.get(0)[1];
			double x2 = points.get(i+1)[0] - points.get(0)[0];
			double y2 = points.get(i+1)[1] - points.get(0)[1];
			double cross = x1*y2 - x2*y1;
		    area += cross;
		}
		return Math.abs(area/2.0);
	}
	
	
	public static void main(String[] args) {
		double[][] p = {{0,0},{1,1},{0,2},{2,2},{2,0}};
		double[][] p2 = {{0,0},{1,1},{0,1}};
		System.out.println(PolygonArea.polygonArea(p));
		System.out.println(PolygonArea.polygonArea(p2));
		
		List<double[]> points = new ArrayList<double[]>();
		double[] a = {0,0};
		double[] b = {1,1};
		double[] c = {0,2};
		double[] d = {2,2};
		double[] e = {2,0};
		points.add(a);
		points.add(b);
		points.add(c);
		points.add(d);
		points.add(e);
		List<double[]> points2 = new ArrayList<double[]>();
		System.out.println(PolygonArea.polygonArea(points));
		double[] f = {0,1};
		points2.add(a);
		points2.add(b);
		points2.add(f);
		System.out.println(PolygonArea.polygonArea(points2));
	}
}
