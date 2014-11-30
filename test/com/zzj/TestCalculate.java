package com.zzj;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculate {
	Calculate cal;
	
	/**
	 * 执行任意一个方法之前都会执行这个方法
	 */
	@Before
	public void setUp(){
		 cal = new Calculate();
	}	
	
	/**
	 * 要测试的方法，断言第二个参数是期望值，第三个是实际值 
	 */
	@Test
	public void testAdd(){
		int res = cal.add(10, 20);
		assertEquals("加法有问题", res, 30);
	}
	@Test
	public void testSub(){
		int res = cal.sub(10, 20);
		assertEquals("减法有问题", res, -10);
	}
	@Test
	public void testMul(){
		int res = cal.mul(10, 20);
		assertEquals("乘法有问题", res, 200);
	}
	@Test
	public void testDiv(){
		int res = cal.div(10, 20);
		assertEquals("除法有问题", res, 0);
	}
	
	/**
	 * 表示这个测试类应该抛出ArithmeticException异常，如果不抛出就报错
	 */
	@Test(expected=ArithmeticException.class)
	public void testDivException(){
		int res = cal.div(10, 0);
	}
	
	//表示这个方法应该在300毫秒内执行结束才算正确
	@Test(timeout=300)
	public void time(){
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
