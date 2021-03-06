define(["jquery", "lib/blockui.min", "lib/bootstrap-maxlength", "lib/bootstrap-paginator", "lib/bootstrap-datepicker", "lib/selectize"],
    function(jquery, head) {
        $.views.converters({
            toHtml: function(htmlString) {
                if (htmlString) {
                    htmlString = htmlString.replace(new RegExp("&", "gm"), "&amp;");
                    htmlString = htmlString.replace(new RegExp("<", "gm"), "&lt;");
                    htmlString = htmlString.replace(new RegExp(">", "gm"), "&gt;");
                    htmlString = htmlString.replace(new RegExp("\x00", "gm"), "&quot;");
                    htmlString = htmlString.replace(new RegExp("'", "gm"), "&#39;");
                    htmlString = htmlString.replace(new RegExp('"', "gm"), "&#34;");
                    htmlString = htmlString.replace(new RegExp('`', "gm"), "&#96;");
                    htmlString = htmlString.replace(new RegExp("\n", "gm"), "<br/>");
                    htmlString = htmlString.replace(new RegExp(" ", "gm"), "&nbsp;");
                    return htmlString;
                } else {
                    return "";
                }
            }
        });
        var dateFormatCn = {
            days: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"],
            daysShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六", "周日"],
            daysMin: ["日", "一", "二", "三", "四", "五", "六", "日"],
            months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
            monthsShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
            today: "今日",
            format: "yyyy年mm月dd日",
            weekStart: 1
        };
        $.fn.datepicker.dates['zh-CN'] = dateFormatCn;
        var menuLoad = function(url, appId) {
            if (url != "") {
                var $mask = $("#content-liquid-full");
                mask($mask);
                $("#mainContain").html("");
                require(["text!" + url],
                    function(html) {
                        $("#mainContain").html(html);
                        require(["app/" + appId],
                            function(j) {
                                j.init();
                            });
                        converHtml();
                        unmask($mask);
                    });
            }
        };
        var getDatasStr = function(ps, key) {
            var str = "";
            ps.each(function() {
                var v = $(this).attr("data-" + key);
                str = str + v + ",";
            });
            str = str.substring(0, str.length - 1);
            return str;
        };
        var paging = function(obj, totalPage, curPage, fun, size, align, mao) {
            if (totalPage <= 1) {
                $(obj).html("");
                return;
            }
            $(obj).bootstrapPaginator({
                bootstrapMajorVersion: 3,
                currentPage: curPage,
                totalPages: totalPage,
                size: size,
                alignment: align,
                itemTexts: function(type, page, current) {
                    switch (type) {
                        case "first":
                            return "<<";
                        case "prev":
                            return "<";
                        case "next":
                            return ">";
                        case "last":
                            return ">>";
                        case "page":
                            return "" + page;
                    }
                },
                pageUrl: function(type, page, current) {
                    return "javascript:void(0)";
                },
                onPageClicked: function(e, originalEvent, type, page) {
                    fun(page);
                    if (mao) {
                        $("html,body").animate({
                                scrollTop: mao.offset().top
                            },
                            10);
                        return false;
                    }
                }
            });
        };
        var clearnext = function(obj, endAlert) {
            $(obj).unbind("click");
            $(obj).find("a").html(endAlert)
        }
        var initList = function(listGrid, data, obj, fun, curPage, totalPage, endAlert) {
            if (curPage == 1) {
                listGrid.html(data);
            } else {
                listGrid.append(data);
            }
            $(obj).hide();
            $(obj).unbind("click");
            $(obj).find("a").html("继续漫游( ^ω^ )");
            if (curPage >= totalPage) {
                $(obj).find("a").html(endAlert);
                $(obj).show();
            } else {
                $(obj).show();
                $(obj).click(function() {
                    $(obj).find("a").html("<i class='fa fa-spinner fa-spin'></i>");
                    window.setTimeout(function() {
                            fun(++curPage);
                            if (curPage++==totalPage) {
                                $(obj).find("a").html(endAlert);
                            }
                            $(obj).unbind("click");
                        },
                        500);
                })
            }
        }
        var loadingUserInfo = function() {
            var loadHtml = "<i class='fa fa-spinner fa-spin'></i>";
            $(".balanceLoading").each(function(i, obj) {
                $(obj).html(loadHtml);
                $.ajax({
                    url: "/user/balance",
                    type: "POST"
                }).done(function(data) {
                    if (data.success == true) {
                        $(obj).html(data.str);
                    } else {}
                });
            });
            $(".incomeCount").html(loadHtml);
            $(".payCount").html(loadHtml);
            $.ajax({
                url: "/transaction/get/allpayandincome",
                type: "POST"
            }).done(function(data) {
                if (data.success == true) {
                    $(".incomeCount").html(data.responseData.incomeCount);
                    $(".payCount").html(data.responseData.payCount);
                }
            });
        };
        var converHtml = function() {
            $('input[maxlength]').maxlength();
            $('textarea[maxlength]').maxlength();
            $("input[cat]").each(function() {
                var $icat = $(this);
                if ($icat.attr("data-init") != "true") {
                    if ($icat.attr("data-disable") == "true") {
                        var $icatNext = $icat.next().find("input[type='checkbox']");
                        $icatNext.click(function() {
                            if ($icatNext.is(":checked")) {
                                $icat.attr("readonly", "readonly");
                                $icat.val("");
                            } else {
                                $icat.removeAttr("readonly");
                            }
                        });
                    }
                    cat($icat);
                    $icat.attr("data-init", "true");
                }
            });
            $('[data-toggle="tooltip"]').tooltip();
            var dictCodes = [];
            var select = $("select[dict]");
            var searchDiv = $("div[search-dict]");
            var selectR = $("div[dict-r]");
            select.each(function() {
                dictCodes.push($(this).attr("dict"));
            });
            searchDiv.each(function() {
                dictCodes.push($(this).attr("search-dict"));
            });
            selectR.each(function() {
                dictCodes.push($(this).attr("dict-r"));
            });
            var tpl_dict = $("#tmpl-dict");
            if (dictCodes.length > 0) {
                $.ajax({
                    url: "/dict/types/list",
                    async: false,
                    data: {
                        dictCodes: dictCodes.join(",")
                    },
                    success: function(data) {
                        select.each(function() {
                            var load = $(this).data("load");
                            if (load != true) {
                                var d = data[$(this).attr("dict")];
                                var c = $(this).attr("dict_pc");
                                var s2 = $(this).data("s2");
                                $(this).html("<option value=''>- 请选择 -</option>");
                                if (c) {
                                    $(this).html("<option value=''>" + c + "</option>");
                                }
                                $(this).append(tpl_dict.render(d));
                                if (s2 == true) {
                                    $(this).selectize({
                                        maxItems: 6
                                    });
                                }
                                $(this).attr("data-load", true);
                            }
                        });
                        searchDiv.each(function() {
                            var load = $(this).data("load");
                            if (load != true) {
                                var d = data[$(this).attr("search-dict")];
                                $(this).append($("#temp-search-div").render(d));
                                $(this).data("load", true);
                            }
                        });
                        selectR.each(function() {
                            var load = $(this).data("load");
                            if (load != true) {
                                var d = data[$(this).attr("dict-r")];
                                var cname = $(this).attr("dict-r-name");
                                $(this).append($("#tmpl-dict-r").render(d));
                                $(this).find("input").attr("name", cname);
                                $(this).find("input").eq(0).attr("checked", "checked");
                                $(this).data("load", true);
                            }
                        });
                    }
                });
            }
            var areaSel = $("select[province]");
            if (areaSel.length > 0) {
                $.ajax({
                    url: "/area/list?code=" + 100,
                    async: false,
                    success: function(data) {
                        areaSel.each(function() {
                            var key = $(this).attr("province");
                            $(this).html("<option value=''>- 请选择 -</option>");
                            $(this).append(tpl_dict.render(data));
                            var pv = $(this).attr("v");
                            if (pv) {
                                $.ajax({
                                    url: "/area/list?code=" + pv,
                                    async: false
                                }).done(function(data) {
                                    $("select[city='" + key + "']").html(tpl_dict.render(data))
                                });
                            } else {
                                $("select[city='" + key + "']").html(tpl_dict.render({
                                    code: "",
                                    value: "- 请选择 -"
                                }))
                            }
                            $(this).change(function() {
                                $(this).attr("v", $(this).val());
                                var sv = $(this).attr("v");
                                if (sv) {
                                    $.ajax({
                                        url: "/area/list?code=" + sv,
                                        async: false
                                    }).done(function(data) {
                                        $("select[city='" + key + "']").html(tpl_dict.render(data))
                                    });
                                } else {
                                    $("select[city='" + key + "']").html(tpl_dict.render({
                                        code: "",
                                        value: "- 请选择 -"
                                    }))
                                }
                            });
                        });
                    }
                });
            }
            $("select[v]").each(function() {
                var selV = $(this).attr("v");
                if (selV.length > 0) {
                    $(this).val(selV);
                }
            });
            $("select[vs]").each(function() {
                var selV = $(this).attr("vs");
                var s = $(this);
                if (selV.length > 0) {
                    var vs = selV.split(",");
                    $(vs).each(function() {
                        $(s).find("option[value='" + this + "']").attr("selected", "selected");
                    });
                }
            });
            var checkboxs = $("div[CHECKBOXS]");
            checkboxs.each(function() {
                var boxs = $(this).find("input[type='checkbox']");
                var boxv = $(this).attr("CHECKBOXS").split(",");
                boxs.each(function() {
                    var box = $(this);
                    for (var vi = 0; vi < boxv.length; vi++) {
                        if (box.val() == boxv[vi]) {
                            box.attr("checked", "true");
                        }
                    }
                });
            });
        };
        var mask = function(el, centerY) {
            var el = $(el);
            var pro = $("#top-progress-div");
            $("#top-progress-div").css("width", "0%");
            $("#top-progress-div").attr("aria-valuenow", "0");
            $("#top-progress-div").parent().show();
            var proin = window.setInterval(function() {
                    var pwidth = $("#top-progress-div").attr("aria-valuenow");
                    $("#top-progress-div").css("width", pwidth + 1 + "%");
                    $("#top-progress-div").attr("aria-valuenow", parseInt(pwidth) + 1);
                    if (pwidth >= 90) {
                        window.clearInterval(proin);
                    }
                },
                100);
            if (el.height() <= 400) {
                centerY = true;
            }
            el.block({
                message: '<div><i class="fa fa-spinner fa-spin"></i></div>',
                centerY: centerY != undefined ? centerY: true,
                css: {
                    top: '50%',
                    border: 'none',
                    padding: '2px',
                    backgroundColor: 'none'
                },
                overlayCSS: {
                    backgroundColor: 'none',
                    opacity: 0.05,
                    cursor: 'wait'
                }
            });
        };
        var unmask = function(el, clean) {
            $("#top-progress-div").css("aria-valuenow", "100%");
            $("#top-progress-div").css("width", "100%");
            window.setTimeout(function() {
                    $(".top-progress").hide();
                },
                2000);
            $(el).unblock({
                onUnblock: function() {
                    $(el).css('position', '');
                    $(el).css('zoom', '');
                }
            });
        };
        var alertFloatMessage = function(btn, text) {
            var $i = $("<span>").text(text);
            var d = $(btn).offset();
            point = d;
            if (point.left > 880) {
                point.left = point.left - 50;
            } else {
                point.left = point.left + 50;
            }
            if (point.top < 50) {
                point.top = point.top + 10;
            } else {
                point.top = point.top - 10;
            }
            $i.css({
                'z-index': 1000,
                top: point.top + "px",
                left: point.left + "px",
                position: "absolute",
                color: '#51a351'
            });
            $("body").append($i);
            var b = point.top - 20;
            $i.show();
            $i.animate({
                    top: b + "px"
                },
                {
                    duration: 500,
                    complete: function() {
                        $i.fadeOut("slow",
                            function() {
                                $i.remove();
                            });
                    }
                });
        };
        var openMessageDiloag = function(id) {
            $("#user-message-text").val("");
            $("#user-message-id").val(id);
            $("#modal-message-user").modal();
        }
        var cat = function(obj) {
            $(obj).datepicker({
                startView: 2,
                language: "zh-CN",
                calendarWeeks: true,
                autoclose: true,
                beforeShowDay: function(date) {
                    if (date.getMonth() == (new Date()).getMonth()) switch (date.getDate()) {
                        case 4:
                            return {
                                tooltip:
                                    '天',
                                classes: 'active'
                            };
                        case 8:
                            return false;
                        case 12:
                            return "green";
                    }
                }
            });
        };
        error = function(msg, hideTime) {
            if (!hideTime) {
                hideTime = 3000;
            }
            if (!msg) {
                msg = "时间过了太久页面失效了，刷新下试试吧！";
            }
            var notyfy = $("#notyfy_container_top").notyfy({
                layout: 'top',
                type: "error",
                timeout: true,
                speed: 500,
                dismissQueue: true,
                text: "" + msg + ""
            });
            window.setTimeout(function() {
                    notyfy.close();
                },
                hideTime);
            return false;
        };
        success = function(msg, hideTime) {
            if (!hideTime) {
                hideTime = 3000;
            }
            if (!msg) {
                msg = "时间过了太久页面失效了，刷新下试试吧！";
            }
            var notyfy = $("#notyfy_container_top").notyfy({
                layout: 'top',
                type: "success",
                timeout: true,
                speed: 500,
                dismissQueue: true,
                text: "" + msg + ""
            });
            window.setTimeout(function() {
                    notyfy.close();
                },
                hideTime);
            return false;
        };
        var toHtml = function(text) {
            text = text.replace(new RegExp("\n", "gm"), "<br/>");
            text = text.replace(new RegExp(" ", "gm"), "&nbsp;");
            return text;
        }
        var tobn = function(text) {
            text = text.replace(new RegExp("&lt;br/&gt;", "gm"), "<br/>");
            text = text.replace(new RegExp("&amp;nbsp;", "gm"), "&nbsp;");
            return text;
        }
        var getTmpl = function(tmplName) {
            return "/templates/" + tmplName + ".tmpl.html";
        }
        var renderTmpl = function(tmplName, targetSelector, data) {
            var file = "/templates/" + tmplName + ".tmpl.html";
            $.get(file, null,
                function(template) {
                    var tmpl = $.templates(template);
                    var htmlString = tmpl.render(data);
                    if (targetSelector) {
                        $(targetSelector).html(htmlString);
                    }
                    return htmlString;
                });
        }
        var renderAppendTmpl = function(tmplName, targetSelector, data) {
            var file = "/templates/" + tmplName + ".tmpl.html";
            return $.get(file, null,
                function(template) {
                    var tmpl = $.templates(template);
                    var htmlString = tmpl.render(data);
                    if (targetSelector) {
                        $(targetSelector).append(htmlString);
                    }
                });
        }
        var warning = function(msg, hideTime) {
            if (!hideTime) {
                hideTime = 3000;
            }
            var notyfy = $("#notyfy_container_top").notyfy({
                layout: 'top',
                type: "warning",
                timeout: true,
                speed: 500,
                dismissQueue: true,
                text: "" + msg + ""
            });
            window.setTimeout(function() {
                    notyfy.close();
                },
                hideTime);
            return false;
        };
        var lbtn = function(btn) {
            var i = $("<i class='fa fa-spinner fa-spin'></i>");
            btn.html(i);
            btn.attr("disabled", "disabled");
        }
        var cbtn = function(btn, r) {
            btn.html(r);
            btn.removeAttr("disabled");
        }
        var buildFormData = function(data, file) {
            var formData = new FormData();
            formData.append("policy", data.policy);
            formData.append("signature", data.signature);
            formData.append("file", file[0].files[0]);
            return formData;
        };
        var imgUrl = "http://img.histarter.com";
        var fileUrl = "http://file.histarter.com";
        var uploadImg = function(obj, str, input, img, suffix, isShow) {
            obj.change(function() {
                var $span = $(this).prev();
                var $btn = $(this).parent();
                var src = $btn.next();
                if ($btn.attr("disabled") == "disabled") {
                    return;
                }
                $span.html($("#common-loading-tmpl").render({
                    data: str
                }));
                $btn.attr("disabled", "disabled");
                var flist = $(this).val().split('\\');
                var length = flist.length;
                var fname = flist[length - 1];
                $.ajax({
                    url: "/attachment/getYunPicInfo;jsessionid='" + $("#sessionUID").val(),
                    type: "POST",
                    data: {
                        fileName: fname
                    }
                }).done(function(data) {
                    if (data.success == true) {
                        $.ajax({
                            url: data.responseData.postUrl,
                            type: 'POST',
                            data: buildFormData(data.responseData, $(obj)),
                            processData: false,
                            contentType: false
                        }).done(function(restr) {
                            $(obj).val("");
                            restr = $.parseJSON(restr);
                            $span.html(str);
                            $btn.attr("disabled", false);
                            if (restr.code == 200) {
                                input.val(imgUrl + restr.url);
                                img.attr("src", imgUrl + restr.url + suffix);
                                if (isShow) {
                                    img.show();
                                };
                            }
                        }).fail(function() {
                            error("请选择正确的图片文件,并且最大为5M！");
                            $span.html(str);
                            $btn.attr("disabled", false);
                        });
                    } else {
                        $span.html(str);
                        $btn.attr("disabled", false);
                    }
                }).fail(function() {
                    $span.html(str);
                    $btn.attr("disabled", false);
                });
            });
        }
        var imgpup = function(str) {
            $(str).magnificPopup({
                delegate: 'img',
                type: 'image',
                tLoading: '正在加载 #%curr%...',
                mainClass: 'mfp-img-mobile',
                gallery: {
                    enabled: true,
                    navigateByImgClick: true,
                    preload: [0, 1]
                },
                image: {
                    tError: '<a href="%url%"> #%curr%</a> 无法加载可能已删除.'
                }
            });
        }
        return {
            tobn: tobn,
            getTmpl: getTmpl,
            toHtml: toHtml,
            renderTmpl: renderTmpl,
            alertFloatMessage: alertFloatMessage,
            dateFormatCn: dateFormatCn,
            cat: cat,
            imgpup: imgpup,
            buildFormData: buildFormData,
            menuLoad: menuLoad,
            converHtml: converHtml,
            uploadImg: uploadImg,
            openMessageDiloag: openMessageDiloag,
            getDatasStr: getDatasStr,
            mask: function(el, centerY) {
                var el = $(el);
                if (el.height() <= 400) {
                    centerY = true;
                }
                el.block({
                    message: '<div><img src="/res/img/loading.gif"></div>',
                    centerY: centerY != undefined ? centerY: true,
                    css: {
                        top: '50%',
                        border: 'none',
                        padding: '2px',
                        backgroundColor: 'none'
                    },
                    overlayCSS: {
                        backgroundColor: '#000',
                        opacity: 0.05,
                        cursor: 'wait'
                    }
                });
            },
            clearnext: clearnext,
            imgUrl: imgUrl,
            initList: initList,
            fileUrl: fileUrl,
            mask: mask,
            renderAppendTmpl: renderAppendTmpl,
            unmask: unmask,
            error: error,
            goTop: function() {
                $("html,body").animate({
                        scrollTop: 0
                    },
                    100);
            },
            success: success,
            lbtn: lbtn,
            cbtn: cbtn,
            generateFormData: function(obj) {
                return $(obj).serialize();
            },
            paging: paging,
            loadingUserInfo: loadingUserInfo
        };
    });