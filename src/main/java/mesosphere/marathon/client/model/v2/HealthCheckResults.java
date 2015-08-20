package mesosphere.marathon.client.model.v2;

import mesosphere.marathon.client.utils.ModelUtils;

public class HealthCheckResults {
	
	private String taskId;
	
	private Boolean alive;
	
	private Integer consecutiveFailures;
	
	private String firstSuccess;
	
	private String lastFailure;
	
	private String lastSuccess;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Boolean getAlive() {
		return alive;
	}

	public void setAlive(Boolean alive) {
		this.alive = alive;
	}

	public Integer getConsecutiveFailures() {
		return consecutiveFailures;
	}

	public void setConsecutiveFailures(Integer consecutiveFailures) {
		this.consecutiveFailures = consecutiveFailures;
	}

	public String getFirstSuccess() {
		return firstSuccess;
	}

	public void setFirstSuccess(String firstSuccess) {
		this.firstSuccess = firstSuccess;
	}

	public String getLastFailure() {
		return lastFailure;
	}

	public void setLastFailure(String lastFailure) {
		this.lastFailure = lastFailure;
	}

	public String getLastSuccess() {
		return lastSuccess;
	}

	public void setLastSuccess(String lastSuccess) {
		this.lastSuccess = lastSuccess;
	}
	
	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}
