package br.com.devfast.jsurveymonkey.commons;

import java.net.URLConnection;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ByteArrayEntity;

public class Service {
	
	private ServiceTransaction transaction =  new ServiceTransaction();

	public void setRequestAuthentication(URLConnection connection, String token){
		if(connection != null && token != null){
	        connection.setRequestProperty("Content-Type", "application/json");
	        connection.setRequestProperty("Authorization", "bearer " + token);
		}
	}
	
	public void setRequestAuthentication(HttpRequestBase request, String token){
		if(request != null && token != null){
			request.addHeader("Content-Type", "application/json");
			request.addHeader("Authorization", "bearer " + token);
		}
	}
	
	public void setRequestBody(HttpEntityEnclosingRequestBase httpPatch, String body) {
		try {
			if(body != null){
				HttpEntity entity = new ByteArrayEntity(body.getBytes("UTF-8"));
		        httpPatch.setEntity(entity);
			}
		} catch (Exception e) {}
	}

	public ServiceTransaction getTransaction() {
		return transaction;
	}

	public void setTransaction(ServiceTransaction transaction) {
		this.transaction = transaction;
	}
	
	public void setRequest(String request) {
		this.transaction.setRequest(request);
	}
	public void setResponse(String response) {
		this.transaction.setResponse(response);
	}
	
}
