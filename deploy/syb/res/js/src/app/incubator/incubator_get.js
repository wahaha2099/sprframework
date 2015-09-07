define(["app","app/home","app/valid","lib/bootstrap-tags","app/incubator/incubator_get_overview","app/incubator/incubator_get_follow","app/incubator/incubator_get_comment"],function(app,home,v){var id=$("#pId").val();app.controller("incubator_get",['$scope','$location',function($scope,$location){var routes={'/overview':{templateurl:'/app/incubator/incubator_overview/'
+ id},'/follow':{templateurl:'/p/incubator/incubator_get_follow'},'/comment':{templateurl:'/p/incubator/incubator_get_comment'}}
var defaultRoute=routes['/overview'];$scope.$watch(function(){return $location.path();},function(newPath){$scope.selectedRouteName=newPath||"/overview";$scope.selectedRoute=routes[newPath]||defaultRoute;});}]);var initJobs=function(){$.ajax({url:"/jobs/list/company/"+ id,type:"POST"}).done(function(data){if(data.success==true&&data.responseData.records>0){$(".job-list").html($("#temp-job-item").render(data.responseData.rows));$(".job-list").find(".btn-job-del").click(function(){if(confirm("确定要删除吗?删除后不可恢复!")){var delJobId$=$(this).data("id");var $b=$(this);var c=$b.html();home.lbtn($b);$.ajax({url:"/jobs/del/"
+ delJobId$,type:"POST",data:{}}).done(function(data){if(data.success==true){home.success(data.message);initJobs();}else{home.error("删除失败");}
home.cbtn($b,c);});}});}else{$(".job-list").html("暂无职位信息")}});}
var initFollow=function(){$.ajax({url:"/company/follow/list/"+ id,type:"POST"}).done(function(data){if(data.success==true&&data.responseData.records>0){$(".f-u-list").html($("#temp-f-u-item").render(data.responseData.rows));$(".data-popover-f-u").popover({html:true,trigger:"hover",content:function(){var uid=$(this).data("id");return $(this).find("div").eq(0).html();}});}else{$(".f-u-list").html("暂无关注");}});};return{init:function(){id=$("#pId").val();if(!id){return;}
$.ajax({url:"/app/incubator/comment/list/"+ id,type:"POST"}).done(function(data){if(data.success==true&&data.responseData.records>0){$(".hot-comment").html($("#temp-comment-item").render(data.responseData.rows));}else{$(".hot-comment").html("暂无留言");}});$(".btn-post-message").click(function(){var $this=$(this);home.openMessageDiloag($this.data("id"));return false;});initJobs();initFollow();$(".social-wechat").hover(function(){$(this).find(".social-fa-wechat").popover({html:true,placement:"bottom",content:function(){return"<img src='"
+ $(this).parent().data("img")+"'/>";}}).popover("show");},function(){$(this).find(".social-fa-wechat").popover({html:true,placement:"bottom",content:function(){return"<img src='"
+ $(this).parent().data("img")+"'/>";}}).popover("hide");});$(".btn-publish").click(function(){if(confirm("确定要发布吗?")){var $btn=$(this);var c=$btn.html();home.lbtn($btn);$.ajax({url:"/company/publish/"+ id,type:"POST"}).done(function(data){if(data.success==true){location.href=location.href;}else{}
home.cbtn($btn,c);});}});$(".follow-btn").click(function(){var $btn=$(this);var c=$btn.html();home.lbtn($btn);$.ajax({url:"/company/follow/"+ id,type:"POST"}).done(function(data){if(data.success==true){home.alertFloatMessage($btn,data.message);home.cbtn($btn,c);if(data.str=="del"){$btn.html("<i class='fa fa-heart-o'></i> 关注");}
if(data.str=="add"){$btn.html("<i class='fa fa-heart'></i> 已关注");}}else{home.cbtn($btn,c);}});});$(".btn-edit-word").click(function(){var p$1=$(this).parent().parent();p$1.find(".preview").hide();p$1.find(".edit").show();$(this).next().show();$(this).hide();});$(".btn-update-word").click(function(){var p$1=$(this).parent().parent().parent();var $btn=$(this);var c=$btn.html();home.lbtn($btn);$.ajax({url:"/company/update/"+ id,type:"POST",data:{word:$("#ta-word").val()}}).done(function(data){if(data.success==true){$btn.parent().hide();$(".btn-edit-word").show();p$1.find(".preview").show();p$1.find(".edit").hide();$(".intro-word").html('"'
+ data.responseData.wordView+'"');}
home.cbtn($btn,c);});});$(".btn-cancel-word").click(function(){var p$1=$(this).parent().parent().parent();$(".btn-edit-word").show();$(this).parent().hide();p$1.find(".preview").show();p$1.find(".edit").hide();});$(".btn-edit-company").click(function(){var $btn=$(this);var c=$btn.html();home.lbtn($btn);$.ajax({url:"/app/incubator/get/"+ id,type:"POST"}).done(function(data){if(data.success==true){$("#company-edit-project-form").html($("#temp-edit-company-project").render(data.responseData));if($(".product-item").size()>=2){$(".add_project").hide();}
$("#modal-edit-company-download").modal();home.converHtml();}else{}
home.cbtn($btn,c);});});$(".btn-scid").click(function(){var $mask=$($("#modal-edit-company-project"));if(v.doValidForm($("#company-edit-project-form"))){var $btn=$(this);var c=$btn.html();home.lbtn($btn);home.mask($mask);$.ajax({url:"/app/incubator/update/project/"+ id,type:"POST",data:home.generateFormData($("#company-edit-project-form"))}).done(function(data){if(data.success==true){home.success(data.message);location.href="/"
+ data.responseData.domain;}else{home.error(data.message);}
home.unmask($mask);home.cbtn($btn,c);});}});$(".btn-edit-company-info").click(function(){var $btn=$(this);var c=$btn.html();home.lbtn($btn);$.ajax({url:"/company/get/info/"+ id,type:"POST"}).done(function(data){if(data.success==true){$("#company-edit-info-form").html($("#temp-edit-company-info").render(data.responseData));home.converHtml();var v=window.setInterval(function(){var $s=$('select[name="industry"]');$s.selectize({maxItems:6});if($s.data("load")=="true"){window.clearInterval(v);}},100);var $tag=$("#productTagsInput").tagsinput();home.uploadImg($("#logo"),"上传文件",$("input[name='logo']"),$(".company_logo"),"_fixhw40");home.uploadImg($("#wechat2code"),"上传二维码",$("input[name='wechat2code']"),$(".wechat2code_img"),"_fixhw40","true");var areaSel=$(".area-sel").selectize({valueField:'code',labelField:'value',searchField:'value',options:data.responseData.citysView,create:false,render:{option:function(item,escape){return'<div>'
+'<span class="title">'
+'<span class="name"><i class="icon '
+(item.value?'fork':'source')
+'"></i>'
+ escape(item.value)
+'</span>'+'</div>';}},load:function(query,callback){if(!query.length)
return callback();$.ajax({url:'/area/search/'
+ encodeURIComponent(query),type:'post',error:function(){callback();},success:function(res){callback(res.slice(0,10));}});},onChange:function(code){}});$("#modal-edit-company-info").modal();}else{}
home.cbtn($btn,c);});});$(".btn-sci").click(function(){var $mask=$($("#modal-edit-company-info"));if(v.doValidForm($("#company-edit-info-form"))){var $btn=$(this);var c=$btn.html();home.lbtn($btn);home.mask($mask);$.ajax({url:"/app/incubator/update/"+ id,type:"POST",data:home.generateFormData($("#company-edit-info-form"))}).done(function(data){if(data.success==true){home.success(data.message);location.href="/"
+ data.responseData.domain;}else{home.error(data.message);}
home.unmask($mask);home.cbtn($btn,c);});}});$(".to-all-comment").click(function(){home.goTop();});$.ajax({url:"/company/count/follow/"+ id,type:"POST"}).done(function(data){if(data.success==true&&data.str>0){$(".followCount").html("("+ data.str
+")");}else{}});$.ajax({url:"/company/count/comment/"+ id,type:"POST"}).done(function(data){if(data.success==true&&data.str>0){$(".commentCount").html("("+ data.str
+")");}else{}});var isRating=$("#company-rating").attr("data-isRating");$('#company-rating').rating();if(isRating=="true"){$('#company-rating').rating('refresh',{readonly:true});}
$('#company-rating').rating('update',$('#company-rating').attr("data-v"));if(isRating=="false"){$('#company-rating').on('rating.change',function(event,value,caption){$.ajax({url:"/company/rating/toCompany/"+ id,type:"POST",data:{score:value}}).done(function(data){if(data.success){home.success(data.message);}else{home.error(data.message);}
$('#company-rating').rating('refresh',{readonly:true});});});}}};});