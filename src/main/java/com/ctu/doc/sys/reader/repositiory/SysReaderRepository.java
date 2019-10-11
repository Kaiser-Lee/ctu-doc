package com.ctu.doc.sys.reader.repositiory;

import com.ctu.doc.sys.reader.entity.SysReaderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SysReaderRepository extends JpaRepository<SysReaderEntity, String>, JpaSpecificationExecutor<SysReaderEntity> {
}
