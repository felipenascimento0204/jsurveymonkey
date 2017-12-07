package br.com.devfast.jsurveymonkey.services;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import br.com.devfast.jsurveymonkey.app.SurveyConfig;
import br.com.devfast.jsurveymonkey.builder.AddRecipientResponseBuilder;
import br.com.devfast.jsurveymonkey.builder.CreateCollectorResponseBuilder;
import br.com.devfast.jsurveymonkey.builder.CreateSurveyResponseBuilder;
import br.com.devfast.jsurveymonkey.builder.GetSurveyResponseBuilder;
import br.com.devfast.jsurveymonkey.builder.MessageResponseBuilder;
import br.com.devfast.jsurveymonkey.builder.ModifySurveyResponseBuilder;
import br.com.devfast.jsurveymonkey.builder.SendMessageResponseBuilder;
import br.com.devfast.jsurveymonkey.commons.Service;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.AddRecipientRequest;
import br.com.devfast.jsurveymonkey.request.CreateCollectorRequest;
import br.com.devfast.jsurveymonkey.request.CreateMessageRequest;
import br.com.devfast.jsurveymonkey.request.CreateSurveyRequest;
import br.com.devfast.jsurveymonkey.request.GetSurveyRequest;
import br.com.devfast.jsurveymonkey.request.ModifySurveyRequest;
import br.com.devfast.jsurveymonkey.request.SendMessageRequest;
import br.com.devfast.jsurveymonkey.response.AddRecipientResponse;
import br.com.devfast.jsurveymonkey.response.CreateCollectorResponse;
import br.com.devfast.jsurveymonkey.response.CreateSurveyResponse;
import br.com.devfast.jsurveymonkey.response.GetSurveyResponse;
import br.com.devfast.jsurveymonkey.response.MessageResponse;
import br.com.devfast.jsurveymonkey.response.ModifySurveyResponse;
import br.com.devfast.jsurveymonkey.response.SendMessageResponse;
import br.com.devfast.jsurveymonkey.util.Util;

public class SurveyService extends Service {
	
	public static String SURVEY_SERVICE = "surveys";
	public static String COLLECTOR_SERVICE = "collectors";
	public static String MESSAGES_SERVICE = "messages";
	public static String RECIPIENT_SERVICE = "recipients";
	
