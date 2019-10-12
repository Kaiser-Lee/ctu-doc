$().ready(function() {
    //$("#user-form").validate()；
	validateRule();
});


function save() {
	$.ajax({
		cache : true,
		type : "POST",
		url : "/sys/user/userRegister",
		data : $('#user-form').serialize(),// 你的formid
		async : false,
		error : function(request) {
			parent.layer.alert("Connection error");
		},
		success : function(data) {
			if (data.code == "9999") {
				console.log("操作成功！");
			} else {
				
			}

		}
	});
}

//初始化input状态样式图标
var icon = {
    valid: 'glyphicon glyphicon-ok',
    invalid: 'glyphicon glyphicon-remove',
    validating: 'glyphicon glyphicon-refresh'
};
function validateRule() {
	//初始化验证规则
	$("#user-form").bootstrapValidator({
	    feedbackIcons: icon,   //加载图标
	    /* 生效规则
	     * enabled:字段值发生变化就触发验证
	     * disabled/submitted:点击提交时触发验证
	     */
	    live: 'disabled', 
	    //表单域配置
	    fields: {
	        userName: {//username为input标签name值
	            validators: {
	                notEmpty: {message: '请输入用户名'},    //非空提示
	                stringLength: {    //长度限制
	                      min: 5,
	                      max: 30,
	                      message: '用户名长度必须在6到30之间'
	                }, 
	                regexp: {//匹配规则
	                      regexp: /^[a-zA-Z0-9_\\u4e00-\\u9fa5]+$/,  //正则表达式
	                      message:'用户名仅支持汉字、字母、数字、下划线的组合'
	                },
	                remote: { //ajax校验，获得一个json数据（{'valid': true or false}）
	                      url: '/sys/user/validatorUserName',                  //验证地址
	                      message: '用户已存在',   //提示信息
	                      type: 'GET',                   //请求方式
	                      data: function(validator){  //自定义提交数据，默认为当前input name值
	                        return {
	                            userName: $("input[name='userName']").val()
	                        }
	                    }
	                }
	            }
	        },
	        password: {
	            validators: {
	               notEmpty: {message: '请输入密码'},
	               different: {  //比较
	                    field: 'username', //需要进行比较的input name值
	                    message: '密码不能与用户名相同'
	               }
	            }
	        },
	        confirm_password: {
	            validators: {
	                notEmpty: {message: '请再次输入密码'},
	                identical: {  //比较是否相同
	                       field: 'password',  //需要进行比较的input name值
	                       message: '两次密码不一致'
	                }
	            }
	        },
	        tell: {
	            message: 'The phone is not valid',
	            validators: {
	                notEmpty: {
	                    message: '手机号码不能为空'
	                },
	                stringLength: {
	                    min: 11,
	                    max: 11,
	                    message: '请输入11位手机号码'
	                },
	                regexp: {
	                    regexp: /^1[3|5|8]{1}[0-9]{9}$/,
	                    message: '请输入正确的手机号码'
	                }
	            }
	        }
	       /* email: {
	            validators: {
	                notEmpty: {message: '请输入邮箱'},
	                emailAddress: {message: '请输入正确的邮件地址'}
	            }
	        } */  //最后一个没有逗号
	    }
	})
}

$("#registerBtn").click(function () {//非submit按钮点击后进行验证，如果是submit则无需此句直接验证
    $("#user-form").bootstrapValidator('validate');//提交验证
    if ($("#user-form").data('bootstrapValidator').isValid()) {//获取验证结果，如果成功，执行下面代码
        save();//验证成功后的操作，如ajax
    }
});
	
	
