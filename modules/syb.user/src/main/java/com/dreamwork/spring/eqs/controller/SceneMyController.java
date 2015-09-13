package com.dreamwork.spring.eqs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by apple on 15/9/13.
 */
@Controller
public class SceneMyController {

    @ResponseBody
    @RequestMapping(value="/m/scene/my" , produces = "application/json;charset=UTF-8")
    public String sceneMy(){
        /**
         pageNo:1
         pageSize:12
         time:1442136604309
         */
        return "{\"success\":true,\"code\":200,\"msg\":\"操作成功\",\"obj\":null,\"map\":{\"count\":2,\"pageNo\":1,\"pageSize\":12},\"list\":[{\"id\":10155513,\"name\":\"云码CMS一\",\"createUser\":\"ff8080814e957955014ea3d41dc34d84\",\"createTime\":1437268904000,\"type\":102,\"pageMode\":2,\"image\":{\"imgSrc\":\"group2/M00/2E/AB/yq0KEVV-O8SAcLWUAABKIbYfFBw044.png\"},\"isTpl\":0,\"isPromotion\":0,\"status\":1,\"openLimit\":0,\"startDate\":null,\"endDate\":null,\"accessCode\":null,\"updateTime\":1437270171000,\"publishTime\":null,\"applyTemplate\":0,\"applyPromotion\":0,\"sourceId\":10124191,\"code\":\"9qdIni29\",\"description\":\"最资深的微信第三方开发商，最了解客户需求的微电商系统提供商\",\"sort\":0,\"bgAudio\":\"{\\\"url\\\":\\\"http://chenyun.b0.upaiyun.com/mp3/20150425/076ab8bccb7a8f674cbabc41588c4307.mp3\\\",\\\"type\\\":\\\"1\\\"}\",\"cover\":\"group2/M00/2E/AB/yq0KEVV-O8SAcLWUAABKIbYfFBw044.png\",\"property\":\"{\\\"triggerLoop\\\":true}\",\"bizType\":0,\"loadingLogo\":null,\"price\":null,\"pageCount\":0,\"dataCount\":0,\"showCount\":0,\"userLoginName\":null,\"userName\":null,\"promIds\":null,\"isShow\":null,\"tagId\":null,\"tplStatus\":null,\"delTime\":null},{\"id\":10154845,\"name\":\"易企秀使用手册\",\"createUser\":\"ff8080814e957955014ea3d41dc34d84\",\"createTime\":1437267664000,\"type\":101,\"pageMode\":1,\"image\":{\"imgSrc\":\"group1/M00/D7/A9/yq0KA1SSwtuANy0oAAAnqVulopQ252.jpg\"},\"isTpl\":0,\"isPromotion\":0,\"status\":1,\"openLimit\":0,\"startDate\":null,\"endDate\":null,\"accessCode\":null,\"updateTime\":1437267664000,\"publishTime\":null,\"applyTemplate\":0,\"applyPromotion\":0,\"sourceId\":10261,\"code\":\"2Nz3uRnk\",\"description\":\"易企秀使用手册\",\"sort\":0,\"bgAudio\":null,\"cover\":\"group1/M00/D7/A9/yq0KA1SSwtuANy0oAAAnqVulopQ252.jpg\",\"property\":\"{}\",\"bizType\":0,\"loadingLogo\":null,\"price\":null,\"pageCount\":0,\"dataCount\":0,\"showCount\":0,\"userLoginName\":null,\"userName\":null,\"promIds\":null,\"isShow\":null,\"tagId\":null,\"tplStatus\":null,\"delTime\":null}]}";
    }

    @ResponseBody
    @RequestMapping(value="/m/scene/stat/sum", produces = "application/json;charset=UTF-8")
    public String sceneState(){
        return "{\"success\":true,\"code\":200,\"msg\":\"操作成功\",\"obj\":{\"dt\":0,\"open\":2,\"pv\":0},\"map\":null,\"list\":null}";
    }

    @ResponseBody
    @RequestMapping(value="/m/c/stat/sum", produces = "application/json;charset=UTF-8")
    public String statSum(){
        return "{\"success\":true,\"code\":200,\"msg\":\"操作成功\",\"obj\":{\"count\":1,\"unImp\":0},\"map\":null,\"list\":null}";
    }

    @ResponseBody
    @RequestMapping(value="/m/scene/detail/{sid}", produces = "application/json;charset=UTF-8")
    public String sceneDetail(Long sid ){
        return "{\"success\":true,\"code\":200,\"msg\":\"操作成功\",\"obj\":{\"id\":10155513,\"name\":\"云码CMS一\",\"createUser\":\"ff8080814e957955014ea3d41dc34d84\",\"createTime\":1437268904000,\"type\":102,\"pageMode\":2,\"image\":{\"imgSrc\":\"group2/M00/2E/AB/yq0KEVV-O8SAcLWUAABKIbYfFBw044.png\"},\"isTpl\":0,\"isPromotion\":0,\"status\":1,\"openLimit\":0,\"startDate\":null,\"endDate\":null,\"accessCode\":null,\"updateTime\":1437270171000,\"publishTime\":null,\"applyTemplate\":0,\"applyPromotion\":0,\"sourceId\":10124191,\"code\":\"9qdIni29\",\"description\":\"最资深的微信第三方开发商，最了解客户需求的微电商系统提供商\",\"sort\":0,\"bgAudio\":\"{\\\"url\\\":\\\"http://chenyun.b0.upaiyun.com/mp3/20150425/076ab8bccb7a8f674cbabc41588c4307.mp3\\\",\\\"type\\\":\\\"1\\\"}\",\"cover\":\"group2/M00/2E/AB/yq0KEVV-O8SAcLWUAABKIbYfFBw044.png\",\"property\":\"{\\\"triggerLoop\\\":true}\",\"bizType\":0,\"loadingLogo\":null,\"price\":null,\"pageCount\":0,\"dataCount\":0,\"showCount\":0,\"userLoginName\":null,\"userName\":null,\"promIds\":null,\"isShow\":0,\"tagId\":null,\"tplStatus\":null,\"delTime\":null},\"map\":null,\"list\":null}";
    }

