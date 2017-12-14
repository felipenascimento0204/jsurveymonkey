package br.com.devfast.jsurveymonkey.builder;

import br.com.devfast.jsurveymonkey.commons.Builder;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.response.GetSurveyRollupResponse;
import br.com.devfast.jsurveymonkey.rollup.SurveyRollup;
import br.com.devfast.jsurveymonkey.util.GsonFactory;

public class GetSurveyRollupResponseBuilder extends Builder<GetSurveyRollupResponse> {
	
	private GetSurveyRollupResponse response;

	public GetSurveyRollupResponseBuilder(String result) {
		try {
			if(result != null){
				
				SurveyRollup surveyRollup = GsonFactory.create().fromJson(result, SurveyRollup.class);
				this.response = new GetSurveyRollupResponse(surveyRollup);
				this.response.processStatusRequest();
			} else {
				this.response = new GetSurveyRollupResponse(StatusSurveyResponse.ERROR, "empty response");
			}
		} catch (Exception e) {
			this.response = new GetSurveyRollupResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}

	@Override
	public GetSurveyRollupResponse getResponse() {		
		return response;
	}

}
