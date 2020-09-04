package com.lvk.jobPost.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class JobPostModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String jobTitle;
	private String location;
	@Column
	@Lob
	private String responsibilities;
	private String techStack;
	private String seniorityLevel;
	private String industry;
	@Temporal(TemporalType.DATE)
	private Date postedTime;
	private String experience;
	private String employmentType;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job_author_fk")
	private AuthorModel jobPoster;

	public JobPostModel() {

	}

	

	public JobPostModel(int id, String jobTitle, String location, String responsibilities, String techStack,
			String seniorityLevel, String industry, Date postedTime, String experience, String employmentType,
			AuthorModel jobPoster) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
		this.location = location;
		this.responsibilities = responsibilities;
		this.techStack = techStack;
		this.seniorityLevel = seniorityLevel;
		this.industry = industry;
		this.postedTime = postedTime;
		this.experience = experience;
		this.employmentType = employmentType;
		this.jobPoster = jobPoster;
	}

	


	public String getJobTitle() {
		return jobTitle;
	}



	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
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

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public AuthorModel getJobPoster() {
		return jobPoster;
	}

	public void setJobPoster(AuthorModel jobPoster) {
		this.jobPoster = jobPoster;
	}

}
