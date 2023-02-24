package com.uc.service;

import com.uc.entity.LoginEntity;

public interface LoginService {

	LoginEntity validLogin(String userName) throws Exception;

}
