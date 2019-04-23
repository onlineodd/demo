package com.slsd.www.project.service;

import java.util.List;


import org.junit.Before;
import org.junit.Test;


import com.slsd.www.project.entity.Notice;
import com.slsd.www.project.service.impl.NoticeSerrviceImpl;

public class TestNoticeService {
	NoticeService noticeService;
	@Before
	public void init(){
		noticeService=new NoticeSerrviceImpl();
	}
	@Test
	public void testCase(){
		Notice notice=new Notice(0, "javascript讲义","java","简述啊第三方接口对接和","2019-01-02","人民出版社");
		boolean i=noticeService.save(notice);
//		Assert.assertEquals(1, i);
	}
	@Test
	public void testUpdate(){
		Notice notice=new Notice(3, "javascript讲义","java","简述啊第三方接口对接和","2019-01-02","人民出版社");
		boolean i=noticeService.update(notice);
	}
	@Test
	public void testDelete(){
		boolean i=noticeService.delete(5);
	}
	@Test
	public void testFindBynPubdate(){
		List<Notice>list=noticeService.findBynPubdate();
		list.forEach(System.out::println);
	}
	 @Test
	 public void testFindAll(){
		 List<Notice> list = noticeService.findAll();
		 list.forEach(System.out::println);
		 
	 }
	 @Test
	 public void testFindBynTitle(){
		 List<Notice> list = noticeService.findBynTitle("三");
		 list.forEach(System.out::println);
	 }
	 @Test
	 public void testCount(){
		 int count = noticeService.count();
		 System.out.println(count);
	 }
}

