package br.com.devfast.jsurveymonkey.builder;

import br.com.devfast.jsurveymonkey.commons.Builder;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.response.CreateCollectorResponse;
import br.com.devfast.jsurveymonkey.util.GsonFactory;

public class CreateCollectorResponseBuilder extends Builder<CreateCollectorResponse> {
	
	private CreateCollectorResponse response;

	public CreateCollectorResponseBuilder(String result) {
		try {
			if(result != null){
				this.response = GsonFactory.create().fromJson(result, CreateCollectorResponse.class);
				this.response.processStatusRequest();
			} else {
				this.response = new CreateCollectorResponse(StatusSurveyResponse.ERROR, "empty response");
			}
		} catch (Exception e) {
			this.response = new CreateCollectorResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}

	@Override
	public CreateCollectorResponse getResponse() {
		return response;
	}

}
