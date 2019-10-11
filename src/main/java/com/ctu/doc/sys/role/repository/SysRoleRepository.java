package com.ctu.doc.sys.role.repository;

import com.ctu.doc.sys.role.entity.SysRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 14:38
 * version: 1.0.0
 */
public interface SysRoleRepository extends JpaRepository<SysRoleEntity, String>, JpaSpecificationExecutor<SysRoleEntity> {


}
