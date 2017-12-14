package br.com.devfast.jsurveymonkey.rollup;

import java.util.ArrayList;
import java.util.List;

public class SurveyRollup {
	
	private int per_page;
	private int total;
	private List<QuenstionRollup> data = new ArrayList<QuenstionRollup>();
	private int page;
	private Links links;
	
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<QuenstionRollup> getData() {
		return data;
	}
	public void setData(List<QuenstionRollup> data) {
		this.data = data;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
	
}
