package com.ctu.doc.common.vo;

import java.io.Serializable;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.ctu.doc.common.enums.CodeEnum;

/**
 * $.ajax后返回的JSON
 *
 * @author lufangpu
 * @date 2019-10-11
 */
public class MsgJson implements Serializable {

    private boolean success = true;// 是否成功
    private String code = "9999";// 表示成功
    private String message = "操作成功";// 提示信息
    private Object obj = null;// 其他信息
    private Map<String, Object> attributes;// 其他参数

	public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
    public MsgJson setAjResult(String msg,String code,boolean success,Object obj) {
    	
		this.message = msg;
		this.code = code;
		this.success = success;
		this.obj = obj;
		return this;
    }
    public String getJsonStr() {
        JSONObject obj = new JSONObject();
        obj.put("code", this.getCode());
        obj.put("msg", this.getMessage());
        obj.put("obj", this.obj);
        obj.put("attributes", this.attributes);
        return obj.toJSONString();
    }
    
    public MsgJson error() {
    	this.message = CodeEnum.ERROR.getCode();
		this.code = CodeEnum.ERROR.getCode();
		this.success = false;
    	return this;
    }
    
    public MsgJson error(String msg) {
    	this.message = msg;
		this.code = CodeEnum.ERROR.getCode();
		this.success = false;
    	return this;
    }
}

