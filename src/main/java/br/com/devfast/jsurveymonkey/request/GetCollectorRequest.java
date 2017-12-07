package br.com.devfast.jsurveymonkey.request;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Request;

public class GetCollectorRequest extends Request {
	
	private String idCollector;
	
	public GetCollectorRequest(String idCollector) {
		this.idCollector = idCollector;
		setDate(new Date());
	}

	public String getIdCollector() {
		return idCollector;
	}

	public void setIdCollector(String idCollector) {
		this.idCollector = idCollector;
	}

}
