package br.com.devfast.jsurveymonkey.commons;

import java.net.URLConnection;

public class Service {
	
	private ServiceTransaction transaction =  new ServiceTransaction();

	public void setRequestAuthentication(URLConnection connection, String token){
		if(connection != null && token != null){
	        connection.setRequestProperty("Content-Type", "application/json");
	        connection.setRequestProperty("Authorization", "bearer " + token);
		}
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
