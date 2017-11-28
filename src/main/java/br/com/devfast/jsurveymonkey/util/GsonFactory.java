package br.com.devfast.jsurveymonkey.util;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonFactory {

	public static Gson  create(){
		GsonBuilder gb = new GsonBuilder();
		gb.registerTypeAdapter(Date.class, new DateDeserializer());
		return gb.create();
	}
	
}
