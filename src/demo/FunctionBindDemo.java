package demo;

import java.util.Arrays;
import java.util.List;

import javax.xml.ws.FaultAction;

public class FunctionBindDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerFactpory integerFactpory=Integer::valueOf;
		//���������ʽ�ӿڵ�Integer,valueof(string string)�������а�
		Integer integer=integerFactpory.craInteger("123");
		System.out.println(integer);
		
		List<String>list=Arrays.asList("aa","bb","cc","dd");
		list.forEach(System.out::println);
		//��System.out.println�󶨣�ÿ���б��ÿ�����󶼻��Զ����ø÷���������Ϊ����
		
	}
	@FunctionalInterface
	//ע�Ϳ��п���
	interface IntegerFactpory{
		public Integer craInteger(String string);
		
	}

}
