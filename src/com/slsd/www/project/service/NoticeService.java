package com.slsd.www.project.service;

import java.util.List;

import com.slsd.www.project.entity.Notice;

import project.entity.Student;

public interface NoticeService {
	public boolean save(Notice notice );

	public boolean update(Notice notice);

	public boolean delete(Integer id);
	
	public List<Notice> findBynPubdate();
	
	public List<Notice> findAll();
	
	public List<Notice> findBynTitle(String nTitle);
	
	public int count();

}
