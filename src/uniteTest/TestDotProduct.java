package uniteTest;

import junit.framework.TestCase;
import algos.DotProduct;

public class TestDotProduct extends TestCase {
	DotProduct dotProd;
	
	//此方法在执行每一个测试方法之前（测试用例）之前调用 ，本例中没有用，因为暂时全部使用静态方法，不必对类初始化实例 
    @Override  
    protected void setUp() throws Exception  
    {  
        // TODO Auto-generated method stub  
        super.setUp();  
        dotProd = new DotProduct();  
        System.out.println("setUp()");  
    }  
  
    
    //此方法在执行每一个测试方法之后调用  
    @Override  
    protected void tearDown() throws Exception  
    {  
        // TODO Auto-generated method stub  
        super.tearDown();  
        System.out.println("tearDown()");  
    }  
    
    //测试用例，测试静态方法dot
    public void testDot() {
    	double[] A = {0,0};
		double[] B = {1,1};
		double[] C = {1,0};
    	assertEquals(-1.0, DotProduct.dot(A, B, C));  
        System.out.println("testGetSex()");
    }
    
}
