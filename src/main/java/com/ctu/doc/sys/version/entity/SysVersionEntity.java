package com.ctu.doc.sys.version.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ctu.doc.common.base.BaseEntity;

/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 16:25
 * version: 1.0.0
 */
@Entity
@Table(name = "SYS_VERSION")
public class SysVersionEntity extends BaseEntity {

    private static final long serialVersionUID = 3586957692796457005L;

    @Column(name = "VERSION_NAME")
    private String versionNum;

    @Column(name = "NOTE_ID")
    private String noteId;

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
}
