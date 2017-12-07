package br.com.devfast.jsurveymonkey.builder;

import br.com.devfast.jsurveymonkey.commons.Builder;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.response.GetSurveyResponse;
import br.com.devfast.jsurveymonkey.util.GsonFactory;

public class GetSurveyResponseBuilder extends Builder<GetSurveyResponse> {
	
	private GetSurveyResponse response;

	public GetSurveyResponseBuilder(String result) {
		try {
			if(result != null){
				this.response = GsonFactory.create().fromJson(result, GetSurveyResponse.class);
				this.response.processStatusRequest();
			} else {
				this.response = new GetSurveyResponse(StatusSurveyResponse.ERROR, "empty response");
			}
		} catch (Exception e) {
			this.response = new GetSurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}

	@Override
	public GetSurveyResponse getResponse() {
		return response;
	}

}
