package br.com.devfast.jsurveymonkey.request;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Request;

public class GetSurveyRollupRequest extends Request {
	
	private String idSurvey;
	
	public GetSurveyRollupRequest(String idSurvey) {
		this.idSurvey = idSurvey;
		setDate(new Date());
	}

	public String getIdSurvey() {
		return idSurvey;
	}

	public void setIdSurvey(String idSurvey) {
		this.idSurvey = idSurvey;
	}

}
