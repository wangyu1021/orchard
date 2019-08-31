<template>
    <div>
        <div class="my-dynamic flex">
            <div class="left-box">
                <div class="info_head">企业简介</div>
                <div class="info_content">
                    <div class="label_content">
                        <h1>
                            <a>
                                <span>服务流程</span>
                            </a>
                        </h1>
                    </div>
                </div>
                <connect-us/>
            </div>
            <div class="right-box">
                <div class="label">
                    <div class="label_head " style="padding-left: 15px;font-weight:bold">产品中心</div>

                    <div class="link_more flex flex-hw">

                        
                        <div class="list-details">
                            <div><img src="../assets/img/1001.png"></div>
                            <div class="list-name">
                                <a href="javascript"></a>爱少女案发安利的爱少女案发安利的</div>
                        </div>

                    </div>
                    <el-pagination background layout="prev, pager, next" :total="1000">
                    </el-pagination>
                </div>
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
    mounted() {

    },
}
</script >
<style  scoped>
.my-dynamic {
    width: 1000px;
    margin: auto;
}

.left-box {
    width: 250px;
    font-size: 14px;
    text-align: left;
    line-height: 34px;
}

.label_content h1 {
    font-size: 12px;
    height: 25px;
    line-height: 25px;
    padding-left: 25px;
    background: url(../assets/img/article_arrow_1.jpg) no-repeat;
    background-position: 10px 10px;
}

.right-box {
    width: 730px;
    margin-left: 20px
}

.link_more {
    padding: 0 15px;
    line-height: 33px;
    text-align: left;
}

.list-details {
    border: 1px solid #58C102;
    width: 154px;
    margin: 10px;
    text-align: center;
    border-radius: 2px;
}

.list-details img {
    width: 152px;
}

.list-details .list-name {
    padding: 0 5px;
    font-size: 12px;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
}
</style>