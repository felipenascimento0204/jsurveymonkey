package br.com.devfast.jsurveymonkey.util;

import java.util.Date;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.devfast.jsurveymonkey.commons.Request;
import br.com.devfast.jsurveymonkey.request.GetSurveyRequest;

public class GsonFactory {

	public static Gson  create(){
		GsonBuilder gb = new GsonBuilder();
		gb.registerTypeAdapter(Date.class, new DateDeserializer());
		gb.registerTypeAdapter(GetSurveyRequest.class, new CreateSurveyRequestDeserializer());
		
		gb.addSerializationExclusionStrategy(new ExclusionStrategy() {
		    public boolean shouldSkipField(FieldAttributes f) {
		        return f.getDeclaringClass().equals(Request.class);
		    }
		    public boolean shouldSkipClass(Class<?> clazz) {
		        return false;
		    }
		});
		
		return gb.create();
		
	}
	
}
