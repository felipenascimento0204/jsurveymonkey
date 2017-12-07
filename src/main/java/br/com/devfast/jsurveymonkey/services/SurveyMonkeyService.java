package br.com.devfast.jsurveymonkey.services;

import java.net.URI;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
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

public class SurveyMonkeyService extends Service {
	
	public static String SURVEY_SERVICE = "surveys";
	public static String COLLECTOR_SERVICE = "collectors";
	public static String MESSAGES_SERVICE = "messages";
	public static String RECIPIENT_SERVICE = "recipients";
	
	public SurveyMonkeyService(String authenticationToken) {
		setAuthenticationToken(authenticationToken);
	}
	
	public CreateSurveyResponse createSurvey(CreateSurveyRequest request){
		try {
			
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(new URI(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE));
			
			setRequestAuthentication(httpPost, request.getAuthenticationToken());
			setRequestBody(httpPost, request.getJsonBody());
			
			CloseableHttpResponse response = httpClient.execute(httpPost);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
	        return new CreateSurveyResponseBuilder(result).getResponse();
	        
		} catch (Exception e) {
			return new CreateSurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}
	
	public GetSurveyResponse getSurvey(GetSurveyRequest request){
		try {
			
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpGet httpGet = new HttpGet(new URI(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE + "/" + request.getIdSurvey()));
			
			setRequestAuthentication(httpGet, request.getAuthenticationToken());
			
			CloseableHttpResponse response = httpClient.execute(httpGet);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
	        
	        return new GetSurveyResponseBuilder(result).getResponse();
		} catch (Exception e) {
			return new GetSurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
	}
	
	public CreateCollectorResponse createCollector(CreateCollectorRequest request){
		
		try {
			
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(new URI(SurveyConfig.ENDPOINT_V3 + SURVEY_SERVICE + "/" + request.getPathSurveyId() + "/" + COLLECTOR_SERVICE));
			
			setRequestAuthentication(httpPost, request.getAuthenticationToken());
			setRequestBody(httpPost, request.getJsonBody());
			
			CloseableHttpResponse response = httpClient.execute(httpPost);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
	        return new CreateCollectorResponseBuilder(result).getResponse();
	        
		} catch (Exception e) {
			return new CreateCollectorResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
		
	}
	
	public MessageResponse createMessage(CreateMessageRequest request){
		
		try {
			
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(new URI(SurveyConfig.ENDPOINT_V3 + COLLECTOR_SERVICE + "/" + request.getPathCollectorId() + "/" + MESSAGES_SERVICE));
			
			setRequestAuthentication(httpPost, request.getAuthenticationToken());
			setRequestBody(httpPost, request.getJsonBody());
			
			CloseableHttpResponse response = httpClient.execute(httpPost);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
	        return new MessageResponseBuilder(result).getResponse();
			
		} catch (Exception e) {
			return new MessageResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
		
	}
	
	public AddRecipientResponse addRecipient(AddRecipientRequest request){
		
		try {
			
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(new URI(SurveyConfig.ENDPOINT_V3 + COLLECTOR_SERVICE + "/" 
					+ request.getPathCollectorId() + "/" 
					+ MESSAGES_SERVICE + "/" + request.getPathMessageId() 
					+ "/" + RECIPIENT_SERVICE));
			
			setRequestAuthentication(httpPost, request.getAuthenticationToken());
			setRequestBody(httpPost, request.getJsonBody());
			
			CloseableHttpResponse response = httpClient.execute(httpPost);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
			
	        return new AddRecipientResponseBuilder(result).getResponse();
			
		} catch (Exception e) {
			return new AddRecipientResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}
		
	}
	
	public SendMessageResponse sendMessage(SendMessageRequest request){
		
		try {
			
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(new URI(SurveyConfig.ENDPOINT_V3 + COLLECTOR_SERVICE + "/" 
					+ request.getPathCollectorId() + "/" 
					+ MESSAGES_SERVICE + "/" + request.getPathMessageId() 
					+ "/send"));
			
			setRequestAuthentication(httpPost, request.getAuthenticationToken());
			setRequestBody(httpPost, request.getJsonBody());
			
			CloseableHttpResponse response = httpClient.execute(httpPost);
			String result = EntityUtils.toString(response.getEntity());
			
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
			setRequestBody(httpPatch, request.getJsonBody());
			
			CloseableHttpResponse response = httpClient.execute(httpPatch);
			String result = EntityUtils.toString(response.getEntity());
			
	        setResponse(result);
	        
	        return new ModifySurveyResponseBuilder(result).getResponse();
	        
		} catch (Exception e) {
			return new ModifySurveyResponse(StatusSurveyResponse.ERROR, e.getMessage());
		}

	}

	
}
