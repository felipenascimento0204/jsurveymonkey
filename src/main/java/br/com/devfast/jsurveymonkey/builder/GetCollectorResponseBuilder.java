package br.com.devfast.jsurveymonkey.builder;

import br.com.devfast.jsurveymonkey.commons.Builder;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.response.GetCollectorResponse;
import br.com.devfast.jsurveymonkey.util.GsonFactory;

public class GetCollectorResponseBuilder extends Builder<GetCollectorResponse> {
	
	private GetCollectorResponse response;

	public GetCollectorResponseBuilder(String result) {
		try {
			if(result != null){
				this.response = GsonFactory.create().fromJson(result, GetCollectorResponse.class);
				this.response.processStatusRequest();
			} else {
				this.response = new GetCollectorResponse(StatusSurveyResponse.ERROR, "empty response");
			}
		} catch (Exception e) {
			this.response = new GetCollectorResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}

	@Override
	public GetCollectorResponse getResponse() {
		return response;
	}

}
