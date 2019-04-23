package com.chansofti.demo.lambda;
/*
 * 函数是接口，就是有且只有一个抽象方法的接口
 * 它是lambda实现的必要条件
 * 可以使用注解@FunctionalInterface来进行标注
 */
@FunctionalInterface
public interface SingleFunctionalInterface {
	public void speak();
	default void say(){
		System.out.println("你好！");
	}
	public static void ss(){
		
	}

}
