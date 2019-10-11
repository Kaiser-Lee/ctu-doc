package com.ctu.doc.sys.user.service;

import com.ctu.doc.sys.user.entity.SysUserEntity;

public interface SysUserService {

    public int saveOrUpdate(SysUserEntity entity);

    public SysUserEntity getSysUserByUserName(String userName);
    
    public SysUserEntity login(String userName, String password);
}
