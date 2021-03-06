define(["app/home", "app/valid", "lib/bootstrap-tags"],
    function(home, valid) {
        return {
            init: function() {
                var $tag = $(".tagsinput").tagsinput();
                var it = $(".input-touchspin");
                var itinput = it.find("input");
                var v = window.setInterval(function() {
                        var $s = $('select[name="userType"]');
                        $s.selectize({
                            maxItems: 5
                        });
                        if ($s.data("load") == "true") {
                            window.clearInterval(v);
                        }
                    },
                    100);
                it.find(".leftbtn").click(function() {
                    var v = parseInt(itinput.data("value"));
                    if (v > 0) {
                        itinput.val(v - 1);
                        itinput.data("value", v - 1);
                    }
                });
                it.find(".rightbtn").click(function() {
                    var v = parseInt(itinput.data("value"));
                    if (v < 10) {
                        itinput.val(v + 1);
                        itinput.data("value", v + 1);
                    } else if (v == 10) {
                        itinput.val("10年以上");
                        itinput.data("value", 11);
                    } else {
                        itinput.val("1");
                        itinput.data("value", 1);
                    }
                });
                home.uploadImg($("#avatar"), "上传头像", $("#avatar-input"), $("#img-avatar"), "_fixhw100");
                home.converHtml();
                $(".btn-next").click(function() {
                    if (valid.doValidForm($(".wizard-content-1"))) {
                        if (!$("input[name='avatar']").val() && false) {
                            home.error("请上传头像");
                            return false;
                        };
                        if (!$("select[name='userType']").val()) {
                            home.error("请选择漫游目的");
                            home.goTop();
                            return false;
                        };
                        home.goTop();
                        $(".wizard-content-1").hide();
                        $(".wizard-content-2").show(310);
                        $(".wizard-content-3").hide();
                        $(".wizard-2").addClass("active");
                        $(".wizard-1").removeClass("active");
                    }
                });
                $(".btn-back").click(function() {
                    home.goTop();
                    $(".wizard-content-1").show(310);
                    $(".wizard-content-2").hide();
                    $(".wizard-1").addClass("active");
                    $(".wizard-2").removeClass("active");
                });
                $(".btn-back2").click(function() {
                    home.goTop();
                    $(".wizard-content-3").show(310);
                    $(".wizard-content-2").hide();
                    $(".wizard-3").addClass("active");
                    $(".wizard-2").removeClass("active");
                });
                $(".btn-back3").click(function() {
                    home.goTop();
                    $(".wizard-content-3").hide();
                    $(".wizard-content-2").show(310);
                    $(".wizard-2").addClass("active");
                    $(".wizard-3").removeClass("active");
                });
                $(".btn-next2").click(function() {
                    if (!$("input[name='skilltags']").val()) {
                        home.error("请输入我的标签");
                        return false;
                    }
                    if (valid.doValidForm($("#createPeopleForm"))) {
                        var $b = $(this);
                        var c = $b.html();
                        home.lbtn($b);
                        $("#workYearInput").val($("#workYearInput").data("value"));
                        $.ajax({
                            url: path + "/people/updateInfo?isPerFect=" + 1,
                            type: "POST",
                            data: home.generateFormData("#createPeopleForm")
                        }).done(function(data) {
                            if (data.success == true) {
                                home.goTop();
                                $(".wizard-content-1").hide();
                                $(".wizard-content-3").show(310);
                                $(".wizard-content-2").hide();
                                $(".wizard-3").addClass("active");
                                $(".wizard-2").removeClass("active");
                                var $t = 10;
                                var time$ = window.setInterval(function() {
                                        $(".btn-next3").html("跳过(" + --$t + ")");
                                        if ($t == 0) {
                                            $(".btn-next3").show();
                                            $(".btn-next3").html("跳过");
                                            $(".btn-next3").attr("disabled", false);
                                            window.clearInterval(time$);
                                        }
                                    },
                                    1000)
                            } else {
                                home.error(data.message);
                            }
                            home.cbtn($b, c);
                        });
                    }
                });
                $(".btn-next3").click(function() {
                    home.goTop();
                    $(".wizard-content-3").hide();
                    $(".wizard-content-4").show(310);
                    $(".wizard-4").addClass("active");
                    $(".wizard-3").removeClass("active");
                });
                $(".get-tel-note").click(function() {
                    if (valid.doValidForm($(".wizard-content-3"))) {
                        var $b = $(this);
                        var c = $b.html();
                        home.lbtn($b);
                        $.ajax({
                            url: path + "/note/bind/user",
                            type: "POST",
                            data: home.generateFormData("#createPeopleForm")
                        }).done(function(data) {
                            if (data.success == true) {
                                home.success(data.message);
                                var $t = 60;
                                $(".do-change-tel").show();
                                var time$ = window.setInterval(function() {
                                        $(".get-tel-note").html("请等待:" + --$t + "秒后再次发送");
                                        if ($t == 1) {
                                            window.clearInterval(time$);
                                            home.cbtn($b, c);
                                        }
                                    },
                                    1000)
                            } else {
                                home.error(data.message);
                                home.cbtn($b, c);
                            }
                        });
                    } else {}
                });
                $(".do-change-tel").click(function() {
                    var $b = $(this);
                    var c = $b.html();
                    home.lbtn($b);
                    $.ajax({
                        url: path + "/people/update/tel",
                        type: "POST",
                        data: home.generateFormData("#createPeopleForm")
                    }).done(function(data) {
                        if (data.success == true) {
                            home.success("操作成功！");
                            home.goTop();
                            $(".wizard-content-3").hide();
                            $(".wizard-content-4").show(310);
                            $(".wizard-4").addClass("active");
                            $(".wizard-3").removeClass("active");
                        } else {
                            home.error(data.message);
                        }
                        home.cbtn($b, c);
                    });
                });
            }
        };
    });