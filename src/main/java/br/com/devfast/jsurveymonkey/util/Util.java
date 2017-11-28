package br.com.devfast.jsurveymonkey.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLConnection;

public class Util {
	
	public static String getResponseText(URLConnection connection){
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
	}

}
