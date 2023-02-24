package com.uc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.uc.businessbean.Loginbean;
import com.uc.dao.Logindao;
import com.uc.entity.LoginEntity;

public class LoginServiceImpl implements LoginService{
	@Autowired
	Logindao ldao;
	/* (non-Javadoc)
	 * @see com.accenture.lkm.services.LoginService#validLogin(java.lang.String)
	 */

	public LoginEntity validLogin(String userName) throws Exception
	{
		Loginbean lbean = new Loginbean();
		LoginEntity lentity = ldao.findOne(userName);
//		BeanUtils.copyProperties(lentity, lbean);
		
		return lentity;

}
}
