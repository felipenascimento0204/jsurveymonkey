package br.com.devfast.jsurveymonkey.util;

import br.com.devfast.jsurveymonkey.commons.Response;

public class SurveyPrinter {

	public static void print(Response response) {
		if(response != null){
			System.out.println("Status: " + response.getResponseStatus());
		} else {
			System.out.println("Status: response null");
		}
	}
	
}
