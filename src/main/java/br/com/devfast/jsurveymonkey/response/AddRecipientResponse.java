package br.com.devfast.jsurveymonkey.response;

import br.com.devfast.jsurveymonkey.commons.Response;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;

public class AddRecipientResponse extends Response {

	private String first_name;
	private String last_name;
	private String mail_status;
	private String href;
	private String id;
	private String survey_response_status;
	private String remove_link;
	private String survey_id;
	private String email;
	private String survey_link;
	
	public AddRecipientResponse(StatusSurveyResponse status, String message) {
		super(status, message);
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMail_status() {
		return mail_status;
	}

	public void setMail_status(String mail_status) {
		this.mail_status = mail_status;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSurvey_response_status() {
		return survey_response_status;
	}

	public void setSurvey_response_status(String survey_response_status) {
		this.survey_response_status = survey_response_status;
	}

	public String getRemove_link() {
		return remove_link;
	}

	public void setRemove_link(String remove_link) {
		this.remove_link = remove_link;
	}

	public String getSurvey_id() {
		return survey_id;
	}

	public void setSurvey_id(String survey_id) {
		this.survey_id = survey_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSurvey_link() {
		return survey_link;
	}

	public void setSurvey_link(String survey_link) {
		this.survey_link = survey_link;
	}
	
}
