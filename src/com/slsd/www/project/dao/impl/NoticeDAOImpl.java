package com.slsd.www.project.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.slsd.www.project.dao.NoticeDAO;
import com.slsd.www.project.entity.Notice;
import com.slsd.www.project.utils.DBUtil;


public class NoticeDAOImpl implements NoticeDAO{
	private DBUtil dbUtil=new DBUtil();
	private Notice natice;
	@Override
	public int save(Notice notice) {
		String sql="insert into tab_notice(title,keyword,content,pubdate,author)" + "values(?,?,?,?,?)";
		int i = dbUtil.update(sql,notice.getnTitle(),notice.getnKeyword(),notice.getnContent(),notice.getnPubdate(),notice.getnAuthor());
		return i;
	}

	@Override
	public int update(Notice notice) {
		String sql="update tab_notice set title=?, keyword=?, content=?, pubdate=?, author=? where id=?";
		int i = dbUtil.update(sql,notice.getnTitle(),notice.getnKeyword(),notice.getnContent(),notice.getnPubdate(),notice.getnAuthor(),notice.getnId());
		return i;
	}

	@Override
	public int delete(Integer nId) {
		String sql="delete from tab_notice where id=?";
		int i =dbUtil.update(sql, nId);
		return i;
	}

	@Override
	public List<Notice>  findBynPubdate() {
		// TODO Auto-generated method stub
		List<Notice> list=new ArrayList<Notice>();
		String sql="select * from tab_notice where pubdate like '2019%'";
		ResultSet resultSet=dbUtil.query(sql);
		Notice notice=null;
		try {
			while(resultSet.next()){
			  notice= handleDate(resultSet);
			  list.add(notice);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Notice> findAll() {
		List<Notice> list = new ArrayList<Notice>();
		ResultSet resultSet = dbUtil.query("select * from tab_notice");
		try {
			while (resultSet.next()) {
				Notice notice = handleDate(resultSet);
				list.add(notice);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return list;
	}


	@Override
	public List<Notice> findBynTitle(String nTitle) {
		List<Notice> list = new ArrayList<Notice>();
		nTitle="%"+nTitle+"%";
		ResultSet resultSet = dbUtil.query("select * from tab_notice where title like ?",nTitle);
		try {
			while (resultSet.next()) {
				Notice notice = handleDate(resultSet);
				list.add(notice);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return list;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		int allCount=0;
		String sql="select count(keyword) from tab_notice ";
		ResultSet resultSet=dbUtil.query(sql);
		try {
			while(resultSet.next()){
				allCount=resultSet.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			dbUtil.close();
		}
		return allCount;
	}

	private Notice handleDate(ResultSet resultSet) throws SQLException {
		int id = resultSet.getInt("id");
		String title = resultSet.getString("title");
		String keyword = resultSet.getString("keyword");
		String content = resultSet.getString("content");
		String pubdate = resultSet.getString("pubdate");
		String author = resultSet.getString("author");
		Notice notice = new Notice(id, title, keyword, content, pubdate, author);
		return notice;
	}

}
