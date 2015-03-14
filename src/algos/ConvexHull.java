package algos;
import java.util.ArrayList;
import java.util.List;


public class ConvexHull {

	//If onEdge is true, use as many points as possible for
    //the convex hull, otherwise as few as possible.
	public static List<double[]> convexHull(List<double[]> points, boolean onEdge) {
		int N = points.size();
		int p = 0;
		boolean[] used = new boolean[N];
		
		//First find the leftmost point
		for(int i=1; i<N; i++) {
            if(points.get(i)[0] < points.get(p)[0]) p = i;
        }
        int start = p;
        
        boolean isFirstTime = true;
        List<double[]> res = new ArrayList<double[]>();
        while(start != p || isFirstTime) {
        	isFirstTime = false;
        	res.add(points.get(p));
        	
        	int n = -1;
            double dist = onEdge ? Double.MAX_EXPONENT : 0;
            for(int i=0; i<N; i++) {
            	//points.get(i) is the X in the discussion
            	
            	//Don't go back to the same point you came from
                if(i == p)continue;
                
                //If there is no N yet, set it to X
                if(n == -1) n = i;
                double cross = CrossProduct.cross(points.get(p), points.get(i), points.get(n));
                
                //d is the distance from P to X
                double d = Distance.distance(points.get(p), points.get(i));
                if(cross < 0) {
                	//As described above, set N=X
                	n = i;
                	dist = d;
                }
                else if(cross == 0) {
                	//In this case, both N and X are in the same direction.
                    //If onEdge is true, pick the closest one, otherwise pick the farthest one.
                	if((onEdge && d < dist) || (!onEdge && d > dist)) {
                		dist = d;
                        n = i;
                	}
                }
            }
            p = n;
            used[p] = true;
        }
        return res;
	}
	
	public static void main(String[] args) {
		List<double[]> points = new ArrayList<double[]>(); 
		double[] a = {0,0};
		double[] b = {0,1};
		double[] c = {1,1};
		double[] d = {1,0};
		double[] e = {1,-1};
		double[] f = {0,-1};
		double[] g = {-1,-1};
		double[] h = {-1,0};
		double[] i = {-1,1};
		points.add(a);
		points.add(b);
		points.add(c);
		points.add(d);
		points.add(e);
		points.add(f);
		points.add(g);
		points.add(h);
		points.add(i);
		List<double[]> res = ConvexHull.convexHull(points, true);
		for(double[] x : res) {
			System.out.println("(" + x[0] + ","+ x[1] + ")");
		}
		System.out.println();
		
		res = ConvexHull.convexHull(points, false);
		for(double[] x : res) {
			System.out.println("(" + x[0] + ","+ x[1] + ")");
		}
	}
}
