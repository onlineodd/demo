package com.slsd.www.project.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.slsd.www.project.dao.impl.NoticeDAOImpl;
import com.slsd.www.project.entity.Notice;


public class TestNoticeDAO {
	private NoticeDAO noticeDAO;
	@Before
	public void init() {
		 noticeDAO=new NoticeDAOImpl();
	}
	 @Test
	 public void testSave() {
		 Notice notice=new Notice(0, "java讲义","java","简述啊第三方接口对接和","2019-01-02","Sun");
		 int i=noticeDAO.save(notice);
		 Assert.assertEquals(1, i);
	 }
	 @Test
	 public void testUpdate(){
		 Notice notice=new Notice(4, "java","j","java程序设计基础","2019-03-22","清华大学出版");
		 int i=noticeDAO.update(notice);
		 Assert.assertEquals(1,i);
	 }
	 @Test
	 public void testDelete(){
		 int i=noticeDAO.delete(5);
		 Assert.assertEquals(1, i);
		 
	 }
	 @Test
	 public void testFindBynPubdate(){
		List<Notice> list=noticeDAO.findBynPubdate();
		list.forEach(System.out::println);
		
		
	 }
	 @Test
	 public void testFindAll(){
		 List<Notice> list = noticeDAO.findAll();
		 list.forEach(System.out::println);
		 
	 }
	 @Test
	 public void testFindBynTitle(){
		 List<Notice> list = noticeDAO.findBynTitle("三");
		 list.forEach(System.out::println);
	 }
	 @Test
	 public void testCount(){
		 int count = noticeDAO.count();
		 System.out.println(count);
	 }
}
