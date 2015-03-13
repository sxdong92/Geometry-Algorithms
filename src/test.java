/**
 * 主测试类简介
 * <p>主测试类具体阐述第一行<br>
 * 主测试类具体阐述第二行
 * @author sxd
 * @version 1.0
 * @see DotProduct
 *
 *
 */

public class Test {
	/**
	 * 该方法为主函数
	 * @param args
	 */
	public static void main(String[] args) {
		double[] p1 = {0,0};
		double[] p2 = {1,2};
		double[] para = FindLineByTwoPoints.findLineByTwoPoints(p1, p2);
		for(double i : para) {
			System.out.print(i + " ");
		}
	}
}
