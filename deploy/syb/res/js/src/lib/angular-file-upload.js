!function(){function a(a,b){window.XMLHttpRequest.prototype[a]=b(window.XMLHttpRequest.prototype[a])}
function b(a,b,c,d,g,h){function j(){return"input"===b[0].tagName.toLowerCase()&&b.attr("type")&&"file"===b.attr("type").toLowerCase()}
function k(b){if(!p){p=!0;try{var j=b.__files_||b.target&&b.target.files,k=[],l=[],m=g(c.ngAccept);for(i=0;i<j.length;i++){var n=j.item(i);f(a,m,n,b)?k.push(n):l.push(n)}
e(g,h,a,d,c,c.ngFileChange||c.ngFileSelect,k,l,b),0==k.length&&(b.target.value=k),b.target&&b.target.getAttribute("__ngf_gen__")&&angular.element(b.target).remove()}finally{p=!1}}}
function l(b){c.ngMultiple&&b.attr("multiple",g(c.ngMultiple)(a)),c.accept&&b.attr("accept",c.accept),c.ngCapture&&b.attr("capture",g(c.ngCapture)(a)),c.ngDisabled&&b.attr("disabled",g(c.ngDisabled)(a)),b.bind("change",k)}
function m(){if(!b.attr("disabled")){for(var a=angular.element('<input type="file">'),c=0;c<b[0].attributes.length;c++){var d=b[0].attributes[c];a.attr(d.name,d.value)}
return j()?(b.replaceWith(a),b=a):(a.css("width","0px").css("height","0px").css("position","absolute").css("padding",0).css("margin",0).css("overflow","hidden").attr("tabindex","-1").css("opacity",0).attr("__ngf_gen__",!0),b.__ngf_ref_elem__&&b.__ngf_ref_elem__.remove(),b.__ngf_ref_elem__=a,b.parent()[0].insertBefore(a[0],b[0]),b.css("overflow","hidden")),l(a),a}}
function n(b){e(g,h,a,d,c,c.ngFileChange||c.ngFileSelect,[],[],b,!0)}
function o(a){var c=m(a);c&&(n(a),c[0].click()),j()&&(b.bind("click",o),a.preventDefault())}
var p=!1;window.FileAPI&&window.FileAPI.ngfFixIE?window.FileAPI.ngfFixIE(b,m,k,n):b.bind("click",o)}
function c(a,b,c,g,h,j,k){function l(a,b,c){var d=!0,e=c.dataTransfer.items;if(null!=e)
for(i=0;i<e.length&&d;i++)
d=d&&("file"==e[i].kind||""==e[i].kind)&&f(a,s,e[i],c);var g=h(b.dragOverClass)(a,{$event:c});return g&&(g.delay&&(r=g.delay),g.accept&&(g=d?g.accept:g.reject)),g||b.dragOverClass||"dragover"}
function m(b,c,d,e){function g(c){f(a,s,c,b)?l.push(c):m.push(c)}
function h(a,b,c){if(null!=b)
if(b.isDirectory){var d=(c||"")+ b.name;g({name:b.name,type:"directory",path:d});var e=b.createReader(),f=[];o++;var j=function(){e.readEntries(function(d){try{if(d.length)
f=f.concat(Array.prototype.slice.call(d||[],0)),j();else{for(i=0;i<f.length;i++)
h(a,f[i],(c?c:"")
+ b.name
+"/");o--}}catch(e){o--,console.error(e)}},function(){o--})};j()}else
o++,b.file(function(a){try{o--,a.path=(c?c:"")+ a.name,g(a)}catch(b){o--,console.error(b)}},function(){o--})}
var l=[],m=[],n=b.dataTransfer.items,o=0;if(n&&n.length>0&&"file"!=k.protocol())
for(i=0;i<n.length;i++){if(n[i].webkitGetAsEntry&&n[i].webkitGetAsEntry()&&n[i].webkitGetAsEntry().isDirectory){var p=n[i].webkitGetAsEntry();if(p.isDirectory&&!d)
continue;null!=p&&h(l,p)}else{var q=n[i].getAsFile();null!=q&&g(q)}
if(!e&&l.length>0)
break}
else{var r=b.dataTransfer.files;if(null!=r)
for(i=0;i<r.length&&(g(r.item(i)),e||!(l.length>0));i++);}
var t=0;!function u(a){j(function(){if(o)
10*t++<2e4&&u(10);else{if(!e&&l.length>1){for(i=0;"directory"==l[i].type;)
i++;l=[l[i]]}
c(l,m)}},a||0)}()}
var n=d();if(c.dropAvailable&&j(function(){a.dropAvailable?a.dropAvailable.value=n:a.dropAvailable=n}),!n)
return 1==h(c.hideOnDropNotAvailable)(a)&&b.css("display","none"),void 0;var o,p=null,q=h(c.stopPropagation),r=1,s=h(c.ngAccept),t=h(c.ngDisabled);b[0].addEventListener("dragover",function(d){if(!t(a)){if(d.preventDefault(),q(a)&&d.stopPropagation(),navigator.userAgent.indexOf("Chrome")>-1){var e=d.dataTransfer.effectAllowed;d.dataTransfer.dropEffect="move"===e||"linkMove"===e?"move":"copy"}
j.cancel(p),a.actualDragOverClass||(o=l(a,c,d)),b.addClass(o)}},!1),b[0].addEventListener("dragenter",function(b){t(a)||(b.preventDefault(),q(a)&&b.stopPropagation())},!1),b[0].addEventListener("dragleave",function(){t(a)||(p=j(function(){b.removeClass(o),o=null},r||1))},!1),b[0].addEventListener("drop",function(d){t(a)||(d.preventDefault(),q(a)&&d.stopPropagation(),b.removeClass(o),o=null,m(d,function(b,f){e(h,j,a,g,c,c.ngFileChange||c.ngFileDrop,b,f,d)},0!=h(c.allowDir)(a),c.multiple||h(c.ngMultiple)(a)))},!1)}
function d(){var a=document.createElement("div");return"draggable"in a&&"ondrop"in a}
function e(a,b,c,d,e,f,g,h,i,j){function k(){d&&(a(e.ngModel).assign(c,g),b(function(){d&&d.$setViewValue(null!=g&&0==g.length?null:g)})),e.ngModelRejected&&a(e.ngModelRejected).assign(c,h),f&&a(f)(c,{$files:g,$rejectedFiles:h,$event:i})}
j?k():b(function(){k()})}
function f(a,b,c,d){var e=b(a,{$file:c,$event:d});if(null==e)
return!0;if(angular.isString(e)){var f=new RegExp(g(e),"gi");e=null!=c.type&&c.type.match(f)||null!=c.name&&c.name.match(f)}
return e}
function g(a){if(a.length>2&&"/"===a[0]&&"/"===a[a.length- 1])
return a.substring(1,a.length- 1);var b=a.split(","),c="";if(b.length>1)
for(i=0;i<b.length;i++)
c+="("+ g(b[i])+")",i<b.length- 1&&(c+="|");else
0==a.indexOf(".")&&(a="*"+ a),c="^"
+ a.replace(new RegExp("[.\\\\+*?\\[\\^\\]$(){}=!<>|:\\-]","g"),"\\$&")+"$",c=c.replace(/\\\*/g,".*").replace(/\\\?/g,".");return c}
var h,i;window.XMLHttpRequest&&!window.XMLHttpRequest.__isFileAPIShim&&a("setRequestHeader",function(a){return function(b,c){if("__setXHR_"===b){var d=c(this);d instanceof Function&&d(this)}else
a.apply(this,arguments)}});var j=angular.module("angularFileUpload",[]);j.version="3.2.4",j.service("$upload",["$http","$q","$timeout",function(a,b,c){function d(d){d.method=d.method||"POST",d.headers=d.headers||{},d.transformRequest=d.transformRequest||function(b,c){return window.ArrayBuffer&&b instanceof window.ArrayBuffer?b:a.defaults.transformRequest[0](b,c)};var e=b.defer(),f=e.promise;return d.headers.__setXHR_=function(){return function(a){a&&(d.__XHR=a,d.xhrFn&&d.xhrFn(a),a.upload.addEventListener("progress",function(a){a.config=d,e.notify?e.notify(a):f.progress_fn&&c(function(){f.progress_fn(a)})},!1),a.upload.addEventListener("load",function(a){a.lengthComputable&&(a.config=d,e.notify?e.notify(a):f.progress_fn&&c(function(){f.progress_fn(a)}))},!1))}},a(d).then(function(a){e.resolve(a)},function(a){e.reject(a)},function(a){e.notify(a)}),f.success=function(a){return f.then(function(b){a(b.data,b.status,b.headers,d)}),f},f.error=function(a){return f.then(null,function(b){a(b.data,b.status,b.headers,d)}),f},f.progress=function(a){return f.progress_fn=a,f.then(null,null,function(b){a(b)}),f},f.abort=function(){return d.__XHR&&c(function(){d.__XHR.abort()}),f},f.xhr=function(a){return d.xhrFn=function(b){return function(){b&&b.apply(f,arguments),a.apply(f,arguments)}}(d.xhrFn),f},f}
this.upload=function(a){return a.headers=a.headers||{},a.headers["Content-Type"]=void 0,a.transformRequest=a.transformRequest?"[object Array]"===Object.prototype.toString.call(a.transformRequest)?a.transformRequest:[a.transformRequest]:[],a.transformRequest.push(function(b){var c=new FormData,d={};for(h in a.fields)
a.fields.hasOwnProperty(h)&&(d[h]=a.fields[h]);if(b&&(d.data=b),a.formDataAppender)
for(h in d)
d.hasOwnProperty(h)&&a.formDataAppender(c,h,d[h]);else
for(h in d)
if(d.hasOwnProperty(h)){var e=d[h];void 0!==e&&("[object String]"===Object.prototype.toString.call(e)?c.append(h,e):a.sendObjectsAsJsonBlob&&"object"==typeof e?c.append(h,new Blob([e],{type:"application/json"})):c.append(h,JSON.stringify(e)))}
if(null!=a.file){var f=a.fileFormDataName||"file";if("[object Array]"===Object.prototype.toString.call(a.file)){var g="[object String]"===Object.prototype.toString.call(f);for(i=0;i<a.file.length;i++)
c.append(g?f:f[i],a.file[i],a.fileName&&a.fileName[i]||a.file[i].name)}else
c.append(f,a.file,a.fileName||a.file.name)}
return c}),d(a)},this.http=function(a){return d(a)}}]),j.directive("ngFileSelect",["$parse","$timeout","$compile",function(a,c,d){return{restrict:"AEC",require:"?ngModel",link:function(e,f,g,h){b(e,f,g,h,a,c,d)}}}]),j.directive("ngFileDrop",["$parse","$timeout","$location",function(a,b,d){return{restrict:"AEC",require:"?ngModel",link:function(e,f,g,h){c(e,f,g,h,a,b,d)}}}]),j.directive("ngNoFileDrop",function(){return function(a,b){d()&&b.css("display","none")}}),j.directive("ngFileDropAvailable",["$parse","$timeout",function(a,b){return function(c,e,f){if(d()){var g=a(f.ngFileDropAvailable);b(function(){g(c)})}}}]);var k=angular.module("ngFileUpload",[]);for(h in j)
j.hasOwnProperty(h)&&(k[h]=j[h])}();