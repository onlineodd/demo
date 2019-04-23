package demo;

import org.junit.Test;

import com.chansofti.demo.Junitse;

import org.junit.Assert;
public class TestJultse {
	@Test
	public void testSun(){
		Junitse jultse=new Junitse();
		int r =jultse.Sun(3,7);
		Assert.assertEquals(10, r);
		
	}

}
