package com.ctu.doc.sys.user.repository;

import com.ctu.doc.sys.user.entity.SysUserEntity;

import java.util.List;

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

    @Query(value = "select * from sys_user where user_name=:userName", nativeQuery = true)
    public List<SysUserEntity> getSysUserByUserName(@Param("userName") String userName);
    
    @Query(value = "select * from sys_user where user_name=:userName and password=:password", nativeQuery = true)
    public SysUserEntity login(@Param("userName") String userName, @Param("password") String password);
    
    @Query(value = "select * from sys_user where user_name=:userName and id<>:id", nativeQuery = true)
    public List<SysUserEntity> validatorUser(@Param("userName") String userName, @Param("id") String id);
}
