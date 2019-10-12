package com.ctu.doc.common.base;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 实体基础字段类，所有实体类必须继承这个类
 * User: lufangbu
 * Date: 2019/8/20
 * Time: 17:16
 * version: 1.0.0
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 8603096616392392657L;

    @Id
    @Column(name = "ID", length = 80)
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    private String id;

    @Column(name = "CREATE_TIME", nullable = false)
	@org.hibernate.annotations.CreationTimestamp  // 由数据库自动创建时间
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    @org.hibernate.annotations.CreationTimestamp  // 由数据库自动创建时间
    private Date updateTime;

    @Column(name = "CREATE_USER")
    private String createUser;

    @Column(name = "UPDATE_USER")
    private String updateUser;

    @Column(name = "CREATE_USER_NAME")
    private String createUserName;

    @Column(name = "UPDATE_USER_NAME")
    private String updateUserName;

    @Column(name = "CREATE_USER_ORG")
    private String createUserOrg;

    @Column(name = "UPDATE_USER_ORG")
    private String updateUserOrg;

    @Column(name = "CREATE_USER_ORG_NAME")
    private String createUserOrgName;

    @Column(name = "UPDATE_USER_ORG_NAME")
    private String updateUserOrgName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public String getCreateUserOrg() {
        return createUserOrg;
    }

    public void setCreateUserOrg(String createUserOrg) {
        this.createUserOrg = createUserOrg;
    }

    public String getUpdateUserOrg() {
        return updateUserOrg;
    }

    public void setUpdateUserOrg(String updateUserOrg) {
        this.updateUserOrg = updateUserOrg;
    }

    public String getCreateUserOrgName() {
        return createUserOrgName;
    }

    public void setCreateUserOrgName(String createUserOrgName) {
        this.createUserOrgName = createUserOrgName;
    }

    public String getUpdateUserOrgName() {
        return updateUserOrgName;
    }

    public void setUpdateUserOrgName(String updateUserOrgName) {
        this.updateUserOrgName = updateUserOrgName;
    }
}
