package com.ctu.doc.sys.user.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ctu.doc.common.base.BaseEntity;

/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 14:15
 * version: 1.0.0
 */

@Entity
@Table(name = "SYS_USER")
public class SysUserEntity extends BaseEntity {

    private static final long serialVersionUID = -6004966539429393923L;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "REAL_NAME")
    private String realName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "TELL")
    private String tell;

    @Column(name = "MALL")
    private String mall;

    @Column(name = "WECHAT_NUM")
    private String wechatNum;

    @Column(name = "QQ_NUM")
    private String QQNum;

    @Column(name = "AVATAR")
    private String avatar;

    @Column(name = "NICK")
    private String nick;

    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "USER_PID")
    private String userPid;

    @Column(name = "IS_MANAGER")
    private String isManager;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getMall() {
        return mall;
    }

    public void setMall(String mall) {
        this.mall = mall;
    }

    public String getWechatNum() {
        return wechatNum;
    }

    public void setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum;
    }

    public String getQQNum() {
        return QQNum;
    }

    public void setQQNum(String QQNum) {
        this.QQNum = QQNum;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getUserPid() {
        return userPid;
    }

    public void setUserPid(String userPid) {
        this.userPid = userPid;
    }

    public String getIsManager() {
        return isManager;
    }

    public void setIsManager(String isManager) {
        this.isManager = isManager;
    }
}
