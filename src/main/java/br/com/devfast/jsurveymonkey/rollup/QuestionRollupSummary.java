package br.com.devfast.jsurveymonkey.rollup;

import java.util.ArrayList;
import java.util.List;

public class QuestionRollupSummary {
	
	private int answered;
	private int skipped;
	private List<SummaryRoll> rows = new ArrayList<SummaryRoll>();
	private List<Other> other = new ArrayList<Other>();
	private int other_answered;
	
	public int getAnswered() {
		return answered;
	}
	public void setAnswered(int answered) {
		this.answered = answered;
	}
	public int getSkipped() {
		return skipped;
	}
	public void setSkipped(int skipped) {
		this.skipped = skipped;
	}
	public List<SummaryRoll> getRows() {
		return rows;
	}
	public void setRows(List<SummaryRoll> rows) {
		this.rows = rows;
	}
	public List<Other> getOther() {
		return other;
	}
	public void setOther(List<Other> other) {
		this.other = other;
	}
	public int getOther_answered() {
		return other_answered;
	}
	public void setOther_answered(int other_answered) {
		this.other_answered = other_answered;
	}
	

}
