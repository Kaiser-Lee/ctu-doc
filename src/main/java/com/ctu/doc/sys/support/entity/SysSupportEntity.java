package com.ctu.doc.sys.support.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ctu.doc.common.base.BaseEntity;

/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 16:18
 * version: 1.0.0
 */
@Entity
@Table(name = "SYS_SUPPORT")
public class SysSupportEntity extends BaseEntity {

    private static final long serialVersionUID = 2581619128328120909L;

    @Column(name = "SUPPORT_USER_ID")
    private String supportUserId;

    @Column(name = "SUPPORT_NOTE_ID")
    private String supportNoteId;


    public String getSupportUserId() {
        return supportUserId;
    }

    public void setSupportUserId(String supportUserId) {
        this.supportUserId = supportUserId;
    }

    public String getSupportNoteId() {
        return supportNoteId;
    }

    public void setSupportNoteId(String supportNoteId) {
        this.supportNoteId = supportNoteId;
    }
}
