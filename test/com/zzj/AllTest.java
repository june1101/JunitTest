package com.zzj;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 * 打包测试，可以测试多个类
 * @author junzai
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TestCalculate.class,ParamTest.class})
public class AllTest {

}
