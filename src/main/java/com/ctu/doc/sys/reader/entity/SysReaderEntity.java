package com.ctu.doc.sys.reader.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ctu.doc.common.base.BaseEntity;


/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 16:11
 * version: 1.0.0
 */
@Entity
@Table(name = "SYS_READER")
public class SysReaderEntity extends BaseEntity {

    private static final long serialVersionUID = -9153157971875393079L;

    @Column(name = "READER_USER_ID")
    private String readerUserId;

    @Column(name = "READ_NOTE_ID")
    private String readNoteId;

    public String getReaderUserId() {
        return readerUserId;
    }

    public void setReaderUserId(String readerUserId) {
        this.readerUserId = readerUserId;
    }

    public String getReadNoteId() {
        return readNoteId;
    }

    public void setReadNoteId(String readNoteId) {
        this.readNoteId = readNoteId;
    }
}
