package br.com.devfast.jsurveymonkey.util;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import br.com.devfast.jsurveymonkey.request.CreateSurveyRequest;

public class CreateSurveyRequestDeserializer implements JsonSerializer<CreateSurveyRequest> {
	
	public JsonElement serialize(CreateSurveyRequest obj, Type type, JsonSerializationContext jsc) {
        Gson gson = new Gson();
        JsonObject jObj = (JsonObject)gson.toJsonTree(obj);  
        jObj.remove("date");
        jObj.remove("authenticationToken");
        return jObj;
    }

}
