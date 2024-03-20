package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.main.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	
}
