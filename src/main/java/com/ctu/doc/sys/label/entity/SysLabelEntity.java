package com.ctu.doc.sys.label.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ctu.doc.common.base.BaseEntity;

/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 16:04
 * version: 1.0.0
 */
@Entity
@Table(name = "SYS_LABEL")
public class SysLabelEntity extends BaseEntity {

    private static final long serialVersionUID = -3431424487210862403L;

    @Column(name = "LABEL_NAME")
    private String labelName;

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }
}
