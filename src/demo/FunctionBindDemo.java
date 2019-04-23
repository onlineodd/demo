package demo;

import java.util.Arrays;
import java.util.List;

import javax.xml.ws.FaultAction;

public class FunctionBindDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerFactpory integerFactpory=Integer::valueOf;
		//将这个函数式接口的Integer,valueof(string string)方法进行绑定
		Integer integer=integerFactpory.craInteger("123");
		System.out.println(integer);
		
		List<String>list=Arrays.asList("aa","bb","cc","dd");
		list.forEach(System.out::println);
		//和System.out.println绑定，每次列表的每个对象都会自动调用该方法，并作为参数
		
	}
	@FunctionalInterface
	//注释可有可无
	interface IntegerFactpory{
		public Integer craInteger(String string);
		
	}

}
