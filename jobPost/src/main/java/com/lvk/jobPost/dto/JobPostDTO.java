package com.lvk.jobPost.dto;

import java.util.Date;

import com.lvk.jobPost.model.AuthorModel;

import lombok.Getter;
import lombok.Setter;

enum EmploymentTypeEnum {
	FULL_TIME, PART_TIME, INTERSHIP
}

public class JobPostDTO {

	private int id;
	private String location;
	private String responsibilities;
	private String techStack;
	private String seniorityLevel;
	private String industry;
	private Date postedTime;
	private String experience;
	private EmploymentTypeEnum employmentType;
	private AuthorModel jobPoster;
	private long postedDays;

	public String getPostedDays() {
		return postedDays + " days ago";
	}

	public void setPostedDays(long postedDays) {
		this.postedDays = postedDays;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getResponsibilities() {
		return responsibilities;
	}

	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}

	public String getTechStack() {
		return techStack;
	}

	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}

	public String getSeniorityLevel() {
		return seniorityLevel;
	}

	public void setSeniorityLevel(String seniorityLevel) {
		this.seniorityLevel = seniorityLevel;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public Date getPostedTime() {
		return postedTime;
	}

	public void setPostedTime(Date postedTime) {
		this.postedTime = postedTime;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public EmploymentTypeEnum getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(EmploymentTypeEnum employmentType) {
		this.employmentType = employmentType;
	}

	public AuthorModel getJobPoster() {
		return jobPoster;
	}

	public void setJobPoster(AuthorModel jobPoster) {
		this.jobPoster = jobPoster;
	}

}
