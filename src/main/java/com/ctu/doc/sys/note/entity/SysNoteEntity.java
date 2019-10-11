package com.ctu.doc.sys.note.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ctu.doc.common.base.BaseEntity;

/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 15:19
 * version: 1.0.0
 */
@Entity
@Table(name = "SYS_NOTE")
public class SysNoteEntity extends BaseEntity {

    private static final long serialVersionUID = -408945299973070655L;

    @Column(name = "NOTE_TITLE")
    private String noteTitle;

    @Column(name = "NOTE_CONTENT")
    private String noteContent;

    @Column(name = "NOTE_LABEL")
    private String noteLabel;

    @Column(name = "NOTE_DIR_ID")
    private String noteDirId;

    @Column(name = "IS_VISIBILITY")
    private String isVisibility;

    @Column(name = "STATUS")
    private String status;

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public String getNoteLabel() {
        return noteLabel;
    }

    public void setNoteLabel(String noteLabel) {
        this.noteLabel = noteLabel;
    }

    public String getNoteDirId() {
        return noteDirId;
    }

    public void setNoteDirId(String noteDirId) {
        this.noteDirId = noteDirId;
    }

    public String getIsVisibility() {
        return isVisibility;
    }

    public void setIsVisibility(String isVisibility) {
        this.isVisibility = isVisibility;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
