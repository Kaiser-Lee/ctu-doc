package com.ctu.doc.sys.file.repositiory;

import com.ctu.doc.sys.file.entity.SysFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SysFileRepository extends JpaRepository<SysFileEntity, String>, JpaSpecificationExecutor<SysFileEntity> {
}
