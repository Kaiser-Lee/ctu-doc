package com.ctu.doc.sys.support.repositiory;

import com.ctu.doc.sys.support.entity.SysSupportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SysSupportRepository extends JpaRepository<SysSupportEntity, String>, JpaSpecificationExecutor<SysSupportEntity> {
}
