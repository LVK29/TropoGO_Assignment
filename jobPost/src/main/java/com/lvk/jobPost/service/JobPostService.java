package com.lvk.jobPost.service;

import com.lvk.jobPost.model.JobPostModel;

public interface JobPostService {

	public Iterable<JobPostModel> getAllJobPostService();

	public void createJobPostService(JobPostModel post);

	public JobPostModel getJobFromIdService(int jobId);

}
