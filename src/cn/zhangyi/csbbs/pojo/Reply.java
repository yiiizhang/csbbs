package cn.zhangyi.csbbs.pojo;

import java.sql.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Reply {
	private String username;
	private String byusername;
	private String userid;
	private String byuserid;
	private String themeidorblogid;
	private Date replytime;
	private String replyid;
	private String replycontent;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getByuserid() {
		return byuserid;
	}
	public void setByuserid(String byuserid) {
		this.byuserid = byuserid;
	}
	public String getReplycontent() {
		return replycontent;
	}
	public void setReplycontent(String replycontent) {
		this.replycontent = replycontent;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getByusername() {
		return byusername;
	}
	public void setByusername(String byusername) {
		this.byusername = byusername;
	}
	public String getThemeidorblogid() {
		return themeidorblogid;
	}
	public void setThemeidorblogid(String themeidorblogid) {
		this.themeidorblogid = themeidorblogid;
	}
	public Date getReplytime() {
		return replytime;
	}
	public void setReplytime(Date replytime) {
		this.replytime = replytime;
	}
	public String getReplyid() {
		return replyid;
	}
	public void setReplyid(String replyid) {
		this.replyid = replyid;
	}
}
