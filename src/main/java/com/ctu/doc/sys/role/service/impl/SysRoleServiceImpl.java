package com.ctu.doc.sys.role.service.impl;

import com.ctu.doc.sys.role.entity.SysRoleEntity;
import com.ctu.doc.sys.role.repository.SysRoleRepository;
import com.ctu.doc.sys.role.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 14:40
 * version: 1.0.0
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleRepository sysRoleRepository;

    @Override
    public SysRoleEntity saveOrUpdate(SysRoleEntity entity) {
        return null;
    }



}
