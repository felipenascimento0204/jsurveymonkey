package br.com.devfast.jsurveymonkey.response;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Response;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;

public class CreateSurveyResponse extends Response {
	
	private int responseCount;
	private int page_count;
	private Date date_created;
	private int folder_id;
	private String[] customo_variables;
	private String nickname;
	private String id;
	private int question_count;
	private String category;
	private String preview;
	private boolean isOwner;
	private String language;
	private boolean footer;
	private Date date_modifed;
	private String analyze_url;
	private String summary_url;
	private String href;
	private String title;
	private String collect_url;
	private String edit_url;
	
	public CreateSurveyResponse(StatusSurveyResponse status, String message) {
		super(status, message);
	}
	
	public int getResponseCount() {
		return responseCount;
	}
	public void setResponseCount(int responseCount) {
		this.responseCount = responseCount;
	}
	public int getPage_count() {
		return page_count;
	}
	public void setPage_count(int page_count) {
		this.page_count = page_count;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public int getFolder_id() {
		return folder_id;
	}
	public void setFolder_id(int folder_id) {
		this.folder_id = folder_id;
	}
	public String[] getCustomo_variables() {
		return customo_variables;
	}
	public void setCustomo_variables(String[] customo_variables) {
		this.customo_variables = customo_variables;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getQuestion_count() {
		return question_count;
	}
	public void setQuestion_count(int question_count) {
		this.question_count = question_count;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPreview() {
		return preview;
	}
	public void setPreview(String preview) {
		this.preview = preview;
	}
	public boolean isOwner() {
		return isOwner;
	}
	public void setOwner(boolean isOwner) {
		this.isOwner = isOwner;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public boolean isFooter() {
		return footer;
	}
	public void setFooter(boolean footer) {
		this.footer = footer;
	}
	public Date getDate_modifed() {
		return date_modifed;
	}
	public void setDate_modifed(Date date_modifed) {
		this.date_modifed = date_modifed;
	}
	public String getAnalyze_url() {
		return analyze_url;
	}
	public void setAnalyze_url(String analyze_url) {
		this.analyze_url = analyze_url;
	}
	public String getSummary_url() {
		return summary_url;
	}
	public void setSummary_url(String summary_url) {
		this.summary_url = summary_url;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCollect_url() {
		return collect_url;
	}
	public void setCollect_url(String collect_url) {
		this.collect_url = collect_url;
	}
	public String getEdit_url() {
		return edit_url;
	}
	public void setEdit_url(String edit_url) {
		this.edit_url = edit_url;
	}
	
}