	public CreateSurveyResponse createSurvey(CreateSurveyRequest request){
		try {
			
	        URL url = new URL(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE);
	        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	        setRequestAuthentication(connection, request.getAuthenticationToken());
	        connection.setRequestMethod("POST");
	        
	        connection.setDoOutput(true);
	        connection.setUseCaches (false);
	        
	        OutputStream os = connection.getOutputStream();
	        OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
	        String requestBody = request.getJsonBody();
	        setRequest(requestBody);
	        osw.write(requestBody);
	        osw.flush();
	        osw.close();
	        
	        String result = Util.getResponseText(connection);
	        setResponse(result);
	        return new CreateSurveyResponseBuilder(result).getResponse();
	        
		} catch (Exception e) {
			return new CreateSurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}
	
	public GetSurveyResponse getSurvey(GetSurveyRequest request){
		try {
			String urlRequest = SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE + "/" + request.getIdSurvey();
			setRequest(urlRequest);
	        URL url = new URL(urlRequest);
	        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	        connection.setRequestMethod("GET");
	        setRequestAuthentication(connection, request.getAuthenticationToken());
	        String result = Util.getResponseText(connection);
	        setResponse(result);
	        return new GetSurveyResponseBuilder(result).getResponse();
		} catch (Exception e) {
			return new GetSurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}
	
	public CreateCollectorResponse createCollector(CreateCollectorRequest request){
		
		try {
			
	        URL url = new URL(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE + "/" + request.getPathSurveyId() + "/" + COLLECTOR_SERVICE);
	        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	        setRequestAuthentication(connection, request.getAuthenticationToken());
	        connection.setRequestMethod("POST");
	        connection.setDoOutput(true);
	        connection.setUseCaches (false);
	        
	        OutputStream os = connection.getOutputStream();
	        OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
	        String requestBody = request.getJsonBody();
	        setRequest(requestBody);
	        osw.write(requestBody);
	        osw.flush();
	        osw.close();
	        
	        String result = Util.getResponseText(connection);
	        setResponse(result);
	        return new CreateCollectorResponseBuilder(result).getResponse();
	        
		} catch (Exception e) {
			return new CreateCollectorResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
		
	}
	
	public MessageResponse createMessage(CreateMessageRequest request){
		
		try {
			
			URL url = new URL(SurveyConfig.ENDPOINT_V3 + COLLECTOR_SERVICE + "/" + request.getPathCollectorId() + "/" + MESSAGES_SERVICE);
	        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	        setRequestAuthentication(connection, request.getAuthenticationToken());
	        connection.setRequestMethod("POST");
	        connection.setDoOutput(true);
	        connection.setUseCaches (false);
	        
	        OutputStream os = connection.getOutputStream();
	        OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
	        String requestBody = request.getJsonBody();
	        setRequest(requestBody);
	        osw.write(requestBody);
	        osw.flush();
	        osw.close();
	        
	        String result = Util.getResponseText(connection);
	        setResponse(result);
	        return new MessageResponseBuilder(result).getResponse();
			
			
		} catch (Exception e) {
			return new MessageResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
		
	}
	
	public AddRecipientResponse addRecipient(AddRecipientRequest request){
		
		try {
			
			URL url = new URL(SurveyConfig.ENDPOINT_V3 + COLLECTOR_SERVICE + "/" 
					+ request.getPathCollectorId() + "/" 
					+ MESSAGES_SERVICE + "/" + request.getPathMessageId() 
					+ "/" + RECIPIENT_SERVICE );
			
	        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	        setRequestAuthentication(connection, request.getAuthenticationToken());
	        connection.setRequestMethod("POST");
	        connection.setDoOutput(true);
	        connection.setUseCaches (false);
	        
	        OutputStream os = connection.getOutputStream();
	        OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
	        String requestBody = request.getJsonBody();
	        setRequest(requestBody);
	        osw.write(requestBody);
	        osw.flush();
	        osw.close();
	        
	        String result = Util.getResponseText(connection);
	        setResponse(result);
	        return new AddRecipientResponseBuilder(result).getResponse();
			
		} catch (Exception e) {
			return new AddRecipientResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
		
	}
	
	public SendMessageResponse sendMessage(SendMessageRequest request){
		
		try {
			
			URL url = new URL(SurveyConfig.ENDPOINT_V3 + COLLECTOR_SERVICE + "/" 
					+ request.getPathCollectorId() + "/" 
					+ MESSAGES_SERVICE + "/" + request.getPathMessageId() 
					+ "/send" );
			
	        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	        setRequestAuthentication(connection, request.getAuthenticationToken());
	        connection.setRequestMethod("POST");
	        connection.setDoOutput(true);
	        connection.setUseCaches (false);
	        
	        OutputStream os = connection.getOutputStream();
	        OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
	        String requestBody = request.getJsonBody();
	        osw.write(requestBody);
	        osw.flush();
	        osw.close();
	        
	        String result = Util.getResponseText(connection);
	        setResponse(result);
	        return new SendMessageResponseBuilder(result).getResponse();
			
		} catch (Exception e) {
			return new SendMessageResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
		
	}

	public ModifySurveyResponse modifySurvey(ModifySurveyRequest request) {
		
		try {
			
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPatch httpPatch = new HttpPatch(new URI(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE + "/" + request.getPathSurveyId()));
			setRequestAuthentication(httpPatch, request.getAuthenticationToken());
			HttpEntity entity = new ByteArrayEntity(request.getJsonBody().getBytes("UTF-8"));
	        httpPatch.setEntity(entity);
			CloseableHttpResponse response = httpClient.execute(httpPatch);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
	        
	        return new ModifySurveyResponseBuilder(result).getResponse();
	        
		} catch (Exception e) {
			return new ModifySurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}

	}
	
}
