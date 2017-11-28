package br.com.devfast.jsurveymonkey.response;

import java.util.Date;

import br.com.devfast.jsurveymonkey.commons.Response;
import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;

public class GetSurveyResponse extends Response {
	
	private int responseCount;
	private int pageCount;
	private Date dateCreated;
	private int folderId;
	private String[] customoVariables;
	private String nickName;
	private String id;
	private int question_count;
	private String category;
	private String preview;
	private boolean isOwner;
	private String language;
	private boolean footer;
	private Date dateModifed;
	private String analyzeUrl;
	private String summaryUrl;
	private String href;
	private String title;
	private String collectUrl;
	private String editUrl;
	private StatusSurveyResponse status;
	private String errorMessage;
	
	public GetSurveyResponse(StatusSurveyResponse status, String message) {
		this.status = status;
		this.errorMessage = message;
	}
	
	public int getResponseCount() {
		return responseCount;
	}
	public void setResponseCount(int responseCount) {
		this.responseCount = responseCount;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public int getFolderId() {
		return folderId;
	}
	public void setFolderId(int folderId) {
		this.folderId = folderId;
	}
	public String[] getCustomoVariables() {
		return customoVariables;
	}
	public void setCustomoVariables(String[] customoVariables) {
		this.customoVariables = customoVariables;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
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
	public Date getDateModifed() {
		return dateModifed;
	}
	public void setDateModifed(Date dateModifed) {
		this.dateModifed = dateModifed;
	}
	public String getAnalyzeUrl() {
		return analyzeUrl;
	}
	public void setAnalyzeUrl(String analyzeUrl) {
		this.analyzeUrl = analyzeUrl;
	}
	public String getSummaryUrl() {
		return summaryUrl;
	}
	public void setSummaryUrl(String summaryUrl) {
		this.summaryUrl = summaryUrl;
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
	public String getCollectUrl() {
		return collectUrl;
	}
	public void setCollectUrl(String collectUrl) {
		this.collectUrl = collectUrl;
	}
	public String getEditUrl() {
		return editUrl;
	}
	public void setEditUrl(String editUrl) {
		this.editUrl = editUrl;
	}
	public StatusSurveyResponse getStatus() {
		return status;
	}
	public void setStatus(StatusSurveyResponse status) {
		this.status = status;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
