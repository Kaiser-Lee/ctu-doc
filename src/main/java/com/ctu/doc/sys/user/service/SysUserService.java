package com.ctu.doc.sys.user.service;

import java.util.List;

import com.ctu.doc.sys.user.entity.SysUserEntity;

public interface SysUserService {

    public int saveOrUpdate(SysUserEntity entity);

    public List<SysUserEntity> getSysUserByUserName(String userName);
    
    public SysUserEntity login(String userName, String password);
    
    public List<SysUserEntity> validatorUser(String userName, String id);
}
