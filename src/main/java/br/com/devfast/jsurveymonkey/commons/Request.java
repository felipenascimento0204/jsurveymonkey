package br.com.devfast.jsurveymonkey.commons;

import java.util.Date;

import br.com.devfast.jsurveymonkey.util.GsonFactory;

public class Request {
	
	public Request() {
		setDate(new Date());
	}
	
	private String pathSurveyId;
	private String pathCollectorId;
	private String pathMessageId;
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
	public String getPathSurveyId() {
		return pathSurveyId;
	}
	public void setPathSurveyId(String pathSurveyId) {
		this.pathSurveyId = pathSurveyId;
	}
	public String getPathCollectorId() {
		return pathCollectorId;
	}
	public void setPathCollectorId(String pathCollectorId) {
		this.pathCollectorId = pathCollectorId;
	}
	public String getPathMessageId() {
		return pathMessageId;
	}
	public void setPathMessageId(String pathMessageId) {
		this.pathMessageId = pathMessageId;
	}
	public String getJsonBody() {
		return GsonFactory.create().toJson(this);
	}
	
}
