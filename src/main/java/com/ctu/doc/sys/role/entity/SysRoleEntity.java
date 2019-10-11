package com.ctu.doc.sys.role.entity;



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
@Table(name = "SYS_ROLE")
public class SysRoleEntity extends BaseEntity {

    private static final long serialVersionUID = 5485859518761271536L;

    @Column(name = "ROLE_NAME")
    private String roleName;

    @Column(name = "ROLE_CODE")
    private String roleCode;

    @Column(name = "ROLE_DESC")
    private String roleDesc;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}