package br.com.devfast.jsurveymonkey.request;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Request;

public class CreateCollectorRequest extends Request {

	private String type;
	private String name;
	private String thank_you_message;
	private String disqualification_message;
	private Date close_date;
	private String closed_page_message;
	private String redirect_url;
	private String display_survey_results;
	private String edit_response_type;
	private String anonymous_type;
	private String allow_multiple_responses;
	private String password;
	private String sender_email;
	private int response_limit;
	private String redirect_type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getThank_you_message() {
		return thank_you_message;
	}
	public void setThank_you_message(String thank_you_message) {
		this.thank_you_message = thank_you_message;
	}
	public String getDisqualification_message() {
		return disqualification_message;
	}
	public void setDisqualification_message(String disqualification_message) {
		this.disqualification_message = disqualification_message;
	}
	public Date getClose_date() {
		return close_date;
	}
	public void setClose_date(Date close_date) {
		this.close_date = close_date;
	}
	public String getClosed_page_message() {
		return closed_page_message;
	}
	public void setClosed_page_message(String closed_page_message) {
		this.closed_page_message = closed_page_message;
	}
	public String getRedirect_url() {
		return redirect_url;
	}
	public void setRedirect_url(String redirect_url) {
		this.redirect_url = redirect_url;
	}
	public String getDisplay_survey_results() {
		return display_survey_results;
	}
	public void setDisplay_survey_results(String display_survey_results) {
		this.display_survey_results = display_survey_results;
	}
	public String getEdit_response_type() {
		return edit_response_type;
	}
	public void setEdit_response_type(String edit_response_type) {
		this.edit_response_type = edit_response_type;
	}
	public String getAnonymous_type() {
		return anonymous_type;
	}
	public void setAnonymous_type(String anonymous_type) {
		this.anonymous_type = anonymous_type;
	}
	public String getAllow_multiple_responses() {
		return allow_multiple_responses;
	}
	public void setAllow_multiple_responses(String allow_multiple_responses) {
		this.allow_multiple_responses = allow_multiple_responses;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSender_email() {
		return sender_email;
	}
	public void setSender_email(String sender_email) {
		this.sender_email = sender_email;
	}
	public int getResponse_limit() {
		return response_limit;
	}
	public void setResponse_limit(int response_limit) {
		this.response_limit = response_limit;
	}
	public String getRedirect_type() {
		return redirect_type;
	}
	public void setRedirect_type(String redirect_type) {
		this.redirect_type = redirect_type;
	}

}
