/**
 * Created by apple on 15/9/4.
 */
(function(a) {
    a.fn.pgwSlider = function(i) {
        var e = {
            autoSlide: true,
            adaptiveHeight: false,
            adaptiveDuration: 400,
            transitionDuration: 400,
            intervalDuration: 3000
        };
        if (this.length == 0) {
            return this
        } else {
            if (this.length > 1) {
                this.each(function() {
                    a(this).pgwSlider(i)
                });
                return this
            }
        }
        var g = this;
        g.plugin = this;
        g.data = [];
        g.config = {};
        g.currentSlide = 0;
        g.slideCount = 0;
        g.eventInterval = null;
        g.window = a(window);
        var h = function() {
            g.config = a.extend({},
                e, i);
            c();
            if (g.config.autoSlide) {
                f()
            }
            return true
        };
        var b = function(l) {
            var m = {};
            var o = l.find("a").attr("href");
            if ((typeof o != "undefined") && (o != "")) {
                m.link = o;
                var r = l.find("a").attr("target");
                if ((typeof r != "undefined") && (r != "")) {
                    m.linkTarget = r
                }
            }
            var k = l.find("img").attr("src");
            if ((typeof k != "undefined") && (k != "")) {
                m.thumbnail = k
            }
            var s = l.find("img").attr("data-large-src");
            if ((typeof s != "undefined") && (s != "")) {
                m.image = s
            }
            var p = l.find("span").text();
            if ((typeof p != "undefined") && (p != "")) {
                m.title = p
            } else {
                var n = l.find("img").attr("alt");
                if ((typeof n != "undefined") && (n != "")) {
                    m.title = n
                }
            }
            var q = l.find("img").attr("data-description");
            if ((typeof q != "undefined") && (q != "")) {
                m.description = q
            }
            return m
        };
        var d = function(k, l) {
            var m = ((k - ((g.slideCount - 1) * 6)) / g.slideCount);
            var n = (100 / g.slideCount);
            g.plugin.find("ul li").css({
                width: n + "%"
            });
            if (typeof l != "undefined" && l) {
                g.plugin.find(".ps-current").animate({
                        height: k
                    },
                    g.config.adaptiveDuration,
                    function() {
                        g.plugin.find("ul li").animate({
                                height: m
                            },
                            g.config.adaptiveDuration)
                    })
            } else {
                g.plugin.find(".ps-current").css("height", k);
                g.plugin.find("ul li").css("height", m)
            }
            return true
        };
        var c = function() {
            g.plugin.wrap('<div class="pgwSlider"></div>');
            g.plugin = g.plugin.parent();
            g.plugin.prepend('<div class="ps-current"></div>');
            g.slideCount = g.plugin.find("ul li").length;
            var k = 1;
            g.plugin.find("ul li").each(function() {
                var l = b(a(this));
                l.id = k;
                g.data.push(l);
                a(this).addClass("elt_" + l.id);
                if (l.title) {
                    if (a(this).find("span").length == 1) {
                        if (a(this).find("span").text() == "") {
                            a(this).find("span").text(l.title)
                        }
                    } else {
                        a(this).find("img").after("<span>" + l.title + "</span>")
                    }
                }
                a(this).css("cursor", "pointer").click(function(m) {
                    m.preventDefault();
                    j(l.id)
                });
                k++
            });
            if (g.config.autoSlide) {
                g.plugin.on("mouseenter",
                    function() {
                        clearInterval(g.eventInterval);
                        g.eventInterval = null
                    }).on("mouseleave",
                    function() {
                        f()
                    })
            }
            j(1);
            return true
        };
        var j = function(k, n) {
            var m = g.data[k - 1];
            var l = g.plugin.find(".ps-current");
            if (typeof m == "undefined") {
                throw new Error("PgwSlider - The element " + k + " is undefined");
                return false
            }
            g.currentSlide = k;
            if (typeof l.animate == "undefined") {
                l.animate = function(o, p, q) {
                    l.css(o);
                    if (q) {
                        q()
                    }
                }
            }
            l.animate({
                    opacity: 0
                },
                g.config.transitionDuration,
                function() {
                    g.plugin.find("ul li").css("opacity", "0.6");
                    g.plugin.find("ul li.elt_" + k).css("opacity", "1");
                    if (m.image) {
                        l.html('<img src="' + m.image + '" alt="' + (m.title ? m.title: "") + '">')
                    } else {
                        if (m.thumbnail) {
                            l.html('<img src="' + m.thumbnail + '" alt="' + (m.title ? m.title: "") + '">')
                        } else {
                            l.html("")
                        }
                    }
                    var o = "";
                    if (m.title) {
                        o += "<b>" + m.title + "</b>"
                    }
                    if (m.description) {
                        if (o != "") {
                            o += "<br>"
                        }
                        o += m.description
                    }
                    if (o != "") {
                        l.append("<span>" + o + "</span>")
                    }
                    if (m.link) {
                        var p = "";
                        if (m.linkTarget) {
                            var p = ' target="' + m.linkTarget + '"'
                        }
                        l.html('<a href="' + m.link + '"' + p + ">" + l.html() + "</a>")
                    }
                    l.find("img").on("load",
                        function() {
                            if (typeof g.plugin.find(".ps-current").attr("data-checked") == "undefined" || g.plugin.find(".ps-current").attr("data-checked") == null) {
                                var q = g.plugin.find(".ps-current img").height();
                                d(q);
                                g.plugin.find(".ps-current").attr("data-checked", "true");
                                g.window.resize(function() {
                                    var r = g.plugin.find(".ps-current img").height();
                                    d(r)
                                })
                            } else {
                                if (g.config.adaptiveHeight) {
                                    var q = g.plugin.find(".ps-current img").height();
                                    d(q, true)
                                }
                            }
                        });
                    l.animate({
                            opacity: 1
                        },
                        g.config.transitionDuration)
                });
            if (typeof n != "undefined" && g.config.autoSlide) {
                f()
            }
            return true
        };
        var f = function() {
            clearInterval(g.eventInterval);
            if (g.slideCount > 1 && g.config.autoSlide) {
                g.eventInterval = setInterval(function() {
                        if (g.currentSlide + 1 <= g.slideCount) {
                            var k = g.currentSlide + 1
                        } else {
                            var k = 1
                        }
                        j(k)
                    },
                    g.config.intervalDuration)
            }
            return true
        };
        g.startSlide = function() {
            g.config.autoSlide = true;
            f();
            return true
        };
        g.stopSlide = function() {
            g.config.autoSlide = false;
            clearInterval(g.eventInterval);
            return true
        };
        g.getCurrentSlide = function() {
            return g.currentSlide
        };
        g.getSlideCount = function() {
            return g.slideCount
        };
        g.displaySlide = function(k) {
            j(k, true);
            return true
        };
        g.nextSlide = function() {
            if (g.currentSlide + 1 <= g.slideCount) {
                var k = g.currentSlide + 1
            } else {
                var k = 1
            }
            j(k, true);
            return true
        };
        g.previousSlide = function() {
            if (g.currentSlide - 1 >= 1) {
                var k = g.currentSlide - 1
            } else {
                var k = g.slideCount
            }
            j(k, true);
            return true
        };
        g.destroy = function(k) {
            clearInterval(g.eventInterval);
            g.plugin.find("ul li").each(function() {
                a(this).unbind("click")
            });
            g.data = [];
            g.config = {};
            g.currentSlide = 0;
            g.slideCount = 0;
            g.eventInterval = null;
            g.window = null;
            if (typeof k != "undefined") {
                g.plugin.find(".ps-current").unwrap().remove();
                g.hide()
            } else {
                g.parent().remove()
            }
            return true
        };
        g.reload = function(k) {
            g.destroy(true);
            g = this;
            g.plugin = this;
            g.window = a(window);
            g.plugin.show();
            g.config = a.extend({},
                e, k);
            c();
            if (g.config.autoSlide) {
                f()
            }
            return true
        };
        h();
        return this
    }
})(window.Zepto || window.jQuery);