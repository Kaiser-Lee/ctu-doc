package com.ctu.doc.sys.space.repositiory;

import com.ctu.doc.sys.space.entity.SysSpaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created with Intellil IDEA
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 15:40
 * version: 1.0.0
 */
public interface SysSpaceReposity extends JpaRepository<SysSpaceEntity, String> , JpaSpecificationExecutor<SysSpaceEntity> {


}
