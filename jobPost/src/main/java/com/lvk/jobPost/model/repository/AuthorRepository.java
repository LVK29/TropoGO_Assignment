package com.lvk.jobPost.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.lvk.jobPost.model.AuthorModel;

public interface AuthorRepository extends CrudRepository<AuthorModel, String> {

}
