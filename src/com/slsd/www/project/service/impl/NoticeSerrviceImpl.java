package com.slsd.www.project.service.impl;

import java.util.List;

import com.slsd.www.project.dao.NoticeDAO;
import com.slsd.www.project.dao.impl.NoticeDAOImpl;
import com.slsd.www.project.entity.Notice;
import com.slsd.www.project.service.NoticeService;



public class NoticeSerrviceImpl implements NoticeService {
	@SuppressWarnings("unused")
	private NoticeDAO noticeDao=new NoticeDAOImpl();
	@Override
	public boolean save(Notice notice) {
		// TODO Auto-generated method stub
		int i = noticeDao.save(notice);
		return i == 1 ? true : false;
	
	}

	@Override
	public boolean update(Notice notice) {
		// TODO Auto-generated method stub
		int i = noticeDao.update(notice);
		return i == 1 ? true : false;
	}

	@Override
	public boolean delete(Integer id) {
		int i = noticeDao.delete(id);
		return i == 1 ? true : false;
	}

	@Override
	public List<Notice> findBynPubdate() {
		List<Notice>list = noticeDao.findBynPubdate();
		return list;
	}

	@Override
	public List<Notice> findAll() {
		List<Notice> list = noticeDao.findAll();
		return list;
	}

	@Override
	public List<Notice> findBynTitle(String nTitle) {
		List<Notice> list = noticeDao.findBynTitle(nTitle);
		return list;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		
		return noticeDao.count();
	}

}
