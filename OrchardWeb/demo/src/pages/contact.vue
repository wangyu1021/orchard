<template>
    <div class="enterprise flex">
        <div class="left-label">
            <div class="info_head ">在线留言</div>
            <div class="info_content">
                <div class="label_content">
                    <h1>
                        <a>
                            <span>服务流程</span>
                        </a>
                    </h1>
                    <h1>
                        <a>
                            <span>企业文化</span>
                        </a>
                    </h1>
                    <h1>
                        <a>
                            <span>联系我们</span>
                        </a>
                    </h1>
                    <h1>
                        <a>
                            <span>公司简介</span>
                        </a>
                    </h1>
                </div>
            </div>
            <connect-us/>
        </div>
        <div class="right-label">
            <div class="label_head">
                <div class="label_title">服务流程</div>
            </div>
            <div class="link_more">
                <ul id="udContent202">
                    <li>
                        <p>
                            <span style="font-size: 14px;">联系人：阮小姐 &nbsp; &nbsp; &nbsp;</span>
                        </p>
                        <p>
                            <span style="font-size: 14px;">手 &nbsp; 机：13662886797</span>
                        </p>
                        <p>
                            <span style="font-size: 14px;">联系人：阮小姐 &nbsp; &nbsp; &nbsp;</span>
                        </p>
                        <p>
                            <span style="font-size: 14px;">手 &nbsp; 机：13662886797</span>
                        </p>
                        <p>
                            <span style="font-size: 14px;">网 &nbsp; 址：http://www.tsbgyhzs.jqw.com/</span>
                        </p>
                        <p>
                            <span style="font-size: 14px;">地 &nbsp; 址：湖北咸宁通山县黄沙铺镇柏树村十一组</span>
                        </p>
                        <p>
                            <span style="font-size: 14px;"><img src="http://www.jcsuna.com/upload//fileupload/shopImage/20190330/15539413488531429578809(114x114).jpg" border="0" width="249" height="334" title="" alt="" style="width: 249px; height: 334px; padding: 0px; "></span>
                        </p>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</template>

<script>
import connectUs from '../components/connectUs'
export default {
    data() {
        return {

        };
    },
    components: {
        connectUs
    },
}
</script >
<style  scoped>
.left-label {
    width: 250px;
}

.enterprise {
    width: 1000px;
    margin: auto;
}

.label_content h1 {
    font-size: 12px;
    height: 25px;
    line-height: 25px;
    padding-left: 25px;
    background: url(../assets/img/article_arrow_1.jpg) no-repeat;
    background-position: 10px 10px;
}

.right-label {
    margin: 0 0 0 20px;
}

.link_more {
    text-align: left;
    line-height: 24px;
    width: 730px;
    letter-spacing: 2px;
    padding-left: 10px
}
</style>