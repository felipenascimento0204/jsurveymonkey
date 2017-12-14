package br.com.devfast.jsurveymonkey.rollup;

import java.util.ArrayList;
import java.util.List;

public class QuenstionRollup {
	
	private String subtype;
	private String href;
	private String id;
	private String family;
	private List<QuestionRollupSummary> summary = new ArrayList<QuestionRollupSummary>();
	
	public String getSubtype() {
		return subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
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
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public List<QuestionRollupSummary> getSummary() {
		return summary;
	}
	public void setSummary(List<QuestionRollupSummary> summary) {
		this.summary = summary;
	}
	
}
