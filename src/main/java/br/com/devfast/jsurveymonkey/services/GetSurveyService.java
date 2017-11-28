package br.com.devfast.jsurveymonkey.services;

import java.net.URL;
import java.net.URLConnection;

import br.com.devfast.jsurveymonkey.app.SurveyConfig;
import br.com.devfast.jsurveymonkey.builder.GetSurveyResponseBuilder;
import br.com.devfast.jsurveymonkey.commons.Service;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.GetSurveyRequest;
import br.com.devfast.jsurveymonkey.response.GetSurveyResponse;
import br.com.devfast.jsurveymonkey.util.Util;

public class GetSurveyService extends Service {
	
	public static String SERVICE_NAME = "surveys";
	
	public GetSurveyResponse requestGetSurvey(GetSurveyRequest request){
		try {
	        URL url = new URL(SurveyConfig.ENDPOINT_V3 + SERVICE_NAME + "/" + request.getIdSurvey());
	        URLConnection connection = url.openConnection();
	        setRequestAuthentication(connection, request.getAuthenticationToken());
	        String result = Util.getResponseText(connection);
	        GetSurveyResponse response = new GetSurveyResponseBuilder(result).getResponse();
	        response.setStatus(StatusSurveyResponse.SUCCESS);
			return response; 
		} catch (Exception e) {
			return new GetSurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}
	
}
