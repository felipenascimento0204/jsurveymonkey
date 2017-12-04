package br.com.devfast.jsurveymonkey.request;

import br.com.devfast.jsurveymonkey.commons.Request;

public class SendMessageRequest extends Request {

	private String scheduled_date;

	public String getScheduled_date() {
		return scheduled_date;
	}

	public void setScheduled_date(String scheduled_date) {
		this.scheduled_date = scheduled_date;
	}
	
}