    @ResponseBody
    @RequestMapping(value="/m/scene/tag/sys/list", produces = "application/json;charset=UTF-8")
    public String tagSysList(){
        return "{\"success\":true,\"code\":200,\"msg\":\"操作成功\",\"obj\":null,\"map\":null,\"list\":[{\"id\":1,\"name\":\"图文\",\"bizType\":1101,\"type\":1,\"lang\":null},{\"id\":2,\"name\":\"图集\",\"bizType\":1101,\"type\":1,\"lang\":null},{\"id\":4,\"name\":\"文字\",\"bizType\":1101,\"type\":1,\"lang\":null},{\"id\":5,\"name\":\"图表\",\"bizType\":1101,\"type\":1,\"lang\":null}]}";
    }


    @ResponseBody
    @RequestMapping(value="/m/scene/pageList/{sid}", produces = "application/json;charset=UTF-8")
    public String scenePageList(Long sid ){
        return "{\"success\":true,\"code\":200,\"msg\":\"操作成功\",\"obj\":null,\"map\":null,\"list\":[{\"id\":149213007,\"sceneId\":10155513,\"num\":1,\"name\":null,\"properties\":null,\"elements\":null,\"scene\":null},{\"id\":149213008,\"sceneId\":10155513,\"num\":2,\"name\":null,\"properties\":null,\"elements\":null,\"scene\":null},{\"id\":149213009,\"sceneId\":10155513,\"num\":3,\"name\":null,\"properties\":null,\"elements\":null,\"scene\":null},{\"id\":149213010,\"sceneId\":10155513,\"num\":4,\"name\":null,\"properties\":null,\"elements\":null,\"scene\":null},{\"id\":149213011,\"sceneId\":10155513,\"num\":5,\"name\":null,\"properties\":null,\"elements\":null,\"scene\":null},{\"id\":149213012,\"sceneId\":10155513,\"num\":6,\"name\":null,\"properties\":null,\"elements\":null,\"scene\":null},{\"id\":149213013,\"sceneId\":10155513,\"num\":7,\"name\":null,\"properties\":null,\"elements\":null,\"scene\":null}]}";
    }

