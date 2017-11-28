package br.com.devfast.jsurveymonkey.request;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Request;

public class GetSurveyRequest extends Request {
	
	private String idSurvey;
	private Date date;
	
	public GetSurveyRequest(String idSurvey) {
		this.idSurvey = idSurvey;
		this.date = new Date();
	}

	public String getIdSurvey() {
		return idSurvey;
	}

	public void setIdSurvey(String idSurvey) {
		this.idSurvey = idSurvey;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
