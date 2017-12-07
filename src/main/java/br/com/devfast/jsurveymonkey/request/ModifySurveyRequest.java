package br.com.devfast.jsurveymonkey.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import br.com.devfast.jsurveymonkey.commons.Request;

public class ModifySurveyRequest extends Request {
	
	public ModifySurveyRequest() {
		setDate(new Date());
	}
	
	private String title;
	private String nickname;
	private String language;
	private Map<String, String> custom_variables = new HashMap<String, String>();
	private boolean footer;
	private String folder_id;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Map<String, String> getCustom_variables() {
		return custom_variables;
	}
	public void setCustom_variables(Map<String, String> custom_variables) {
		this.custom_variables = custom_variables;
	}
	public boolean isFooter() {
		return footer;
	}
	public void setFooter(boolean footer) {
		this.footer = footer;
	}
	public String getFolder_id() {
		return folder_id;
	}
	public void setFolder_id(String folder_id) {
		this.folder_id = folder_id;
	}
	
}
