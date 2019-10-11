package com.ctu.doc.sys.user.repository;

import com.ctu.doc.sys.user.entity.SysUserEntity;
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
public interface SysUserRepository extends JpaRepository<SysUserEntity, String>, JpaSpecificationExecutor<SysUserEntity> {

    @Query(value = "select * from SYS_USER where USER_NAME=:userName", nativeQuery = true)
    public SysUserEntity getSysUserByUserName(@Param("userName") String userName);
}
