/**
 * ����������
 * <p>����������������һ��<br>
 * ���������������ڶ���
 * @author sxd
 * @version 1.0
 * @see DotProduct
 *
 *
 */

public class Test {
	/**
	 * �÷���Ϊ������
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
