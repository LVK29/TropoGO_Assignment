package com.lvk.jobPost.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.lvk.jobPost.model.JobPostModel;

public interface JobPostRepository extends CrudRepository<JobPostModel, Integer> {

}
