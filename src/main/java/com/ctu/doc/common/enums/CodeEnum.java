package com.ctu.doc.common.enums;

public enum CodeEnum {
	ERROR_PASSWORD("1003", "密码错误！")
	,
	ERROR_USER_NOT("1002", "用户不存在！")
	,
	NULL_USERNAME_OR_PWD("1001", "用户名或密码为空！")
	,
	ERROR("1008", "操作失败！")
	,
	SUCCESS("9999", "操作成功!");
	
	private String code;
	
	private String displayName;
	
	private CodeEnum(String code, String displayName) {
		this.code = code;
		this.displayName = displayName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
}