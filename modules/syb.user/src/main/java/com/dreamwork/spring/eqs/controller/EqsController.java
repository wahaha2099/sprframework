package com.dreamwork.spring.eqs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by apple on 15/9/13.
 */
@Controller
public class EqsController {

    @ResponseBody
    @RequestMapping(value="/eqs/login" , produces = "application/json;charset=UTF-8")
    public String login(String time ){

        return "{\"success\":true,\"code\":200,\"msg\":\"操作成功\",\"obj\":{\"id\":\"ff8080814e957955014ea3d41dc34d84\",\"loginName\":\"wahaha2099@yeah.net\",\"xd\":0,\"sex\":1,\"tel\":null,\"qq\":null,\"idNum\":null,\"idPhoto\":null,\"regTime\":1437267664000,\"extType\":0,\"property\":null,\"companyId\":null,\"extPermi\":null,\"memberType\":null,\"expiryTime\":null,\"joinTime\":null,\"deptName\":null,\"deptId\":0,\"name\":\"wahaha2099\",\"email\":\"wahaha2099@yeah.net\",\"type\":1,\"status\":0,\"relType\":null,\"companyTplId\":null,\"domain\":null,\"checkPhone\":0,\"checkEmail\":0,\"phone\":null,\"headImg\":null,\"roleIdList\":null},\"map\":null,\"list\":null}";
    }

    @ResponseBody
    @RequestMapping(value="/m/u/msgList" , produces = "application/json;charset=UTF-8")
    public String useMessageList(){
        //?pageNo=1&pageSize=4&unread=true&system=true
        return "{\"success\":true,\"code\":200,\"msg\":\"操作成功\",\"obj\":null,\"map\":{\"count\":15,\"pageNo\":1,\"pageSize\":4},\"list\":[{\"id\":16066064,\"type\":2,\"bizType\":1,\"toUser\":\"00000000000000000000000000000000\",\"toEmail\":null,\"fromUser\":\"4a2d8af948fd5bc40148fdbfc6640018\",\"sendTime\":1441872340000,\"title\":\"更新\",\"content\":\"必读:<a href='http://mp.weixin.qq.com/s?__biz=MzA3MTg3OTAzNA==&mid=208584238&idx=1&sn=97fdc9441b42d96563470dc76dbae8df#rd' target='_blank’>9月10日18-19点易企秀更新详情</a>\",\"status\":1,\"ext\":null,\"roleIdList\":null},{\"id\":16021535,\"type\":2,\"bizType\":1,\"toUser\":\"00000000000000000000000000000000\",\"toEmail\":null,\"fromUser\":\"4a2d8af948fd5bc40148fdbfc6640018\",\"sendTime\":1440656770000,\"title\":\"产品更新\",\"content\":\"必读:<a href='http://mp.weixin.qq.com/s?__biz=MzA3MTg3OTAzNA==&mid=208278825&idx=1&sn=4d316030dfa0cf35edd4adc1d6a286ea#rd' target='_blank’>8月27日18-19点易企秀更新</a>\",\"status\":1,\"ext\":null,\"roleIdList\":null},{\"id\":16008562,\"type\":2,\"bizType\":1,\"toUser\":\"00000000000000000000000000000000\",\"toEmail\":null,\"fromUser\":\"4a2d8af948fd5bc40148fdbfc6640018\",\"sendTime\":1440285529000,\"title\":\"更新公告\",\"content\":\"必读:<a href='http://x.eqxiu.com/s/qvhiH85n' target='_blank'>本周易企秀更新公告：8月21日</a>\",\"status\":1,\"ext\":null,\"roleIdList\":null},{\"id\":16004766,\"type\":2,\"bizType\":1,\"toUser\":\"00000000000000000000000000000000\",\"toEmail\":null,\"fromUser\":\"4a2d8af948fd5bc40148fdbfc6640018\",\"sendTime\":1440118631000,\"title\":\"更新预告\",\"content\":\"预告:<a href='http://mp.weixin.qq.com/s?__biz=MzA3MTg3OTAzNA==&mid=208139140&idx=1&sn=863d9b89abf2aca95409135358b61d0c#rd' target='_blank'>8月21日9-10点易企秀更新</a>\",\"status\":1,\"ext\":null,\"roleIdList\":null}]}";
    }

