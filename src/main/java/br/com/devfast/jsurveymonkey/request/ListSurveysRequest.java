package br.com.devfast.jsurveymonkey.request;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Request;

public class ListSurveysRequest extends Request {
	
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
