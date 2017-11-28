package br.com.devfast.jsurveymonkey.commons;

import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;

public abstract class Response {
	
	public abstract StatusSurveyResponse getStatus();
	
	public abstract void setStatus(StatusSurveyResponse status);
	
	public abstract String getErrorMessage();
	public abstract void setErrorMessage(String errorMessage);

}