    @ResponseBody
    @RequestMapping(value="/eqs/banners" , produces = "application/json;charset=UTF-8")
    public String banners(){
        //pageCode=ad_001&time=1442136604312
        return "{\"success\":true,\"code\":200,\"msg\":\"操作成功\",\"obj\":null,\"map\":null,\"list\":[{\"id\":602,\"path\":\"http://res.eqxiu.com/group2/M00/0C/8A/yq0KXlXli-CAFkDEAAAy2NZGwU0132.png\",\"title\":\"免费升级企业账号，尊享更多专属权限\",\"url\":\"http://eqxiu.com/#/usercenter/privilege\",\"target\":\"_blank\",\"pageCode\":\"ad_001\",\"sort\":\"4\",\"status\":1},{\"id\":1202,\"path\":\"http://res.eqxiu.com/group3/M00/92/CD/yq0KZVXli72AN9YOAAAuF_hxNCs656.png\",\"title\":\"用秀点去易企秀尾页，点此购买\",\"url\":\"http://eqxiu.com/#/usercenter/xd\",\"target\":\"_blank\",\"pageCode\":\"ad_001\",\"sort\":\"3\",\"status\":1},{\"id\":1201,\"path\":\"http://res.eqxiu.com/group3/M00/92/CD/yq0KZFXli9qAHHy7AAAuse3kcdU978.png\",\"title\":\"万名秀客扶持计划\",\"url\":\"http://eqxiu.com/#/active\",\"target\":\"_blank\",\"pageCode\":\"ad_001\",\"sort\":\"1\",\"status\":1}]}";
    }


