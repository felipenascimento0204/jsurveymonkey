package br.com.devfast.jsurveymonkey.builder;

import br.com.devfast.jsurveymonkey.commons.Builder;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.response.AddRecipientResponse;
import br.com.devfast.jsurveymonkey.util.GsonFactory;

public class AddRecipientResponseBuilder extends Builder<AddRecipientResponse> {
	
	private AddRecipientResponse response;

	public AddRecipientResponseBuilder(String result) {
		try {
			if(result != null){
				this.response = GsonFactory.create().fromJson(result, AddRecipientResponse.class);
				this.response.setResponseStatus(StatusSurveyResponse.SUCCESS);
			} else {
				this.response = new AddRecipientResponse(StatusSurveyResponse.ERROR, "empty response");
			}
		} catch (Exception e) {
			this.response = new AddRecipientResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}

	@Override
	public AddRecipientResponse getResponse() {
		return response;
	}

}
