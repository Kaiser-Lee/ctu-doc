package com.ctu.doc.sys.directory.repositiory;

import com.ctu.doc.sys.directory.entity.SysDirectoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SysDirectoryRepository extends JpaRepository<SysDirectoryEntity, String>, JpaSpecificationExecutor<SysDirectoryEntity> {
}
