package com.movie_admin.vo;

import java.util.*;

public class ReplyBean {
	
	private int idx;
	private String nick;
	private int movieSeq;
	private String reply;
	private int re_ref;
	private Date date;
	private int report;
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getMovieSeq() {
		return movieSeq;
	}
	public void setMovieSeq(int movieSeq) {
		this.movieSeq = movieSeq;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public int getRe_ref() {
		return re_ref;
	}
	public void setRe_ref(int re_ref) {
		this.re_ref = re_ref;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}	
	public int getReport() {
		return report;
	}
	public void setReport(int report) {
		this.report = report;
	}

}

