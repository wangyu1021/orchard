<template>
    <div class="enterprise flex">
        <div class="left-label">
            <div class="info_head ">企业简介</div>
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
            <div class="link_more">&nbsp; &nbsp; &nbsp; &nbsp;通山百果园种养殖专业合作社位于通山县黄沙铺镇柏树村十一组,是一个集养殖、种植、科研、营销、服务于一体的科技型企业，致力于畜牧科技服务、现代化规模养殖种植、休闲农业观光等，是“湖北省农业龙头企业”、“湖北省无公害农产品认定企业”、“湖北省菜篮子基地”、“咸宁市现代产业100强重点培育项目单位”、“咸宁市农业科技创新中心”、“咸宁市通山民营企业50强单位”。公司为了实现可持续发展的战略目标，往旅游推进转型，利用农业景观资源和农业生产条件，发展观光、休闲、旅游的一种新型农业生产经营模式。开发具有观光、旅游价值的农业资源和农业产品为前提，把农业生产、科技应用、艺术加工和游客参加农事活动等融为一体，供游客领略在其它风景名胜地欣赏不到的大自然情趣。合理配置休闲旅游项目，发展休闲农业，把葡萄采摘、樱桃、大黄桃、白枇杷、桑果、塘边垂钓、绿道观光、游玩项目、特色饮食、休闲住宿、还有自由放养的走地鸡、鸭等结合起来，利用项目和区域优势，促进农业可持续发展。“放眼世界，百舸争流”，乘势而上，面向未来。 通山百果园人以凭借忠诚、热情、严谨的企业精神；坚持产品质量等于企业生命的质量体验；奉行产品质量可靠、服务周到的销售宗旨；坚持高起点规划，高标准设计，高质量生产，高水平服务的方针，以“发展生态与健康养殖”为理念，朝农业产业一体化企业迈进，做休闲旅游业璀璨明星的目标奋进。欢迎各界人士前来参观、采摘、收购， 微信号:rljo98098   联系人：阮小姐 联系电话：13662886797联系人：阮小姐 联系电话：13662886797</div>
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
    letter-spacing:2px;
}

</style>