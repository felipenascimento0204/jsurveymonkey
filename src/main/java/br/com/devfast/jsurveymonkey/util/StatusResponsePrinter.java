package br.com.devfast.jsurveymonkey.util;

import br.com.devfast.jsurveymonkey.commons.Response;

public class StatusResponsePrinter {

	public static void print(Response response) {
		if(response != null){
			System.out.println("Status: " + response.getResponseStatus());
			if(response.getErrorMessage() != null){
				System.out.println("Message: " + response.getErrorMessage());
			}
		} else {
			System.out.println("Status: response null");
		}
	}
	
}
