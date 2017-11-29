package br.com.devfast.jsurveymonkey.request;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Request;

public class CreateSurveyRequest extends Request {
	
	public CreateSurveyRequest() {
		setDate(new Date());
	}
	
	private String title;
	private String from_template_id;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFrom_template_id() {
		return from_template_id;
	}

	public void setFrom_template_id(String from_template_id) {
		this.from_template_id = from_template_id;
	}
	
}
