package com.ctu.doc.sys.directory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ctu.doc.common.base.BaseEntity;

/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 15:14
 * version: 1.0.0
 */
@Entity
@Table(name = "SYS_DIRECTORY")
public class SysDirectoryEntity extends BaseEntity {

    private static final long serialVersionUID = -537392271004375024L;

    @Column(name = "DIRECTORY_NAME")
    private String directoryName;

    @Column(name = "DIRECTORY_PID")
    private String directoryPId;

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getDirectoryPId() {
        return directoryPId;
    }

    public void setDirectoryPId(String directoryPId) {
        this.directoryPId = directoryPId;
    }

}
