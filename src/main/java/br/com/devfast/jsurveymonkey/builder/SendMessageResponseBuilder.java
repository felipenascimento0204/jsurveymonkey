package br.com.devfast.jsurveymonkey.builder;

import br.com.devfast.jsurveymonkey.commons.Builder;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.response.SendMessageResponse;
import br.com.devfast.jsurveymonkey.util.GsonFactory;

public class SendMessageResponseBuilder extends Builder<SendMessageResponse> {
	
	private SendMessageResponse response;

	public SendMessageResponseBuilder(String result) {
		try {
			if(result != null){
				this.response = GsonFactory.create().fromJson(result, SendMessageResponse.class);
				this.response.processStatusRequest();
			} else {
				this.response = new SendMessageResponse(StatusSurveyResponse.ERROR, "empty response");
			}
		} catch (Exception e) {
			this.response = new SendMessageResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}

	@Override
	public SendMessageResponse getResponse() {
		return response;
	}

}
