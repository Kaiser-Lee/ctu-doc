package com.ctu.doc.sys.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ctu.doc.sys.user.entity.SysUserEntity;
import com.ctu.doc.sys.user.repository.SysUserRepository;
import com.ctu.doc.sys.user.service.SysUserService;

/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 14:40
 * version: 1.0.0
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    @Transactional
    public int saveOrUpdate(SysUserEntity entity) {
    	SysUserEntity userEntity = sysUserRepository.save(entity);
    	if(userEntity != null) {
    		return 1;
    	}
        return 0;
    }

    @Override
    public List<SysUserEntity> getSysUserByUserName(String userName) {
        return sysUserRepository.getSysUserByUserName(userName);
    }

	@Override
	public SysUserEntity login(String userName, String password) {
		// TODO Auto-generated method stub
		return sysUserRepository.login(userName, password);
	}

	@Override
	public List<SysUserEntity> validatorUser(String userName, String id) {
		// TODO Auto-generated method stub
		return sysUserRepository.validatorUser(userName, id);
	}
    
   
    
}
