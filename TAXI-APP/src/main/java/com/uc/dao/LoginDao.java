package com.uc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uc.entity.LoginEntity;

public interface Logindao  extends JpaRepository<LoginEntity, String>{

	LoginEntity findOne(String userName);

	

}
