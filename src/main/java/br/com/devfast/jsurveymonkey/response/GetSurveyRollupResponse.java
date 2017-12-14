package br.com.devfast.jsurveymonkey.response;

import br.com.devfast.jsurveymonkey.commons.Response;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.rollup.SurveyRollup;

public class GetSurveyRollupResponse extends Response {
	
	private SurveyRollup surveyRollup;
	
	public GetSurveyRollupResponse(StatusSurveyResponse status, String message) {
		super(status, message);
	}
	
	public GetSurveyRollupResponse(SurveyRollup surveyRollup) {
		this.surveyRollup = surveyRollup;
	}

	public SurveyRollup getSurveyRollup() {
		return surveyRollup;
	}

	public void setSurveyRollup(SurveyRollup surveyRollup) {
		this.surveyRollup = surveyRollup;
	}
	
}
