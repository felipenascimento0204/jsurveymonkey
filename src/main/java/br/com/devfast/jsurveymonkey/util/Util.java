package br.com.devfast.jsurveymonkey.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;

public class Util {
	
	/*public static String getResponseText(URLConnection connection){
		if(connection != null){
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				StringBuilder sb  = new StringBuilder();
				String line = null;
		        while ((line = in.readLine()) != null){
		        	sb.append(line+"\n");
		        }
		        in.close();
		        return sb.toString();
			} catch (Exception e) {
				return "";
			}
		} else {
			return "";
		}
	}*/
	
	public static String getResponseText(URLConnection connection) throws IOException {
		
		BufferedReader in = null;
		try {
		    in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		} catch (IOException ioe) {
		    if (connection instanceof HttpURLConnection) {
		        HttpURLConnection httpConn = (HttpURLConnection) connection;
		        int statusCode = httpConn.getResponseCode();
		        if (statusCode != 200) {
		            in = new BufferedReader(new InputStreamReader(httpConn.getErrorStream()));
		        }
		    }
		}
		
		try {
			StringBuilder sb  = new StringBuilder();
			String line = null;
	        while ((line = in.readLine()) != null){
	        	sb.append(line+"\n");
	        }
	        in.close();
	        return sb.toString();
		} catch (Exception e) {
			return "";
		}
		
	}

}
