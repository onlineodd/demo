package com.slsd.www.project.entity;

public class Notice {
	private Integer nId;
	private String nTitle;
	private String nKeyword;
	private String nContent;
	private String nPubdate;
	private String nAuthor;
	
	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notice(Integer nId, String nTitle, String nKeyword, String nContent, String nPubdate, String nAuthor) {
		super();
		this.nId = nId;
		this.nTitle = nTitle;
		this.nKeyword = nKeyword;
		this.nContent = nContent;
		this.nPubdate = nPubdate;
		this.nAuthor = nAuthor;
	}
	
	public Integer getnId() {
		return nId;
	}
	public void setnId(Integer nId) {
		this.nId = nId;
	}
	public String getnTitle() {
		return nTitle;
	}
	public void setnTitle(String nTitle) {
		this.nTitle = nTitle;
	}
	public String getnKeyword() {
		return nKeyword;
	}
	public void setnKeyword(String nKeyword) {
		this.nKeyword = nKeyword;
	}
	public String getnContent() {
		return nContent;
	}
	public void setnContent(String nContent) {
		this.nContent = nContent;
	}
	public String getnPubdate() {
		return nPubdate;
	}
	public void setnPubdate(String nPubdate) {
		this.nPubdate = nPubdate;
	}
	public String getnAuthor() {
		return nAuthor;
	}
	public void setnAuthor(String nAuthor) {
		this.nAuthor = nAuthor;
	}
	@Override
	public String toString() {
		return "Notice [nId=" + nId + ", nTitle=" + nTitle + ", nKeyword=" + nKeyword + ", nContent=" + nContent
				+ ", nPubdate=" + nPubdate + ", nAuthor=" + nAuthor + "]";
	}
	
	
}
