package com.sist.dao;
import java.util.*;
/*
 * 컬럼명 = 변수명 반드시 같아야한다.
 * myBtis에서 db에서 읽은 컬럼명과 같은 변수명에 값을 넣어주기 때문에!
 */

public class BoardVO {
	
	private int no;
	private String name;
	private String subject;
	private String content;
	private String pwd;
	private Date hiredate;
	private int hit;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
}
