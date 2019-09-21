import Vue from 'vue'
import Router from 'vue-router'
import About from '../pages/about.vue'
import JoinUs from '../pages/joinUs.vue'
import News from '../pages/news.vue'
import Product from '../pages/product.vue'
import RelationUs from '../pages/relationUs.vue'
import Index from '../pages/index.vue'

Vue.use(Router)

export default new Router({
    routes: [{
            path: "/",
            name: "Index", //网站首页
            component: Index
        },
        {
            path: "/about", //关于我们
            name: "About",
            component: About
        },
        {
            path: "/joinUs", //加入我们
            name: "JoinUs",
            component: JoinUs
        },
        {
            path: "/news", //新闻中心
            name: "News",
            component: News
        },
        {
            path: "/product", //产品中心
            name: "Product",
            component: Product
        },
        {
            path: "/relationUs", //联系我们
            name: "RelationUs",
            component: RelationUs
        }
    ]
})