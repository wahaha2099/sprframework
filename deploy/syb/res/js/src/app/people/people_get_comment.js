define(["app"],function(app){app.controller("people_get_comment",['$scope','$http','commonService','$location','peopleService',function($scope,$http,commonService,$location,peopleService){var num=1;$scope.commentList=[];var getCommentlist=function(){peopleService.getPeopleCommentList($scope.userId,num).success(function(data){if(data.success==true&&data.responseData.records>0){$scope.commentList=$scope.commentList.concat(data.responseData.rows);$scope.show=data.responseData.hasNextPage;num++;}})}
$scope.getCommentListByNum=function(){getCommentlist();};getCommentlist();$scope.openCommentC=function(comment,edit){if(!edit.comment){peopleService.getPeopleCommentCList(comment.id).success(function(data){comment.commentc=data.responseData.rows;edit.comment=true;});}
else{edit.comment=false;}}
$scope.addComment=function(){peopleService.addPeopleComment($scope.userId,$scope.content).success(function(data){if(data.success==true){$scope.content="";getCommentlist()}})}
$scope.addCommentC=function(comment,edit){peopleService.addPeopleCommentC(comment.id,edit.content).success(function(data){if(data.success==true){edit.content="";peopleService.getPeopleCommentCList(comment.id).success(function(data){comment.commentc=data.responseData.rows;});}})}
$scope.addCommentUp=function(comment){peopleService.addPeopleCommentUp(comment.id).success(function(data){if(data.success==true){if(comment.isUp==0){comment.isUp=1;comment.upCount=comment.upCount+ 1;}else{comment.isUp=0;comment.upCount=comment.upCount- 1;}}})}
$scope.addCommentCUp=function(c){peopleService.addPeopleCommentUp(c.id).success(function(data){if(data.success==true){if(c.isUp==0){c.isUp=1;c.upCount=c.upCount+ 1;}else{c.isUp=0;c.upCount=c.upCount- 1;}}});}}])});