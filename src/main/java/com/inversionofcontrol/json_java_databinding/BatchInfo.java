package com.inversionofcontrol.json_java_databinding;

public class BatchInfo {
	private String batchName;
	private String trainer;
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "BatchInfo [batchName=" + batchName + ", trainer=" + trainer + "]";
	}
	
	
	

}
