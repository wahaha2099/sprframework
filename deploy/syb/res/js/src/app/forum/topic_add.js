define(["app/home","app/valid","lib/jquery.fileupload","lib/bootstrap-tags"],function(home,v){return{init:function(){$(".navbar-toggle").click(function(){$(".navbar-title").show();$(".navbar-to-hide").toggle(500);$(".pull-right").hide();});$(".img-circle").click(function(){$(".pull-right").show();$(".navbar-to-hide").toggle(500);$(".navbar-title").hide();});if(typeof Markdown!='undefined'&&$('#wmd-input').length){var converter1=new Markdown.Converter();var editor1=new Markdown.Editor(converter1,$('.wmd-panel'),$('#wmd-preview'));editor1.run();}
$(".doReplyBtn").click(function(){if(v.doValidForm($("#createTopicForm"))){var $b=$(this);var c=$b.html();home.lbtn($b);$.ajax({url:"/forum/topic/add",type:"POST",data:{stype:$("select[name='stype']").val(),title:$("input[name='title']").val(),topicContent:new Markdown.Converter().makeHtml($("#wmd-input").val())}}).done(function(data){if(data.success==true){home.success(data.message);location.href="/forum/topic/get/"
+ data.str;}else{home.error(data.message);}
home.cbtn($b,c);});}});}};});