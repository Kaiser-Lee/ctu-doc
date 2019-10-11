package com.ctu.doc.sys.version.repositiory;

import com.ctu.doc.sys.version.entity.SysVersionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SysVersionRepository extends JpaRepository<SysVersionEntity, String>, JpaSpecificationExecutor<SysVersionEntity> {
}
