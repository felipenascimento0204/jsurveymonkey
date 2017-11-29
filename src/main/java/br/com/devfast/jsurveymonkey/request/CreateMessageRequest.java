package br.com.devfast.jsurveymonkey.request;

import br.com.devfast.jsurveymonkey.commons.Request;

public class CreateMessageRequest extends Request {

	private String from_collector_id;
	private String from_message_id;
	
	public String getFrom_collector_id() {
		return from_collector_id;
	}
	public void setFrom_collector_id(String from_collector_id) {
		this.from_collector_id = from_collector_id;
	}
	public String getFrom_message_id() {
		return from_message_id;
	}
	public void setFrom_message_id(String from_message_id) {
		this.from_message_id = from_message_id;
	}
	
}
