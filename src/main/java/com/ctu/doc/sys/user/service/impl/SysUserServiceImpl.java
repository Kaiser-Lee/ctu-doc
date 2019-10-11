package com.ctu.doc.sys.user.service.impl;

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
    public SysUserEntity saveOrUpdate(SysUserEntity entity) {
        return sysUserRepository.save(entity);
    }

    @Override
    public SysUserEntity getSysUserByUserName(String userName) {
        return sysUserRepository.getSysUserByUserName(userName);
    }
}
