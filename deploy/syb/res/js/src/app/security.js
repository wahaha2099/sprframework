define(["app/header","app/home","app/valid"],function(header,home,v){require(["app/header"],function(h){header=h;});var initCheck=function(){if(ISLOGIN=="false"){$(".btn-action").unbind();$(".btn-action").children().unbind();$(".btn-action").each(function(){$(this).attr("href","javascript:void(0)")
$(this).click(function(){console.log(header);header.oepnModalLoginOrReg();});});};if(ISCOMPANY=="false"){$(".btn-action-c").unbind();$(".btn-action-c").children().unbind();$(".btn-action-c").each(function(){$(this).attr("data-href",$(this).data("href"));$(this).attr("href","javascript:void(0)");$(this).click(function(){home.error("您需要创建团队才可进行此操作～");})});}
if(ISACTIVE=="false"){$(".btn-action").unbind();$(".btn-action").children().unbind();$(".btn-action").each(function(){$(this).attr("data-href",$(this).data("href"));$(this).attr("href","javascript:void(0)");$(this).click(function(){home.error("激活账号才能继续漫游哦～");})});var userName=$("#nav-username").html();var notyfy=$("#notyfy_container_top").notyfy({layout:'top',type:"warning",closeWith:"",timeout:true,speed:500,dismissQueue:true,text:"亲爱的"
+ userName
+"，请前往 "
+ $("#header-email").html()
+" 激活您的账号 <button class='btn btn-xs btn-danger' id='changeActiveEmail' style='margin-top:-3px;'>修改邮箱</button> "
+"。未收到激活邮件请戳 <button class='btn btn-xs btn-success' id='sendActiveEmail' style='margin-top:-3px;'>重新发送</button> 或瞅下<strong>垃圾箱</strong>哟~ "});$("#changeActiveEmail").click(function(){var $btn=$(this);var c=$btn.html();home.lbtn($btn);$.get(home.getTmpl("/people/_people_change_email"),null,function(tmpl){if($("#modal-change-email").length==0){$("body").append(tmpl);var $form=$("#modal-change-email").find(".form-horizontal");var $btn_s=$("#modal-change-email").find(".btn-success");$btn_s.click(function(){if(v.doValidForm($form)){var $btn_s_c=$btn_s.html();home.lbtn($btn_s);$.ajax({url:"/user/change/email",type:"POST",data:home.generateFormData($form)}).done(function(data){if(data.success==true){home.success(data.message);location.reload();}else{home.error(data.message);}
home.cbtn($btn_s,$btn_s_c);});}});home.cbtn($btn,c);}
$("#modal-change-email").modal("show");});});$("#sendActiveEmail").click(function(){var $btn=$(this);var c=$btn.html();home.lbtn($btn);$.ajax({url:ctxRoot+"/user/active/email",type:"POST"}).done(function(data){if(data.success==true){$("#sendActiveEmail").attr("disabled",true);var timeOut=60;if(data.str&&data.str>0){timeOut=data.str;}
var time$=window.setInterval(function(){$btn.html("请等待"+--timeOut+"秒后方可重新发送");if(timeOut==0){window.clearInterval(time$);$("#sendActiveEmail").attr("disabled",false);$("#sendActiveEmail").html("重新发送");}},1000)
home.success(data.message);}else{home.error(data.message);home.cbtn($btn,c);}})});};};return{init:function(){},initCheck:initCheck};});