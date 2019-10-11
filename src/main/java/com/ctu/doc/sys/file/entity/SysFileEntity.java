package com.ctu.doc.sys.file.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ctu.doc.common.base.BaseEntity;

/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 15:56
 * version: 1.0.0
 */
@Entity
@Table(name = "SYS_FILE")
public class SysFileEntity extends BaseEntity {

    private static final long serialVersionUID = -5435624625522948520L;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "FILE_PATH")
    private String filePath;

    @Column(name = "FILE_DIR_ID")
    private String fileDirId;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileDirId() {
        return fileDirId;
    }

    public void setFileDirId(String fileDirId) {
        this.fileDirId = fileDirId;
    }
}
