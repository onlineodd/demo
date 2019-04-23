package com.slsd.www.project.dao;

import java.util.List;

import com.slsd.www.project.entity.Notice;


public interface NoticeDAO {
	//保存学生
public int save(Notice notice);
//修改
public int update(Notice notice);
public int delete(Integer id);
public List<Notice> findBynPubdate();
public List<Notice>findAll();
public List<Notice>findBynTitle(String nTitle);
public int count();


}
