package com.ctu.doc.sys.user.service;

import com.ctu.doc.sys.user.entity.SysUserEntity;

public interface SysUserService {

    public SysUserEntity saveOrUpdate(SysUserEntity entity);

    public SysUserEntity getSysUserByUserName(String userName);
}
