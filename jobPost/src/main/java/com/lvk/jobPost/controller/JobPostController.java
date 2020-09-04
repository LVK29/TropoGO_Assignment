package com.lvk.jobPost.controller;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvk.jobPost.dto.JobPostDTO;
import com.lvk.jobPost.facadeImpl.JobPostFacadeImpl;
import com.lvk.jobPost.model.JobPostModel;

import io.swagger.annotations.ApiOperation;

@RestController
public class JobPostController {

	@Autowired
	JobPostFacadeImpl jobPostFacadeImpl;

	private final String RESPONSE = "response";

	@RequestMapping(path = "/jobPosts", method = RequestMethod.GET)
	@ApiOperation(value = "Get all job posts present")
	public Map<String, List<JobPostDTO>> getAllJobs() {
		return Collections.singletonMap(RESPONSE, jobPostFacadeImpl.getAllJobPostFacade());
	}

	@RequestMapping(path = "/postJob", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a job post", notes = "Please make sure jobPoster (post author) is specified and has atleast an email")

	public void createJobPost(@RequestBody JobPostDTO jobPostDTO) {

		jobPostFacadeImpl.createJobPostFacade(jobPostDTO);

	}

	@RequestMapping(path = "/jobPost/{jobPostId}", method = RequestMethod.GET)
	@ApiOperation(value = "Gets job post based on the jobPostId specified")

	public Map<String, JobPostDTO> getJobById(@PathVariable int jobPostId) {

		return Collections.singletonMap(RESPONSE, jobPostFacadeImpl.getJobFromIdFacade(jobPostId));

	}

}