    @ResponseBody
    @RequestMapping(value="/m/scene/tpl/page/list/", produces = "application/json;charset=UTF-8")
    public String sceneTplPageList(){
        return "{\"success\":true,\"code\":200,\"msg\":\"操作成功\",\"obj\":null,\"map\":null,\"list\":[{\"id\":201996765,\"sceneId\":1102,\"num\":1,\"name\":\"中秋快乐\",\"properties\":{\"thumbSrc\":\"group2/M00/0F/C7/yq0KXlXmYsGASeBnAADWZtdym2M322.png\"},\"elements\":null,\"scene\":null},{\"id\":192057529,\"sceneId\":1201,\"num\":3,\"name\":\"反法西斯\",\"properties\":{\"effect\":{\"name\":\"fireWorks\"},\"thumbSrc\":\"group3/M00/21/FE/yq0KZVXcLJeARfsVAAPeZ-4-XZg447.png\"},\"elements\":null,\"scene\":null},{\"id\":177016398,\"sceneId\":1201,\"num\":6,\"name\":\"祈福天津\",\"properties\":{\"thumbSrc\":\"group3/M00/1A/94/yq0KZFXMjEyAOUZ-AAEbVfwHFUY805.png\"},\"elements\":null,\"scene\":null},{\"id\":135777652,\"sceneId\":1201,\"num\":9,\"name\":\"微名片\",\"properties\":{\"thumbSrc\":\"group3/M00/95/4A/yq0KZFXEFgqAHAKDAACzVKVAxYc430.png\"},\"elements\":null,\"scene\":null},{\"id\":135773367,\"sceneId\":1201,\"num\":10,\"name\":\"图形II\",\"properties\":{\"thumbSrc\":\"group3/M00/95/36/yq0KZVXEFYOANiTuAAIRzm4FdrY350.png\"},\"elements\":null,\"scene\":null},{\"id\":130484588,\"sceneId\":1201,\"num\":11,\"name\":\"图形\",\"properties\":{\"thumbSrc\":\"group2/M00/B6/76/yq0KEVWXPd6AB5fFAACZkD-OUS8669.png\"},\"elements\":null,\"scene\":null},{\"id\":126012593,\"sceneId\":1201,\"num\":17,\"name\":\"大峡谷\",\"properties\":{\"thumbSrc\":\"group2/M00/A1/D2/yq0KEVWMzFGAJALPAAD_24kwTWQ096.png\"},\"elements\":null,\"scene\":null},{\"id\":126004666,\"sceneId\":1201,\"num\":18,\"name\":\"小甜蜜\",\"properties\":{\"thumbSrc\":\"group2/M00/A0/08/yq0KEVWMw4qAfOFeAADoou96x7Q593.png\"},\"elements\":null,\"scene\":null},{\"id\":125144387,\"sceneId\":1103,\"num\":1,\"name\":\"支付宝\",\"properties\":{\"thumbSrc\":\"group2/M00/81/45/yq0KEVWLloiAEMmjAAC8NbkIPsk826.png\"},\"elements\":null,\"scene\":null},{\"id\":119703006,\"sceneId\":1103,\"num\":6,\"name\":\"好声音1\",\"properties\":{\"thumbSrc\":\"group2/M00/C9/77/yq0KEVWDfgyADGxHAAFKOo0PvUk485.png\"},\"elements\":null,\"scene\":null},{\"id\":118909989,\"sceneId\":1103,\"num\":7,\"name\":\"你和我\",\"properties\":{\"thumbSrc\":\"group2/M00/AC/6F/yq0KEVWCbdyAaw_qAAQcRTLTqIc850.png\"},\"elements\":null,\"scene\":null},{\"id\":117786553,\"sceneId\":1103,\"num\":12,\"name\":\"雨滴\",\"properties\":{\"thumbSrc\":\"group2/M00/86/28/yq0KEVWBJ66AcohYAAK3Z68taMk264.png\"},\"elements\":null,\"scene\":null},{\"id\":116469535,\"sceneId\":1103,\"num\":20,\"name\":\"那些花儿2\",\"properties\":{\"thumbSrc\":\"group2/M00/57/E4/yq0KEVV_ui-AeBdBAAJb3Za-qK8651.png\"},\"elements\":null,\"scene\":null},{\"id\":116468792,\"sceneId\":1103,\"num\":21,\"name\":\"那些花儿1\",\"properties\":{\"thumbSrc\":\"group2/M00/57/C3/yq0KEVV_uZGAW3eJAABvXEzf89g099.png\"},\"elements\":null,\"scene\":null},{\"id\":115215185,\"sceneId\":1103,\"num\":23,\"name\":\"trip2\",\"properties\":{\"thumbSrc\":\"group2/M00/30/5F/yq0KEVV-RbyAUzxoAAMWcDaRWOw527.png\"},\"elements\":null,\"scene\":null},{\"id\":115208165,\"sceneId\":1103,\"num\":22,\"name\":\"trip\",\"properties\":{\"thumbSrc\":\"group2/M00/30/5B/yq0KEVV-RaCAYONsAANQHLPTDEA350.png\"},\"elements\":null,\"scene\":null},{\"id\":115134247,\"sceneId\":1103,\"num\":27,\"name\":\"flyme2\",\"properties\":{\"thumbSrc\":\"group2/M00/2D/FF/yq0KEVV-N0CAf5vPAAJJPpLA8WI352.png\"},\"elements\":null,\"scene\":null},{\"id\":115119337,\"sceneId\":1103,\"num\":26,\"name\":\"flyme\",\"properties\":{\"thumbSrc\":\"group2/M00/2D/5C/yq0KEVV-Mp6AY_1gAAL5R6ssV_E987.png\"},\"elements\":null,\"scene\":null},{\"id\":113798630,\"sceneId\":1103,\"num\":33,\"name\":\"私人定制2\",\"properties\":{\"thumbSrc\":\"group2/M00/FF/56/yq0KEVV7mUyAWZ66AAB80JL5qqo027.png\"},\"elements\":null,\"scene\":null},{\"id\":113791367,\"sceneId\":1103,\"num\":32,\"name\":\"私人定制\",\"properties\":{\"thumbSrc\":\"group2/M00/FF/43/yq0KEVV7mNqARlHyAAB7577QY70740.png\"},\"elements\":null,\"scene\":null},{\"id\":112861612,\"sceneId\":1103,\"num\":34,\"name\":\"预定指南\",\"properties\":{\"thumbSrc\":\"group2/M00/E0/15/yq0KEVV6WVGALFrQAAEkZZT3a4g523.png\"},\"elements\":null,\"scene\":null},{\"id\":112846252,\"sceneId\":1103,\"num\":35,\"name\":\"イカ娘\",\"properties\":{\"thumbSrc\":\"group2/M00/DF/8A/yq0KEVV6Vl6AT2_jAAGhTNJG5Yg713.png\"},\"elements\":null,\"scene\":null},{\"id\":112830353,\"sceneId\":1103,\"num\":36,\"name\":\"盛夏\",\"properties\":{\"thumbSrc\":\"group2/M00/DF/1F/yq0KEVV6VHaASVTwAAQ06gjZrbk194.png\"},\"elements\":null,\"scene\":null},{\"id\":112743357,\"sceneId\":1103,\"num\":39,\"name\":\"出行\",\"properties\":{\"thumbSrc\":\"group2/M00/DC/0D/yq0KEVV6RlWABwu4AAO8IwgM2Es694.png\"},\"elements\":null,\"scene\":null},{\"id\":111775513,\"sceneId\":1103,\"num\":40,\"name\":\"毕业\",\"properties\":{\"thumbSrc\":\"group2/M00/B8/C2/yq0KEVV4__CARMdJAAVXjXUl6gY351.png\"},\"elements\":null,\"scene\":null},{\"id\":111730353,\"sceneId\":1103,\"num\":41,\"name\":\"旅行日记\",\"properties\":{\"thumbSrc\":\"group2/M00/B8/68/yq0KEVV4_l-AKqIHAABdAp373qM173.png\"},\"elements\":null,\"scene\":null},{\"id\":111699542,\"sceneId\":1103,\"num\":42,\"name\":\"夏江南\",\"properties\":{\"thumbSrc\":\"group2/M00/B6/4E/yq0KEVV49N6AaUZRAAFKeCkDCQc638.png\"},\"elements\":null,\"scene\":null},{\"id\":110537332,\"sceneId\":1103,\"num\":45,\"name\":\"锄禾\",\"properties\":{\"thumbSrc\":\"group2/M00/9B/8D/yq0KEVV33zeAFXKjAANOnrqvk-Q196.png\"},\"elements\":null,\"scene\":null},{\"id\":110499671,\"sceneId\":1103,\"num\":47,\"name\":\"关注3种\",\"properties\":{\"thumbSrc\":\"group2/M00/99/F8/yq0KEVV32MSAJgZtAARF39TWheE615.png\"},\"elements\":null,\"scene\":null},{\"id\":110487972,\"sceneId\":1102,\"num\":3,\"name\":\"图文2\",\"properties\":{\"thumbSrc\":\"group2/M00/99/38/yq0KEVV31QyAFV53AAB_C-xd6Tw856.png\"},\"elements\":null,\"scene\":null},{\"id\":110468544,\"sceneId\":1102,\"num\":2,\"name\":\"图文\",\"properties\":{\"thumbSrc\":\"group2/M00/99/22/yq0KEVV31JqAN51DAACLQdVfyoU514.png\"},\"elements\":null,\"scene\":null},{\"id\":109085034,\"sceneId\":1103,\"num\":48,\"name\":\"夏威夷\",\"properties\":{\"thumbSrc\":\"group2/M00/6A/D0/yq0KEVV2TQqAJnRTAARycVNLOrc222.png\"},\"elements\":null,\"scene\":null},{\"id\":108621267,\"sceneId\":1103,\"num\":56,\"name\":\"电脑\",\"properties\":{\"thumbSrc\":\"group2/M00/5E/F5/yq0KEVV1gP-AUKvpAABShjYi91o856.png\"},\"elements\":null,\"scene\":null},{\"id\":107914014,\"sceneId\":1103,\"num\":57,\"name\":\"sun\",\"properties\":{\"thumbSrc\":\"group2/M00/5E/71/yq0KEVV1fKqAb07RAADJxNOfqNQ015.png\"},\"elements\":null,\"scene\":null},{\"id\":103837687,\"sceneId\":1103,\"num\":58,\"name\":\"关注易企秀\",\"properties\":{\"thumbSrc\":\"group2/M00/CF/15/yq0KEVVvsCOAQ7wBAABrURVPsJ0324.png\"},\"elements\":null,\"scene\":null},{\"id\":101522912,\"sceneId\":1103,\"num\":62,\"name\":\"播放器\",\"properties\":{\"thumbSrc\":\"group2/M00/73/98/yq0KEVVr7uuAJvuaAAQGeOwekB0488.png\"},\"elements\":null,\"scene\":null},{\"id\":96262882,\"sceneId\":1103,\"num\":65,\"name\":\"音乐\",\"properties\":{\"thumbSrc\":\"group2/M00/73/C2/yq0KEVVr8D-AVHrxAAK7_ijBvrE555.png\"},\"elements\":null,\"scene\":null},{\"id\":96064461,\"sceneId\":1103,\"num\":67,\"name\":\"幼稚\",\"properties\":{\"thumbSrc\":\"group2/M00/C0/0E/yq0KEVVj1YuALvrjAAS-24KqsHU581.png\"},\"elements\":null,\"scene\":null},{\"id\":94154947,\"sceneId\":1103,\"num\":72,\"name\":\"校车\",\"properties\":{\"thumbSrc\":\"group2/M00/82/88/yq0KEVVgHZCAAaBhAACOO3Moruo602.png\"},\"elements\":null,\"scene\":null},{\"id\":94145944,\"sceneId\":1103,\"num\":73,\"name\":\"邪灵\",\"properties\":{\"thumbSrc\":\"group2/M00/81/F0/yq0KEVVgGDOAbsMTAABpRE9TlVg940.png\"},\"elements\":null,\"scene\":null},{\"id\":94129199,\"sceneId\":1103,\"num\":74,\"name\":\"救生圈\",\"properties\":{\"thumbSrc\":\"group2/M00/81/5C/yq0KEVVgEYCAOc5BAADJEScBxE8699.png\"},\"elements\":null,\"scene\":null},{\"id\":93494049,\"sceneId\":1103,\"num\":76,\"name\":\"color\",\"properties\":{\"thumbSrc\":\"group2/M00/6B/DF/yq0KEVVe2CWAQaz8AAHgZBsdkPM572.png\"},\"elements\":null,\"scene\":null},{\"id\":93456906,\"sceneId\":1103,\"num\":77,\"name\":\"时装\",\"properties\":{\"thumbSrc\":\"group2/M00/6A/51/yq0KEVVe0IGAMtrhAALIuyexGOE903.png\"},\"elements\":null,\"scene\":null},{\"id\":92868347,\"sceneId\":1103,\"num\":68,\"name\":\"跑车\",\"properties\":{\"thumbSrc\":\"group2/M00/57/11/yq0KEVVdwT-AWBM_AAFk-i2yxK4984.png\"},\"elements\":null,\"scene\":null},{\"id\":92371605,\"sceneId\":1103,\"num\":79,\"name\":\"关注\",\"properties\":{\"thumbSrc\":\"group2/M00/46/3D/yq0KEVVdVu6AUq4cAABFAJ8ZuaM942.png\"},\"elements\":null,\"scene\":null},{\"id\":91805032,\"sceneId\":1103,\"num\":87,\"name\":\"我们的歌\",\"properties\":{\"thumbSrc\":\"group2/M00/38/51/yq0KEVVcaSGAekDQAASVlfQ-qNY380.png\"},\"elements\":null,\"scene\":null},{\"id\":90659140,\"sceneId\":1103,\"num\":86,\"name\":\"waterh\",\"properties\":{\"thumbSrc\":\"group2/M00/14/44/yq0KEVVbCsWAfmdRAABJPprSyTU585.png\"},\"elements\":null,\"scene\":null},{\"id\":86917988,\"sceneId\":1103,\"num\":84,\"name\":\"夕阳的坂道\",\"properties\":{\"thumbSrc\":\"group2/M00/A2/B6/yq0KEVVVUmuAUnTcAASQON3TeHc940.png\"},\"elements\":null,\"scene\":null},{\"id\":83303223,\"sceneId\":1103,\"num\":83,\"name\":\"日记页\",\"properties\":{\"thumbSrc\":\"group2/M00/33/18/yq0KEVVQR_iAVhOfAAF9e3xHA_w532.png\"},\"elements\":null,\"scene\":null},{\"id\":83122760,\"sceneId\":1103,\"num\":81,\"name\":\"热门歌手\",\"properties\":{\"thumbSrc\":\"group2/M00/2E/B7/yq0KEVVQH2SAb1wKAACv5qlQduk761.png\"},\"elements\":null,\"scene\":null},{\"id\":55963515,\"sceneId\":1102,\"num\":18,\"name\":\"contact\",\"properties\":{\"thumbSrc\":\"group1/M00/7A/26/yq0KA1UmYGuAcaDnAAIVT9knwQg378.png\"},\"elements\":null,\"scene\":null},{\"id\":49279736,\"sceneId\":1102,\"num\":16,\"name\":\"KNEEY\",\"properties\":{\"thumbSrc\":\"group1/M00/E3/AB/yq0KA1UbXomAQc6RAAJ96spqz3s657.png\"},\"elements\":null,\"scene\":null},{\"id\":43829024,\"sceneId\":1103,\"num\":80,\"name\":\"百度音乐\",\"properties\":{\"thumbSrc\":\"group2/M00/2D/AE/yq0KEVVQGNOAcNXkAADs8at3Sp0903.png\"},\"elements\":null,\"scene\":null},{\"id\":42497644,\"sceneId\":1102,\"num\":149,\"name\":\"蕾芙丽\",\"properties\":{\"thumbSrc\":\"group1/M00/5A/8C/yq0KA1UQPfiAd-TlAAMB1iR5FDE230.png\"},\"elements\":null,\"scene\":null},{\"id\":38805212,\"sceneId\":1102,\"num\":146,\"name\":\"电影风格\",\"properties\":{\"thumbSrc\":\"group1/M00/28/2C/yq0KA1ULfEyADzLhAARjRPZGqhc000.png\"},\"elements\":null,\"scene\":null},{\"id\":35659996,\"sceneId\":1102,\"num\":141,\"name\":\"MAP\",\"properties\":{\"thumbSrc\":\"group1/M00/F0/79/yq0KA1UGnDuARdyhAACGoZKznXc745.png\"},\"elements\":null,\"scene\":null},{\"id\":34270093,\"sceneId\":1102,\"num\":137,\"name\":\"比尔盖茨\",\"properties\":{\"thumbSrc\":\"group1/M00/D6/51/yq0KA1UDpdqAD0WHAAIRFKjDqpk858.png\"},\"elements\":null,\"scene\":null},{\"id\":33637805,\"sceneId\":1102,\"num\":136,\"name\":\"doge名片\",\"properties\":{\"thumbSrc\":\"group1/M00/CB/50/yq0KA1UCgYKAbV32AAMxwpZW_YY238.png\"},\"elements\":null,\"scene\":null},{\"id\":33614559,\"sceneId\":1102,\"num\":129,\"name\":\"蕾娜斯\",\"properties\":{\"thumbSrc\":\"group1/M00/CA/CA/yq0KA1UCe7GAYTSoAAEVPxIPV5s073.png\"},\"elements\":null,\"scene\":null},{\"id\":32733405,\"sceneId\":1102,\"num\":36,\"name\":\"NORTH\",\"properties\":{\"thumbSrc\":\"group1/M00/B9/C4/yq0KA1UBCA6AZPbQAAIB2A3s2gg464.png\"},\"elements\":null,\"scene\":null},{\"id\":32023365,\"sceneId\":1102,\"num\":32,\"name\":\"loveluv\",\"properties\":{\"thumbSrc\":\"group1/M00/AB/C2/yq0KA1T_seCAUKa5AAOJIulj7Ms566.png\"},\"elements\":null,\"scene\":null},{\"id\":30060463,\"sceneId\":1102,\"num\":51,\"name\":\"hime\",\"properties\":{\"thumbSrc\":\"group1/M00/85/9D/yq0KA1T6r6mAEPw2AAHEKuUDhrM741.png\"},\"elements\":null,\"scene\":null},{\"id\":18334110,\"sceneId\":1102,\"num\":68,\"name\":\"羊年春联\",\"properties\":{\"thumbSrc\":\"group1/M00/AE/93/yq0KA1TcRvGAQjyOAASbFq55Xb0302.png\"},\"elements\":null,\"scene\":null},{\"id\":16974775,\"sceneId\":1102,\"num\":67,\"name\":\"年年有余\",\"properties\":{\"thumbSrc\":\"group1/M00/BA/8C/yq0KA1TdT8OAAhtjAAR1pmNMYrQ460.png\"},\"elements\":null,\"scene\":null},{\"id\":16551178,\"sceneId\":1102,\"num\":37,\"name\":\"视频\",\"properties\":{\"thumbSrc\":\"group1/M00/7F/A7/yq0KA1TYbDuAM6liAAJ31w0AL3s028.png\"},\"elements\":null,\"scene\":null},{\"id\":14311935,\"sceneId\":1102,\"num\":43,\"name\":\"黑红\",\"properties\":{\"thumbSrc\":\"group1/M00/45/C7/yq0KA1TTEQKAeUJ6AACgY8kqzmE496.png\"},\"elements\":null,\"scene\":null},{\"id\":13894315,\"sceneId\":1102,\"num\":40,\"name\":\"EQXIU\",\"properties\":{\"thumbSrc\":\"group1/M00/45/D5/yq0KA1TTEYuANix_AACQ4dOarJY887.png\"},\"elements\":null,\"scene\":null},{\"id\":13760542,\"sceneId\":1102,\"num\":42,\"name\":\"扁平摄影\",\"properties\":{\"thumbSrc\":\"group1/M00/36/2E/yq0KA1TRygGAPl6LAAB84tVJcMs071.png\"},\"elements\":null,\"scene\":null},{\"id\":13148781,\"sceneId\":1102,\"num\":40,\"name\":\"扁平化联系我们\",\"properties\":{\"thumbSrc\":\"group1/M00/26/CF/yq0KA1TQeTGACzKsAADCkd7GQ50238.png\"},\"elements\":null,\"scene\":null},{\"id\":13013290,\"sceneId\":1102,\"num\":40,\"name\":\"大学生自习曲\",\"properties\":{\"thumbSrc\":\"group1/M00/23/02/yq0KA1TQRMeAF74RAAD4WL_aj5g575.png\"},\"elements\":null,\"scene\":null},{\"id\":8370240,\"sceneId\":1102,\"num\":53,\"name\":\"长门有希\",\"properties\":{\"thumbSrc\":\"group1/M00/B2/55/yq0KA1TDmt-AZDpCAAJeQBQ7V-g574.png\"},\"elements\":null,\"scene\":null},{\"id\":8304263,\"sceneId\":1102,\"num\":52,\"name\":\"失月\",\"properties\":{\"thumbSrc\":\"group1/M00/B0/CF/yq0KA1TDZMKAO58gAAMnZ7Vys-g369.png\"},\"elements\":null,\"scene\":null},{\"id\":8298402,\"sceneId\":1102,\"num\":46,\"name\":\"白魔法阵\",\"properties\":{\"thumbSrc\":\"group1/M00/B0/D3/yq0KA1TDZTGAEiALAAOiXE9n3BA175.png\"},\"elements\":null,\"scene\":null},{\"id\":4032624,\"sceneId\":1102,\"num\":60,\"name\":\"NIKE\",\"properties\":{\"thumbSrc\":\"group1/M00/3F/5F/yq0KA1SuE-iAS6z9AAEEuyuAdWQ015.png\"},\"elements\":null,\"scene\":null},{\"id\":3981925,\"sceneId\":1102,\"num\":58,\"name\":\"水银灯\",\"properties\":{\"thumbSrc\":\"group1/M00/47/23/yq0KA1SvrXSAUHoGAALas7AL-5g559.png\"},\"elements\":null,\"scene\":null},{\"id\":3870227,\"sceneId\":1102,\"num\":57,\"name\":\"神烦狗\",\"properties\":{\"thumbSrc\":\"group1/M00/39/26/yq0KA1Ssrm6Ac3U6AADRvY6vgVo221.png\"},\"elements\":null,\"scene\":null},{\"id\":3849068,\"sceneId\":1102,\"num\":54,\"name\":\"白熊名片\",\"properties\":{\"thumbSrc\":\"group1/M00/38/44/yq0KA1Ssk3yAY5JAAAJdo3A9Kww399.png\"},\"elements\":null,\"scene\":null},{\"id\":2121872,\"sceneId\":1102,\"num\":65,\"name\":\"新年快乐I\",\"properties\":{\"thumbSrc\":\"group1/M00/36/9E/yq0KA1Sr2vuAa-D2AAFSsrqQlWI099.png\"},\"elements\":null,\"scene\":null},{\"id\":2018399,\"sceneId\":1102,\"num\":71,\"name\":\"致·索非亚\",\"properties\":{\"thumbSrc\":\"group1/M00/53/71/yq0KA1Szg3OANapnAAC_EvFcNoM814.png\"},\"elements\":null,\"scene\":null},{\"id\":1972996,\"sceneId\":1102,\"num\":72,\"name\":\"圣诞快乐II\",\"properties\":{\"thumbSrc\":\"group1/M00/36/A0/yq0KA1Sr22mAO9Q0AAJpX6b3xvY327.png\"},\"elements\":null,\"scene\":null},{\"id\":137449,\"sceneId\":1102,\"num\":95,\"name\":\"联系方式I\",\"properties\":{\"thumbSrc\":\"group1/M00/CB/68/yq0KA1UCgnCAdnQzAAI9WpaldyU158.png\"},\"elements\":null,\"scene\":null},{\"id\":136446,\"sceneId\":1102,\"num\":91,\"name\":\"蓝兰花\",\"properties\":{\"thumbSrc\":\"group1/M00/CB/5B/yq0KA1UCgfmAZwouAAJALTi2k3E731.png\"},\"elements\":null,\"scene\":null},{\"id\":133255,\"sceneId\":1102,\"num\":88,\"name\":\"神龟新闻\",\"properties\":{\"thumbSrc\":\"group1/M00/CB/7D/yq0KA1UCg0iAO5ZMAAHJRunzCn8053.png\"},\"elements\":null,\"scene\":null},{\"id\":133231,\"sceneId\":1102,\"num\":87,\"name\":\"星际穿越英文\",\"properties\":{\"thumbSrc\":\"group1/M00/CC/30/yq0KA1UCif6ATi-DAAF2l0_Xtjk378.png\"},\"elements\":null,\"scene\":null},{\"id\":132905,\"sceneId\":1102,\"num\":84,\"name\":\"泰戈尔虎\",\"properties\":{\"thumbSrc\":\"group1/M00/CB/92/yq0KA1UChAKAAraXAAP0A-_CnmI265.png\"},\"elements\":null,\"scene\":null},{\"id\":132875,\"sceneId\":1102,\"num\":83,\"name\":\"星际穿越\",\"properties\":{\"thumbSrc\":\"group1/M00/CB/88/yq0KA1UCg6mAQOauAAK9kkbyGTQ738.png\"},\"elements\":null,\"scene\":null},{\"id\":124814,\"sceneId\":1102,\"num\":121,\"name\":\"红色封闭\",\"properties\":{\"thumbSrc\":\"group1/M00/36/C8/yq0KA1Sr5E2ATLwgAADMgt-yZl4178.png\"},\"elements\":null,\"scene\":null},{\"id\":124309,\"sceneId\":1102,\"num\":120,\"name\":\"蓝色关门\",\"properties\":{\"thumbSrc\":\"group1/M00/36/C8/yq0KA1Sr5E2ALm28AADIOzyqUVE194.png\"},\"elements\":null,\"scene\":null},{\"id\":117231,\"sceneId\":1102,\"num\":122,\"name\":\"红黄蓝绿\",\"properties\":{\"thumbSrc\":\"group1/M00/36/C9/yq0KA1Sr5ICARtQVAACBGZ-7NDo635.png\"},\"elements\":null,\"scene\":null},{\"id\":106812,\"sceneId\":1102,\"num\":82,\"name\":\"关注我们\",\"properties\":{\"thumbSrc\":\"group1/M00/CB/98/yq0KA1UChEiAIt9dAAIqb0yez5c185.png\"},\"elements\":null,\"scene\":null},{\"id\":75375,\"sceneId\":1102,\"num\":116,\"name\":\"超人\",\"properties\":{\"thumbSrc\":\"group1/M00/36/C6/yq0KA1Sr4_qAJONMAASZX6Umv5U662.png\"},\"elements\":null,\"scene\":null},{\"id\":75367,\"sceneId\":1102,\"num\":115,\"name\":\"倚天屠龙记\",\"properties\":{\"thumbSrc\":\"group1/M00/36/C5/yq0KA1Sr48iAJX4mAAKmNdbB8zc125.png\"},\"elements\":null,\"scene\":null},{\"id\":75312,\"sceneId\":1102,\"num\":112,\"name\":\"红苹果\",\"properties\":{\"thumbSrc\":\"group1/M00/36/C5/yq0KA1Sr48KAWc96AAOH-sV0hEU091.png\"},\"elements\":null,\"scene\":null},{\"id\":75308,\"sceneId\":1102,\"num\":111,\"name\":\"世界杯\",\"properties\":{\"thumbSrc\":\"group1/M00/CC/E7/yq0KA1UCkGWAbDDeAAOWV9UHbN8549.png\"},\"elements\":null,\"scene\":null},{\"id\":75251,\"sceneId\":1102,\"num\":110,\"name\":\"速度艺术\",\"properties\":{\"thumbSrc\":\"group1/M00/CC/E0/yq0KA1UCkCuACpBDAAKBbMY84dc652.png\"},\"elements\":null,\"scene\":null},{\"id\":75201,\"sceneId\":1102,\"num\":107,\"name\":\"福特野马\",\"properties\":{\"thumbSrc\":\"group1/M00/36/C4/yq0KA1Sr45KAQLlnAAFsw-oU13Y979.png\"},\"elements\":null,\"scene\":null},{\"id\":75194,\"sceneId\":1102,\"num\":106,\"name\":\"SURFACE\",\"properties\":{\"thumbSrc\":\"group1/M00/36/C4/yq0KA1Sr45KAUEQYAAExsiW-yxk348.png\"},\"elements\":null,\"scene\":null},{\"id\":75191,\"sceneId\":1102,\"num\":105,\"name\":\"优胜美地\",\"properties\":{\"thumbSrc\":\"group1/M00/36/C3/yq0KA1Sr402ALWhOAAERPkwjWpU813.png\"},\"elements\":null,\"scene\":null},{\"id\":75188,\"sceneId\":1102,\"num\":104,\"name\":\"iPhone6\",\"properties\":{\"thumbSrc\":\"group1/M00/36/C3/yq0KA1Sr40yAbC6AAAM_D8XDFic750.png\"},\"elements\":null,\"scene\":null},{\"id\":75186,\"sceneId\":1102,\"num\":103,\"name\":\"丰田\",\"properties\":{\"thumbSrc\":\"group1/M00/CC/3F/yq0KA1UCioqAcnOgAAP8QbpD-wM971.png\"},\"elements\":null,\"scene\":null},{\"id\":75185,\"sceneId\":1102,\"num\":102,\"name\":\"iWATCH\",\"properties\":{\"thumbSrc\":\"group1/M00/CC/39/yq0KA1UCilCALNhAAADkHdcwucY018.png\"},\"elements\":null,\"scene\":null},{\"id\":75183,\"sceneId\":1102,\"num\":101,\"name\":\"英特尔\",\"properties\":{\"thumbSrc\":\"group1/M00/36/C3/yq0KA1Sr42qAA3kDAACBbo8dzx0820.png\"},\"elements\":null,\"scene\":null},{\"id\":1139,\"sceneId\":1104,\"num\":1,\"name\":\"小甜蜜\",\"properties\":{\"thumbSrc\":\"group2/M00/A0/08/yq0KEVWMw4qAfOFeAADoou96x7Q593.png\"},\"elements\":null,\"scene\":null}]}";
    }

