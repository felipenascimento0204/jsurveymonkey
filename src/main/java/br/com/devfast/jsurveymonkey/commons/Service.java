package br.com.devfast.jsurveymonkey.commons;

import java.net.URLConnection;

import br.com.devfast.jsurveymonkey.app.SurveyConfig;

public class Service {

	public void setRequestAuthentication(URLConnection connection){
		if(connection != null){
	        connection.setRequestProperty("Content-Type", "application/json");
	        connection.setRequestProperty("Authorization", "bearer " + SurveyConfig.ACCESS_TOKEN);
		}
	}
	
}
