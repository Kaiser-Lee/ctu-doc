package com.ctu.doc.sys.space.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ctu.doc.common.base.BaseEntity;

/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 15:06
 * version: 1.0.0
 */
@Entity
@Table(name = "SYS_SPACE")
public class SysSpaceEntity extends BaseEntity {

    private static final long serialVersionUID = 4592046168392728455L;

    @Column(name = "SPACE_NAME")
    private String spaceName;

    @Column(name = "SPACE_DESC")
    private String spaceDesc;

    @Column(name = "SPACE_CATEGORY_ID")
    private String spaceCategoryId;

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public String getSpaceDesc() {
        return spaceDesc;
    }

    public void setSpaceDesc(String spaceDesc) {
        this.spaceDesc = spaceDesc;
    }

    public String getSpaceCategoryId() {
        return spaceCategoryId;
    }

    public void setSpaceCategoryId(String spaceCategoryId) {
        this.spaceCategoryId = spaceCategoryId;
    }
}
