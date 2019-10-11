package com.ctu.doc.sys.note.repositiory;

import com.ctu.doc.sys.note.entity.SysNoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SysNoteRepository extends JpaRepository<SysNoteEntity, String>, JpaSpecificationExecutor<SysNoteEntity> {



}