    @ResponseBody
    @RequestMapping(value="/eqs/promotion" , produces = "application/json;charset=UTF-8")
    public String promotion(){
        //pageCode=ad_001&time=1442136604312
        return "{\"success\":true,\"code\":200,\"msg\":\"操作成功\",\"obj\":null,\"map\":null,\"list\":[{\"id\":11854264,\"name\":\"会展人的100个死法\",\"code\":\"2lgjaqh7\",\"tags\":null,\"platforms\":null,\"type\":103,\"pageMode\":7,\"description\":\"你会选哪种？\",\"sourceId\":11481066,\"userName\":\"曲立研\",\"userLoginName\":null,\"createUser\":\"ff8080814f027937014f1b2d5dc51934\",\"createTime\":\"2015-08-11\",\"image\":{\"imgSrc\":\"group3/M00/8C/E1/yq0KZFXDMb6AZs5uAAEsE1anvaU899.jpg\"},\"cover\":\"group3/M00/8C/E1/yq0KZFXDMb6AZs5uAAEsE1anvaU899.jpg\",\"sort\":10,\"dataCount\":0,\"showCount\":11055,\"price\":0,\"avatar\":null},{\"id\":14650547,\"name\":\"老师，有封信。——零捌设计\",\"code\":\"OQc6yXP1\",\"tags\":null,\"platforms\":null,\"type\":104,\"pageMode\":0,\"description\":\"致我最尊敬的老师们。\",\"sourceId\":6354030,\"userName\":\"Finn啊疯\",\"userLoginName\":null,\"createUser\":\"4a2d8a1c4fab3265014fb5babc38282d\",\"createTime\":\"2015-09-10\",\"image\":{\"imgSrc\":\"group1/M00/6A/BF/yq0KXFXxKg-ANuqJAAGfCyJdZJc027.png\"},\"cover\":\"group1/M00/6A/BF/yq0KXFXxKg-ANuqJAAGfCyJdZJc027.png\",\"sort\":8,\"dataCount\":0,\"showCount\":1291,\"price\":0,\"avatar\":null},{\"id\":13771844,\"name\":\"等四六级是一种什么样的体验\",\"code\":\"kxZuhMNX\",\"tags\":null,\"platforms\":null,\"type\":101,\"pageMode\":0,\"description\":null,\"sourceId\":null,\"userName\":\"超越\",\"userLoginName\":null,\"createUser\":\"4a2d8aae4b14dcd7014b250f2bca39d7\",\"createTime\":\"2015-09-07\",\"image\":{\"imgSrc\":\"group2/M00/0B/D5/yq0KX1XlZ7-AHy2YAABEWO6q_JE375.png\"},\"cover\":\"group2/M00/0B/D5/yq0KX1XlZ7-AHy2YAABEWO6q_JE375.png\",\"sort\":8,\"dataCount\":2,\"showCount\":1689,\"price\":30,\"avatar\":null},{\"id\":11635872,\"name\":\"遇见\",\"code\":\"VuANopuX\",\"tags\":null,\"platforms\":null,\"type\":102,\"pageMode\":0,\"description\":\"奇迹总是在不经意间发生，就像我遇见你。\",\"sourceId\":null,\"userName\":\"赴望\",\"userLoginName\":null,\"createUser\":\"ff8080814ea99379014eaf32dacb0dad\",\"createTime\":\"2015-08-08\",\"image\":{\"imgSrc\":\"group3/M00/B3/41/yq0KZVXF3QKAWQD9AAAgKSr2raw680.jpg\"},\"cover\":\"group3/M00/B3/41/yq0KZVXF3QKAWQD9AAAgKSr2raw680.jpg\",\"sort\":6,\"dataCount\":0,\"showCount\":31774,\"price\":0,\"avatar\":null},{\"id\":14565,\"name\":\"【湖南壹基金温暖包】37℃温暖\",\"code\":\"dQ1Snn\",\"tags\":null,\"platforms\":null,\"type\":1,\"pageMode\":0,\"description\":\"37℃是最接近体温，最容易被满足，更是最恒久不变的情怀。\",\"sourceId\":null,\"userName\":\"543799553\",\"userLoginName\":null,\"createUser\":\"4a2d8aae49896cd00149987eb6be002e\",\"createTime\":\"2014-11-13\",\"image\":{\"bgAudio\":{\"url\":\"group1/M00/D8/E3/yq0KA1STkZOAN15GABFRNVkU0AQ772.mp3\",\"type\":\"2\"},\"imgSrc\":\"group1/M00/BA/61/yq0KA1RlZzaAdGwDAAJWjzSNP_Q494.jpg\",\"isAdvancedUser\":false},\"cover\":\"group1/M00/BA/61/yq0KA1RlZzaAdGwDAAJWjzSNP_Q494.jpg\",\"sort\":5,\"dataCount\":0,\"showCount\":3680,\"price\":0,\"avatar\":null},{\"id\":13310945,\"name\":\"老师，您辛苦了\",\"code\":\"GNkrNqWX\",\"tags\":null,\"platforms\":null,\"type\":104,\"pageMode\":0,\"description\":null,\"sourceId\":null,\"userName\":\"静静\",\"userLoginName\":null,\"createUser\":\"ff8080814e8a5708014e8a8756d200dd\",\"createTime\":\"2015-09-10\",\"image\":{\"imgSrc\":\"group3/M00/64/C9/yq0KZFXf7vCAVoOwAAF8BrXZP60838.PNG\"},\"cover\":\"group3/M00/64/C9/yq0KZFXf7vCAVoOwAAF8BrXZP60838.PNG\",\"sort\":0,\"dataCount\":0,\"showCount\":3763,\"price\":20,\"avatar\":null},{\"id\":13787851,\"name\":\"老师，我想对你说...\",\"code\":\"NyMs4pns\",\"tags\":null,\"platforms\":null,\"type\":104,\"pageMode\":0,\"description\":\"速来工作室--献给那些年指引我们成长的敬爱的老师们......\",\"sourceId\":6300494,\"userName\":\"罗速来\",\"userLoginName\":null,\"createUser\":\"4a2d8af949ad5ebc0149b3d6a3370064\",\"createTime\":\"2015-09-10\",\"image\":{\"imgSrc\":\"group3/M00/9C/6D/yq0KZVXm4CuAHGrTAAIECXl38Kc647.png\"},\"cover\":\"group3/M00/9C/6D/yq0KZVXm4CuAHGrTAAIECXl38Kc647.png\",\"sort\":0,\"dataCount\":197,\"showCount\":8779,\"price\":30,\"avatar\":null},{\"id\":13227459,\"name\":\"老师您辛苦了！\",\"code\":\"IPmrlJNJ\",\"tags\":null,\"platforms\":null,\"type\":104,\"pageMode\":0,\"description\":null,\"sourceId\":13012257,\"userName\":\"328182060\",\"userLoginName\":null,\"createUser\":\"ff8080814e43a1e9014e47a86ef009f0\",\"createTime\":\"2015-09-10\",\"image\":{\"imgSrc\":\"group3/M00/E7/35/yq0KZVXYS0KAblVwAABSIVWW6HE537.jpg\"},\"cover\":\"group3/M00/E7/35/yq0KZVXYS0KAblVwAABSIVWW6HE537.jpg\",\"sort\":0,\"dataCount\":0,\"showCount\":23032,\"price\":0,\"avatar\":null}]}";
    }

