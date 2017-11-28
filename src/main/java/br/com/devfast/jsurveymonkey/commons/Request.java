package br.com.devfast.jsurveymonkey.commons;

import java.util.Date;

public class Request {
	
	private Date date;
	private String authenticationToken;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuthenticationToken() {
		return authenticationToken;
	}
	public void setAuthenticationToken(String authenticationToken) {
		this.authenticationToken = authenticationToken;
	}
	
}
