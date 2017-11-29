package br.com.devfast.jsurveymonkey.response;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Response;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;

public class MessageResponse extends Response {
	
	private String status;
	private boolean is_scheduled;
	private String subject;
	private String body;
	private boolean is_branding_enabled;
	private Date date_created;
	private Date scheduled_date;
	private String type;
	private String recipient_status;
	private String id;
	private String href;
	
	public MessageResponse(StatusSurveyResponse status, String message) {
		super(status, message);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isIs_scheduled() {
		return is_scheduled;
	}

	public void setIs_scheduled(boolean is_scheduled) {
		this.is_scheduled = is_scheduled;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public boolean isIs_branding_enabled() {
		return is_branding_enabled;
	}

	public void setIs_branding_enabled(boolean is_branding_enabled) {
		this.is_branding_enabled = is_branding_enabled;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
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

	public String getRecipient_status() {
		return recipient_status;
	}

	public void setRecipient_status(String recipient_status) {
		this.recipient_status = recipient_status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}
	
}
