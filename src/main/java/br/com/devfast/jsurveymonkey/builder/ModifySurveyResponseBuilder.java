package br.com.devfast.jsurveymonkey.builder;

import br.com.devfast.jsurveymonkey.commons.Builder;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.response.ModifySurveyResponse;
import br.com.devfast.jsurveymonkey.util.GsonFactory;

public class ModifySurveyResponseBuilder extends Builder<ModifySurveyResponse> {
	
	private ModifySurveyResponse response;

	public ModifySurveyResponseBuilder(String result) {
		try {
			if(result != null){
				this.response = GsonFactory.create().fromJson(result, ModifySurveyResponse.class);
				this.response.processStatusRequest();
			} else {
				this.response = new ModifySurveyResponse(StatusSurveyResponse.ERROR, "empty response");
			}
		} catch (Exception e) {
			this.response = new ModifySurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}

	@Override
	public ModifySurveyResponse getResponse() {
		return response;
	}

}
