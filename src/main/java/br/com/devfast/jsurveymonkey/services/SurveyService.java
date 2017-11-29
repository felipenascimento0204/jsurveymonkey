package br.com.devfast.jsurveymonkey.services;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import br.com.devfast.jsurveymonkey.app.SurveyConfig;
import br.com.devfast.jsurveymonkey.builder.CreateSurveyResponseBuilder;
import br.com.devfast.jsurveymonkey.builder.GetSurveyResponseBuilder;
import br.com.devfast.jsurveymonkey.commons.Service;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.CreateSurveyRequest;
import br.com.devfast.jsurveymonkey.request.GetSurveyRequest;
import br.com.devfast.jsurveymonkey.response.CreateSurveyResponse;
import br.com.devfast.jsurveymonkey.response.GetSurveyResponse;
import br.com.devfast.jsurveymonkey.util.GsonFactory;
import br.com.devfast.jsurveymonkey.util.Util;

public class SurveyService extends Service {
	
	public static String SERVICE_NAME = "surveys";
	
	public GetSurveyResponse requestGetSurvey(GetSurveyRequest request){
		try {
	        URL url = new URL(SurveyConfig.ENDPOINT_V3 + SERVICE_NAME + "/" + request.getIdSurvey());
	        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	        connection.setRequestMethod("GET");
	        setRequestAuthentication(connection, request.getAuthenticationToken());
	        String result = Util.getResponseText(connection);
	        GetSurveyResponse response = new GetSurveyResponseBuilder(result).getResponse();
			return response; 
		} catch (Exception e) {
			return new GetSurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}
	
	public CreateSurveyResponse requestCreateSurvey(CreateSurveyRequest request){
		try {
			
	        URL url = new URL(SurveyConfig.ENDPOINT_V3 + SERVICE_NAME);
	        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	        setRequestAuthentication(connection, request.getAuthenticationToken());
	        connection.setRequestMethod("POST");
	        
	        connection.setDoOutput(true);
	        connection.setUseCaches (false);
	        
	        OutputStream os = connection.getOutputStream();
	        OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
	        osw.write(GsonFactory.create().toJson(request));
	        osw.flush();
	        osw.close();
	        
	        String result = Util.getResponseText(connection);
	        
	        CreateSurveyResponse response = new CreateSurveyResponseBuilder(result).getResponse();
			return response; 
		} catch (Exception e) {
			return new CreateSurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}
	
}
