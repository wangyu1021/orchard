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
            <div class="product-detail">湖北通山葡萄园、湖北黄石葡萄园</div>
            <div class="prodct-day grey">更新时间：2019/8/16 14:54:28</div>
            <div class="prodct-content">
                <img src="http://img3.jqw.com/2017/01/17/1744317/product/b201908161454271880.jpg">
            </div>
            <div class="prodct-bot">
                <el-button type="primary" icon="el-icon-search">点击查价</el-button>
            </div>

            <div class="moreDetail">信息描述：
                <p></p>
                <p>孕妇能吃桑葚吗？医生：吃桑葚需要注意这3点！
                </p>
                <p>
                </p>
                <p>桑葚能降低血脂，防止血管硬化，适用于阴血不足、头晕目眩、盗汗及津伤口渴、消渴、肠燥便秘等症。桑葚具有免疫促进作用，可以防癌抗癌。
                </p>
                <p>
                </p>
                <p>常吃桑葚能显著提高人体免疫力，具有延缓衰老，美容养颜，乌发的功效。</p>
                <p><br></p>
                <p></p>
            </div>
            <div class="page-rl flex">
                <div class="page-l flex1">上一页</div>
                <div class="page-r flex1">下一页</div>
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
    methods: {

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
    width: 730px;
    border: 1px solid #ccc;
}

.product-detail {
    text-align: center;
    height: 51px;
    margin-top: 10px;
    font-size: 20px;
}

.prodct-day {
    text-align: center;
    font-size: 12px;
    height: 20px;
    line-height: 20px;
    border-top: 1px solid #CCCCCC;
}

.prodct-content {
    padding: 10px;
}

.prodct-bot .el-button {
    background-color: gray;
    padding: 8px 10px;
}

.moreDetail {
    font-weight: bold;
    padding: 4px 0 4px 8px;
    text-align: left;
}

.moreDetail p {
    border-top: 1px dashed;
    white-space: nowrap;
    text-overflow: ellipsis;
    overflow: hidden;
    margin-top: 10px;
    padding-top: 10px;
}
.page-l{
text-align: left;
}
.page-rl{
    padding: 10px 15px;
}
.page-r{text-align:left;
     }
</style>