    @ResponseBody
    @RequestMapping(value="/eqs/friendlinks" , produces = "application/json;charset=UTF-8")
    public String friendlinks(){
        //pageCode=ad_001&time=1442136604312
        return "{\"success\":true,\"code\":200,\"msg\":\"操作成功\",\"list\":[{\"name\":\"腾讯\",\"url\":\"http://eqxiu.com/s/DRrVwR4r\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/1F/yq0KA1UmX_KAdFjbAAASblUbW10076.png\",\"pageCode\":\"home\"},{\"name\":\"阿里巴巴\",\"url\":\"http://eqxiu.com/s/kqKZ00\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/1E/yq0KA1UmX_KAHrbYAAAT8y97Ldk570.png\",\"pageCode\":\"home\"},{\"name\":\"汉庭\",\"url\":\"http://eqxiu.com/s/fFF0NP\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/1E/yq0KA1UmX_KAXJiDAAAS9RAywx8380.png\",\"pageCode\":\"home\"},{\"name\":\"智联招聘\",\"url\":\"http://eqxiu.com/s/6LaROx\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/1F/yq0KA1UmX_OAHgWaAAAdrgswaPE755.png\",\"pageCode\":\"home\"},{\"name\":\"携程\",\"url\":\"http://eqxiu.com/s/5opIzb\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/1F/yq0KA1UmX_OAZppjAAAT1aeMT-E250.png\",\"pageCode\":\"home\"},{\"name\":\"红星美凯龙\",\"url\":\"http://eqxiu.com/s/zkbsc6\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/2A/yq0KA1UmYL6AV6b1AAAV6E9y6y4819.png\",\"pageCode\":\"home\"},{\"name\":\"壹基金\",\"url\":\"http://eqxiu.com/s/IrUv4x\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/1F/yq0KA1UmX_OACDX3AAAZ99M4pLc791.png\",\"pageCode\":\"home\"},{\"name\":\"光明网\",\"url\":\"http://eqxiu.com/s/xLCe6c\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/1E/yq0KA1UmX_KAdCWCAAAWBKk0n0Q923.png\",\"pageCode\":\"home\"},{\"name\":\"中国平安\",\"url\":\"http://eqxiu.com/s/R9ykb6\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/1F/yq0KA1UmX_OAMiJwAAAUJ2KE59c428.png\",\"pageCode\":\"home\"},{\"name\":\"顺丰\",\"url\":\"http://eqxiu.com/s/ZfE6erwq\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/1F/yq0KA1UmX_KAah9EAAAZw2j_TDA008.png\",\"pageCode\":\"home\"},{\"name\":\"华为\",\"url\":\"http://eqxiu.com/s/Gx9GVn\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/1F/yq0KA1UmX_KADPwQAAAPg667Oto017.png\",\"pageCode\":\"home\"},{\"name\":\"网易\",\"url\":\"http://eqxiu.com/s/s9W386\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/1F/yq0KA1UmX_KAYKmtAAAV2AqvrTw033.png\",\"pageCode\":\"home\"},{\"name\":\"爱奇艺\",\"url\":\"http://eqxiu.com/s/lFSa2dFU\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/2A/yq0KA1UmYL6ANG4KAAAWLvl2ZHo209.png\",\"pageCode\":\"home\"},{\"name\":\"京东\",\"url\":\"http://eqxiu.com/s/Z6iBtm\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/1F/yq0KA1UmX_KAATvoAAAQ0FVZjjI032.png\",\"pageCode\":\"home\"},{\"name\":\"三联生活周刊\",\"url\":\"http://eqxiu.com/s/lWNKJP\",\"logo\":\"http://res.eqxiu.com/group1/M00/7A/1F/yq0KA1UmX_KAVFFbAAAYhJuVBJw731.png\",\"pageCode\":\"home\"}]}";
    }

    @ResponseBody
    @RequestMapping(value="/eqs/image/pc/banner" , produces = "application/json;charset=UTF-8")
    public String imgPcBanner(){
        return "http://res.eqxiu.com/group3/M00/56/EA/yq0KZVXe95yAXb5IAADi1PvCe3A670.png|http://eqxiu.com/#/show/active/48328,http://res.eqxiu.com/group2/M00/01/B0/yq0KXlXkArOAeQb0AAD9fC6a5Pw285.png| http://eqxiu.com/#/active,http://res.eqxiu.com/group3/M00/C0/6B/yq0KZFXuSAGAH6iPAAEeBrU1LTE960.png|http://bbs.eqxiu.com/forum.php?mod=viewthread&tid=77,http://as.eqxiu.com/assets/images/slide_03.png,http://as.eqxiu.com/assets/images/slide2_03.png,http://as.eqxiu.com/assets/images/slide3_03.png";
    }

}
