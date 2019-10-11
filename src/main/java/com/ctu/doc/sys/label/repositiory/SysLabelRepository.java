package com.ctu.doc.sys.label.repositiory;

import com.ctu.doc.sys.label.entity.SysLabelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SysLabelRepository extends JpaRepository<SysLabelEntity, String>, JpaSpecificationExecutor<SysLabelEntity> {
}
