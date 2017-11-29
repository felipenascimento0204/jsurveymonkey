package br.com.devfast.jsurveymonkey.builder;

import br.com.devfast.jsurveymonkey.commons.Builder;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.response.MessageResponse;
import br.com.devfast.jsurveymonkey.util.GsonFactory;

public class MessageResponseBuilder extends Builder<MessageResponse> {
	
	private MessageResponse response;

	public MessageResponseBuilder(String result) {
		try {
			if(result != null){
				this.response = GsonFactory.create().fromJson(result, MessageResponse.class);
				this.response.setResponseStatus(StatusSurveyResponse.SUCCESS);
			} else {
				this.response = new MessageResponse(StatusSurveyResponse.ERROR, "empty response");
			}
		} catch (Exception e) {
			this.response = new MessageResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}

	@Override
	public MessageResponse getResponse() {
		return response;
	}

}
