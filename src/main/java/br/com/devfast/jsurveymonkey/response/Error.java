package br.com.devfast.jsurveymonkey.response;

public class Error {

	private String docs;
	private String message;
	private String id;
	private String name;
	private String http_status_code;
	
	public String getDocs() {
		return docs;
	}
	public void setDocs(String docs) {
		this.docs = docs;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHttp_status_code() {
		return http_status_code;
	}
	public void setHttp_status_code(String http_status_code) {
		this.http_status_code = http_status_code;
	}
	
}
