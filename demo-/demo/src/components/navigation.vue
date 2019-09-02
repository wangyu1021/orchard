<template>
    <div class="navigation">
        <div class="content">
            <ul class="flex">
                <li @click="checkRouter(item)" v-for="(item,index) in routerList" :key='index'>
                    <a>{{item.routerName}} </a>
                </li>
            </ul>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            routerList: [{
                routerName: '网站首页',
                routerUrl: '/'
            },
            {
                routerName: '关于我们',
                routerUrl: '/about'
            },
            {
                routerName: '加入我们',
                routerUrl: '/joinUs'
            },
            {
                routerName: '产品中心',
                routerUrl: '/product'
            },
            {
                routerName: '新闻中心',
                routerUrl: '/news'
            },
            {
                routerName: '联系我们',
                routerUrl: '/relationUs'
            }]
        }
        
    },
        methods:{
        checkRouter(item){
            this.$router.push(item.routerUrl)
        }
    }
}
</script>

<style scoped>
.content li {
    width: 200px;
    height: 60px;
    line-height: 60px;
    text-align: center;
    cursor:pointer;
}
.content{
    margin: auto;
    width: 1200px;
}
.content ul li:hover{
    background-color: #089A47;
}
.navigation{
        background-color: #4CB050;
}
</style>
