package com.ctu.doc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ctu.doc.common.controller.BaseController;

/**
 * 云图文档中心管理系统启动类
 * User: lufangbu
 * Date: 2019/10/10
 * Time: 11:53
 * version: 1.0.0
 */
@SpringBootApplication
public class DocApplication{

    public static void main(String[] args){
        SpringApplication.run(DocApplication.class, args);
        System.out.println("启动成功");
    }

}
