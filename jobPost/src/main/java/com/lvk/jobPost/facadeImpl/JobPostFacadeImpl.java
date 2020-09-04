package com.lvk.jobPost.facadeImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lvk.jobPost.dto.JobPostDTO;
import com.lvk.jobPost.facade.JobPostFacade;
import com.lvk.jobPost.model.JobPostModel;
import com.lvk.jobPost.serviceImpl.JobPostServiceImpl;

@Component
public class JobPostFacadeImpl implements JobPostFacade{

	@Autowired
	JobPostServiceImpl jobPostService;

	public List<JobPostDTO> getAllJobPostFacade() {
		ModelMapper modelMapper = new ModelMapper();
		List<JobPostDTO> jobPostDTOList = new ArrayList<>();
		Iterable<JobPostModel> jobPostModelList = jobPostService.getAllJobPostService();
		for (JobPostModel jobPostModel : jobPostModelList) {

			JobPostDTO post = modelMapper.map(jobPostModel, JobPostDTO.class);
			post.setPostedDays(findDateDifference(post.getPostedTime()));
			jobPostDTOList.add(post);
		}
		return jobPostDTOList;

	}

	public void createJobPostFacade(JobPostDTO jobPostDTO) {
		ModelMapper modelMapper = new ModelMapper();
		JobPostModel post = modelMapper.map(jobPostDTO, JobPostModel.class);

		jobPostService.createJobPostService(post);
	}

	public JobPostDTO getJobFromIdFacade(int jobId) {
		ModelMapper modelMapper = new ModelMapper();
		JobPostModel jobPost = jobPostService.getJobFromIdService(jobId);
		JobPostDTO post = modelMapper.map(jobPost, JobPostDTO.class);
		long difference = findDateDifference(jobPost.getPostedTime());
		post.setPostedDays(Math.abs(difference));
		return post;
	}

	private long findDateDifference(Date fromDate) {
		return Math.abs((fromDate.getTime() - new Date().getTime()) / 86400000);
	}
}
