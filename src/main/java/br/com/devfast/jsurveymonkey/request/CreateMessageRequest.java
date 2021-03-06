package br.com.devfast.jsurveymonkey.request;

import br.com.devfast.jsurveymonkey.commons.Request;

public class CreateMessageRequest extends Request {

	private String type;
	private String recipient_status;
	private String subject;
	private String body_text;
	private String body_html;
	private String is_branding_enabled;
	private String from_message_id;
	private String from_collector_id;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRecipient_status() {
		return recipient_status;
	}
	public void setRecipient_status(String recipient_status) {
		this.recipient_status = recipient_status;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody_text() {
		return body_text;
	}
	public void setBody_text(String body_text) {
		this.body_text = body_text;
	}
	public String getBody_html() {
		return body_html;
	}
	public void setBody_html(String body_html) {
		this.body_html = body_html;
	}
	public String getIs_branding_enabled() {
		return is_branding_enabled;
	}
	public void setIs_branding_enabled(String is_branding_enabled) {
		this.is_branding_enabled = is_branding_enabled;
	}
	public String getFrom_message_id() {
		return from_message_id;
	}
	public void setFrom_message_id(String from_message_id) {
		this.from_message_id = from_message_id;
	}
	public String getFrom_collector_id() {
		return from_collector_id;
	}
	public void setFrom_collector_id(String from_collector_id) {
		this.from_collector_id = from_collector_id;
	}
	
}
