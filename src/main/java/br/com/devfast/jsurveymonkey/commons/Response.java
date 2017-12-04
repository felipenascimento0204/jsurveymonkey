package br.com.devfast.jsurveymonkey.commons;

import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.response.Error;

public  class Response {
	
	private StatusSurveyResponse responseStatus;
	private String errorMessage;
	private Error error;
	
	public Response(StatusSurveyResponse status, String message) {
		this.responseStatus = status;
		this.errorMessage = message;
	}

	public StatusSurveyResponse getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(StatusSurveyResponse responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}
	
}
