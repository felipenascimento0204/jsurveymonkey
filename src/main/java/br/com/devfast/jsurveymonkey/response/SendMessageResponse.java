package br.com.devfast.jsurveymonkey.response;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Response;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;

public class SendMessageResponse extends Response {

	private String body;
	private String recipient_status;
	private String[] recipients;
	private boolean is_scheduled;
	private Date scheduled_date;
	private String type;
	private String subject;
	
	public SendMessageResponse(StatusSurveyResponse status, String message) {
		super(status, message);
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getRecipient_status() {
		return recipient_status;
	}

	public void setRecipient_status(String recipient_status) {
		this.recipient_status = recipient_status;
	}

	public String[] getRecipients() {
		return recipients;
	}

	public void setRecipients(String[] recipients) {
		this.recipients = recipients;
	}

	public boolean isIs_scheduled() {
		return is_scheduled;
	}

	public void setIs_scheduled(boolean is_scheduled) {
		this.is_scheduled = is_scheduled;
	}

	public Date getScheduled_date() {
		return scheduled_date;
	}

	public void setScheduled_date(Date scheduled_date) {
		this.scheduled_date = scheduled_date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
}
