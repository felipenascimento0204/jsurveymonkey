package br.com.devfast.jsurveymonkey.rollup;

public class SummaryRoll {
	
	private int max;
	private int total;
	private RowStats stats;
	private String id;
	
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public RowStats getStats() {
		return stats;
	}
	public void setStats(RowStats stats) {
		this.stats = stats;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
