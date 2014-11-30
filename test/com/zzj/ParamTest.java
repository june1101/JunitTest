package com.zzj;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * ��������
 * @author junzai
 *
 */
@RunWith(Parameterized.class)
public class ParamTest {
	private static Calculate cal = new Calculate();
	private int param;
	private int result;
	
	//���캯����ʼ��
	public ParamTest(int param,int result){
		this.param = param;
		this.result = result;
	}
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][]{
				{2,4},{0,0},{-3,9}
		});
	}
	
	@Test
	public void testSquare(){
		int res = cal.square(param);
		assertEquals(result,res);
	}
	
}
