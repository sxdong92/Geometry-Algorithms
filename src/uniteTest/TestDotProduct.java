package uniteTest;

import junit.framework.TestCase;
import algos.DotProduct;

public class TestDotProduct extends TestCase {
	DotProduct dotProd;
	
	//�˷�����ִ��ÿһ�����Է���֮ǰ������������֮ǰ���� ��������û���ã���Ϊ��ʱȫ��ʹ�þ�̬���������ض����ʼ��ʵ�� 
    @Override  
    protected void setUp() throws Exception  
    {  
        // TODO Auto-generated method stub  
        super.setUp();  
        dotProd = new DotProduct();  
        System.out.println("setUp()");  
    }  
  
    
    //�˷�����ִ��ÿһ�����Է���֮�����  
    @Override  
    protected void tearDown() throws Exception  
    {  
        // TODO Auto-generated method stub  
        super.tearDown();  
        System.out.println("tearDown()");  
    }  
    
    //�������������Ծ�̬����dot
    public void testDot() {
    	double[] A = {0,0};
		double[] B = {1,1};
		double[] C = {1,0};
    	assertEquals(-1.0, DotProduct.dot(A, B, C));  
        System.out.println("testGetSex()");
    }
    
}
