package com.chansofti.demo.lambda;
/*
 * �����ǽӿڣ���������ֻ��һ�����󷽷��Ľӿ�
 * ����lambdaʵ�ֵı�Ҫ����
 * ����ʹ��ע��@FunctionalInterface�����б�ע
 */
@FunctionalInterface
public interface SingleFunctionalInterface {
	public void speak();
	default void say(){
		System.out.println("��ã�");
	}
	public static void ss(){
		
	}

}
