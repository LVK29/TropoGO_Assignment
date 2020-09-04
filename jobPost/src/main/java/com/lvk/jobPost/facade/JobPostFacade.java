package com.lvk.jobPost.facade;

import java.util.List;

import com.lvk.jobPost.dto.JobPostDTO;

public interface JobPostFacade {

	public List<JobPostDTO> getAllJobPostFacade();

	public void createJobPostFacade(JobPostDTO jobPostDTO);

	public JobPostDTO getJobFromIdFacade(int jobId);

}
