package com.pfly;

import java.util.Date;

public class Task {

	private long id;
	private String name;
	private String description;
	private int status;
	private int importance;
	private int closeness;
	private int simplicity;
	private Date dateCreated;
	private Date dateFinished;
	private Date deadline;
	private String notes;
	private String desiredOutcome;
	private int projectId;
	private int dependsOn;
	
	
	
	public Task(long id, String name, String description, int status, int importance, int closeness, int simplicity,
			Date dateCreated, Date dateFinished, Date deadline, String notes, String desiredOutcome, int projectId,
			int dependsOn) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
		this.importance = importance;
		this.closeness = closeness;
		this.simplicity = simplicity;
		this.dateCreated = dateCreated;
		this.dateFinished = dateFinished;
		this.deadline = deadline;
		this.notes = notes;
		this.desiredOutcome = desiredOutcome;
		this.projectId = projectId;
		this.dependsOn = dependsOn;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getImportance() {
		return importance;
	}
	public void setImportance(int importance) {
		this.importance = importance;
	}
	public int getCloseness() {
		return closeness;
	}
	public void setCloseness(int closeness) {
		this.closeness = closeness;
	}
	public int getSimplicity() {
		return simplicity;
	}
	public void setSimplicity(int simplicity) {
		this.simplicity = simplicity;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateFinished() {
		return dateFinished;
	}
	public void setDateFinished(Date dateFinished) {
		this.dateFinished = dateFinished;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getDesiredOutcome() {
		return desiredOutcome;
	}
	public void setDesiredOutcome(String desiredOutcome) {
		this.desiredOutcome = desiredOutcome;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getDependsOn() {
		return dependsOn;
	}
	public void setDependsOn(int dependsOn) {
		this.dependsOn = dependsOn;
	}
	
	
	
	
}
