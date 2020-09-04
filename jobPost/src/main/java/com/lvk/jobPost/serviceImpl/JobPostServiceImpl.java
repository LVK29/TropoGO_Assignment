package com.lvk.jobPost.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.lvk.jobPost.exception.EntryNotFoundException;
import com.lvk.jobPost.model.AuthorModel;
import com.lvk.jobPost.model.JobPostModel;
import com.lvk.jobPost.model.repository.AuthorRepository;
import com.lvk.jobPost.model.repository.JobPostRepository;
import com.lvk.jobPost.service.JobPostService;

@Service
public class JobPostServiceImpl implements JobPostService {

	@Autowired
	JobPostRepository jobPostRepository;

	@Autowired
	AuthorRepository authorRepository;

	public Iterable<JobPostModel> getAllJobPostService() {
		return jobPostRepository.findAll();

	}

	public void createJobPostService(JobPostModel post) {
		if (post.getJobPoster() == null || post.getJobPoster().getEmail() == null) {
			throw new EntryNotFoundException("Job poster details missing");
		}
		if (!authorRepository.findById(post.getJobPoster().getEmail()).isEmpty()) {
			AuthorModel jobAuthor = authorRepository.findById(post.getJobPoster().getEmail()).get();
			post.setJobPoster(jobAuthor);
		}
		post.setPostedTime(new Date());
		jobPostRepository.save(post);

	}

	public JobPostModel getJobFromIdService(int jobId) {

		try {
			return jobPostRepository.findById(jobId).get();
		} catch (Exception ex) {
			throw new EntryNotFoundException("Job post with id: " + jobId + " not found");
		}

	}
}