    @ResponseBody
    @RequestMapping(value="/m/scene/design/{sid}", produces = "application/json;charset=UTF-8")
    public String sceneDesign(Long sid ){
        return "{\"success\":true,\"code\":200,\"msg\":\"操作成功\",\"obj\":{\"id\":149213007,\"sceneId\":10155513,\"num\":1,\"name\":null,\"properties\":null,\"elements\":[{\"css\":{\"zIndex\":\"1\"},\"id\":7777542300,\"num\":0,\"pageId\":112078745,\"properties\":{\"imgSrc\":\"group2/M00/E4/91/yq0KEVV6eHmAbE4fAABfXV7ch-o016.png\"},\"sceneId\":7636084,\"type\":3},{\"content\":\"\",\"css\":{\"top\":130,\"left\":120,\"zIndex\":\"2\",\"width\":80,\"height\":78,\"backgroundColor\":\"\",\"opacity\":1,\"color\":\"#676767\",\"borderWidth\":0,\"borderStyle\":\"solid\",\"borderColor\":\"rgba(0,0,0,1)\",\"paddingBottom\":0,\"paddingTop\":0,\"lineHeight\":1,\"borderRadius\":\"0px\",\"transform\":\"rotateZ(0deg)\",\"borderRadiusPerc\":0,\"borderBottomRightRadius\":\"0px\",\"borderBottomLeftRadius\":\"0px\",\"borderTopRightRadius\":\"0px\",\"borderTopLeftRadius\":\"0px\",\"boxShadow\":\"0px 0px 0px rgba(0,0,0,0.5)\",\"boxShadowDirection\":0,\"boxShadowSize\":0},\"id\":3531738765,\"num\":1,\"pageId\":112078745,\"properties\":{\"width\":\"100px\",\"height\":\"100px\",\"src\":\"group2/M00/E4/B9/yq0KEVV6eUCAEXInAAAVtaziFMk500.png\",\"imgStyle\":{\"width\":97,\"height\":78,\"marginTop\":\"0px\",\"marginLeft\":\"-8.5px\"},\"anim\":[{\"type\":12,\"direction\":0,\"duration\":2,\"delay\":0.2,\"countNum\":1}]},\"sceneId\":7636084,\"type\":4},{\"content\":\"\",\"css\":{\"top\":209,\"left\":107,\"zIndex\":\"3\",\"width\":107,\"height\":32},\"id\":6306437469,\"num\":1,\"pageId\":112078745,\"properties\":{\"width\":107,\"height\":32,\"src\":\"group2/M00/E4/BA/yq0KEVV6eUKANBTjAAAU18idMTo454.png\",\"imgStyle\":{\"width\":107,\"height\":32,\"marginTop\":\"0px\",\"marginLeft\":\"0px\"},\"anim\":[{\"type\":3,\"direction\":0,\"duration\":2.6,\"delay\":0.8,\"countNum\":1}]},\"sceneId\":7636084,\"type\":4},{\"content\":\"\",\"css\":{\"top\":373,\"left\":0,\"zIndex\":\"4\",\"width\":320,\"height\":31},\"id\":1220788484,\"num\":1,\"pageId\":112078745,\"properties\":{\"width\":320,\"height\":31,\"src\":\"group2/M00/E4/BA/yq0KEVV6eUSATEgqAAAfA-Nu-9E678.png\",\"imgStyle\":{\"width\":320,\"height\":40,\"marginTop\":\"-4.5px\",\"marginLeft\":\"0px\"},\"anim\":[{\"type\":1,\"direction\":3,\"duration\":2,\"delay\":1.4,\"countNum\":1}]},\"sceneId\":7636084,\"type\":4},{\"content\":\"\",\"css\":{\"top\":422,\"left\":0,\"zIndex\":\"5\",\"width\":320,\"height\":27},\"id\":3474365986,\"num\":1,\"pageId\":112078745,\"properties\":{\"width\":320,\"height\":27,\"src\":\"group2/M00/E4/BA/yq0KEVV6eUaAF5_KAAAigEKFp6Y676.png\",\"imgStyle\":{\"width\":320,\"height\":39,\"marginTop\":\"-6px\",\"marginLeft\":\"0px\"},\"anim\":[{\"type\":1,\"direction\":1,\"duration\":2,\"delay\":1.4,\"countNum\":1}]},\"sceneId\":7636084,\"type\":4},{\"content\":\"\",\"css\":{\"top\":31,\"left\":220,\"zIndex\":\"6\",\"width\":98,\"height\":65,\"backgroundColor\":\"\",\"opacity\":1,\"color\":\"#676767\",\"borderWidth\":0,\"borderStyle\":\"solid\",\"borderColor\":\"rgba(0,0,0,1)\",\"paddingBottom\":0,\"paddingTop\":0,\"lineHeight\":1,\"borderRadius\":\"0px\",\"transform\":\"rotateZ(0deg)\",\"borderRadiusPerc\":0,\"borderBottomRightRadius\":\"0px\",\"borderBottomLeftRadius\":\"0px\",\"borderTopRightRadius\":\"0px\",\"borderTopLeftRadius\":\"0px\",\"boxShadow\":\"0px 0px 0px rgba(0,0,0,0.5)\",\"boxShadowDirection\":0,\"boxShadowSize\":0},\"id\":5496215316,\"num\":1,\"pageId\":112078745,\"properties\":{\"width\":98,\"height\":65,\"src\":\"group2/M00/E4/CF/yq0KEVV6eamAd5A5AAAv5v2Y5ak404.png\",\"imgStyle\":{\"width\":98,\"height\":65,\"marginTop\":\"0px\",\"marginLeft\":\"0px\"},\"anim\":[{\"type\":1,\"direction\":2,\"duration\":2,\"delay\":1.2,\"countNum\":1}]},\"sceneId\":7636084,\"type\":4}],\"scene\":null},\"map\":null,\"list\":null}";
    }

}