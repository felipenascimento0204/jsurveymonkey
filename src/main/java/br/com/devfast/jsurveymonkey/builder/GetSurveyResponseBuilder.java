package br.com.devfast.jsurveymonkey.builder;

import br.com.devfast.jsurveymonkey.commons.Builder;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.response.GetSurveyResponse;

public class GetSurveyResponseBuilder extends Builder<GetSurveyResponse> {
	
	private GetSurveyResponse response;

	public GetSurveyResponseBuilder(String result) {
		this.response = new GetSurveyResponse();
		this.response.setStatus(StatusSurveyResponse.SUCCESS);
	}

	@Override
	public GetSurveyResponse getResponse() {
		return response;
	}

}
