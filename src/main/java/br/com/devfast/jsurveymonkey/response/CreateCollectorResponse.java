package br.com.devfast.jsurveymonkey.response;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Response;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;

public class CreateCollectorResponse extends Response {
	
	private String status;
	private String sender_email;
	private String name;
	private String thank_you_message;
	private int response_count;
	private String closed_page_message;
	private String href;
	private Date closedDate;
	private boolean display_survey_results;
	private boolean allow_multiple_responses;
	private String anonymous_type;
	private String id;
	private String disqualification_message;
	private boolean password_enabled;
	private Date date_modified;
	private String url;
	private String edit_response_type;
	private String redirect_type;
	private String redirect_url;
	private Date date_created;
	private String response_limit;
	private String type;
	
	public CreateCollectorResponse(StatusSurveyResponse status, String message) {
		super(status, message);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSender_email() {
		return sender_email;
	}

	public void setSender_email(String sender_email) {
		this.sender_email = sender_email;
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

	public int getResponse_count() {
		return response_count;
	}

	public void setResponse_count(int response_count) {
		this.response_count = response_count;
	}

	public String getClosed_page_message() {
		return closed_page_message;
	}

	public void setClosed_page_message(String closed_page_message) {
		this.closed_page_message = closed_page_message;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Date getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	public boolean isDisplay_survey_results() {
		return display_survey_results;
	}

	public void setDisplay_survey_results(boolean display_survey_results) {
		this.display_survey_results = display_survey_results;
	}

	public boolean isAllow_multiple_responses() {
		return allow_multiple_responses;
	}

	public void setAllow_multiple_responses(boolean allow_multiple_responses) {
		this.allow_multiple_responses = allow_multiple_responses;
	}

	public String getAnonymous_type() {
		return anonymous_type;
	}

	public void setAnonymous_type(String anonymous_type) {
		this.anonymous_type = anonymous_type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDisqualification_message() {
		return disqualification_message;
	}

	public void setDisqualification_message(String disqualification_message) {
		this.disqualification_message = disqualification_message;
	}

	public boolean isPassword_enabled() {
		return password_enabled;
	}

	public void setPassword_enabled(boolean password_enabled) {
		this.password_enabled = password_enabled;
	}

	public Date getDate_modified() {
		return date_modified;
	}

	public void setDate_modified(Date date_modified) {
		this.date_modified = date_modified;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEdit_response_type() {
		return edit_response_type;
	}

	public void setEdit_response_type(String edit_response_type) {
		this.edit_response_type = edit_response_type;
	}

	public String getRedirect_type() {
		return redirect_type;
	}

	public void setRedirect_type(String redirect_type) {
		this.redirect_type = redirect_type;
	}

	public String getRedirect_url() {
		return redirect_url;
	}

	public void setRedirect_url(String redirect_url) {
		this.redirect_url = redirect_url;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public String getResponse_limit() {
		return response_limit;
	}

	public void setResponse_limit(String response_limit) {
		this.response_limit = response_limit;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
