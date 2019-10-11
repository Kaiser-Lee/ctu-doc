package com.ctu.doc.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.thymeleaf.util.StringUtils;

import com.ctu.doc.common.base.BaseEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/7/4
 * Time: 11:33
 * version: 1.0.0
 */
public class BaseController {

    protected static Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * 获取登录用户名称
     * @return
     */
    public static final String getUserName(){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        return (String)request.getSession().getAttribute("userName");
    }

    /**
     * 获取登录用户id
     * @return
     */
    public static final String getUserId(){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String openId = session.getAttribute("openId").toString();
        return (String)session.getAttribute("openId");
    }

    /**
     * 获取登录用户角色id
     * @return
     */
    public static final String getRoleId(){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        return (String)request.getAttribute("roleId");
    }

    /**
     * 获取登录用户角色编码
     * @return
     */
    public static final String getRoleCode(){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        return (String)request.getAttribute("roleCode");
    }

    /**
     * 获取登录用户组织id
     * @return
     */
    public static final String getOrgId(){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        return (String)request.getAttribute("orgId");
    }

    /**
     * 获取登录用户组织名称
     * @return
     */
    public static final String getOrgName(){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        return (String)request.getAttribute("orgName");
    }

    public void setEntityInfo(BaseEntity entity){
        entity.setUpdateUser(getUserId());
        entity.setUpdateTime(new Date());
        if(StringUtils.isEmpty(entity.getId())){
            //entity.setIsDelete(0);
            entity.setCreateUserOrg(getOrgId());
            //entity.setc(getRoleId());
            entity.setCreateTime(new Date());
            entity.setCreateUser(getUserId());
        }
    }

}

