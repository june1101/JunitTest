package com.zzj;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculate {
	Calculate cal;
	
	/**
	 * ִ������һ������֮ǰ����ִ���������
	 */
	@Before
	public void setUp(){
		 cal = new Calculate();
	}	
	
	/**
	 * Ҫ���Եķ��������Եڶ�������������ֵ����������ʵ��ֵ 
	 */
	@Test
	public void testAdd(){
		int res = cal.add(10, 20);
		assertEquals("�ӷ�������", res, 30);
	}
	@Test
	public void testSub(){
		int res = cal.sub(10, 20);
		assertEquals("����������", res, -10);
	}
	@Test
	public void testMul(){
		int res = cal.mul(10, 20);
		assertEquals("�˷�������", res, 200);
	}
	@Test
	public void testDiv(){
		int res = cal.div(10, 20);
		assertEquals("����������", res, 0);
	}
	
	/**
	 * ��ʾ���������Ӧ���׳�ArithmeticException�쳣��������׳��ͱ���
	 */
	@Test(expected=ArithmeticException.class)
	public void testDivException(){
		int res = cal.div(10, 0);
	}
	
	//��ʾ�������Ӧ����300������ִ�н���������ȷ
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
