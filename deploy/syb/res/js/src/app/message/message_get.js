define(["app/home","app/valid"],function(home,v){var id=$("#message-list").data("id");var loading=function(num){home.mask(".form-page")
$.ajax({url:"/message/list/"+ id,type:"POST",data:{rows:40,page:num}}).done(function(data){if(data.success==true&&data.responseData.records>0){$("#message-list").html($("#temp-message").render(data.responseData.rows));home.paging($(".message-pager"),data.responseData.total,data.responseData.page,loading,"small","middle",$("body"));}
home.unmask(".form-page");});};return{init:function(){id=$("#message-list").data("id");loading(1);$(".btn-send").click(function(){if(v.doValidForm($(".box-message-form"))){var $b=$(this);var c=$b.html();home.lbtn($b);$.ajax({url:"/message/sendToUser",type:"POST",data:{userId:id,content:$(".msg-content").val()}}).done(function(data){if(data.success==true){home.success(data.message);$(".msg-content").val("");loading();}else{home.error(data.message);}
home.cbtn($b,c);});}});}};});