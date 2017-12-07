package br.com.devfast.jsurveymonkey.builder;

import br.com.devfast.jsurveymonkey.commons.Builder;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.response.CreateSurveyResponse;
import br.com.devfast.jsurveymonkey.util.GsonFactory;

public class CreateSurveyResponseBuilder extends Builder<CreateSurveyResponse> {
	
	private CreateSurveyResponse response;

	public CreateSurveyResponseBuilder(String result) {
		try {
			if(result != null){
				this.response = GsonFactory.create().fromJson(result, CreateSurveyResponse.class);
				this.response.processStatusRequest();
			} else {
				this.response = new CreateSurveyResponse(StatusSurveyResponse.ERROR, "empty response");
			}
		} catch (Exception e) {
			this.response = new CreateSurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}

	@Override
	public CreateSurveyResponse getResponse() {
		return response;
	}

}
