package br.com.devfast.jsurveymonkey.commons;

import java.net.URLConnection;

public class Service {

	public void setRequestAuthentication(URLConnection connection, String token){
		if(connection != null && token != null){
	        connection.setRequestProperty("Content-Type", "application/json");
	        connection.setRequestProperty("Authorization", "bearer " + token);
		}
	}
	
}
