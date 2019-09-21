import Vue from "vue";
import Router from "vue-router";
const Index = resolve => require(["../pages/index.vue"], resolve);
const Contact = resolve => require(["../pages/contact.vue"], resolve);
const OnlineMessage = resolve => require(["../pages/onlineMessage.vue"], resolve);
const Information = resolve => require(["../pages/information.vue"], resolve);
const Product = resolve => require(["../pages/product.vue"], resolve);
const Dynamic = resolve => require(["../pages/dynamic.vue"], resolve);
const Introduction = resolve => require(["../pages/introduction.vue"], resolve);
const ProductDetail = resolve => require(["../pages/productDetail.vue"], resolve);
Vue.use(Router);

export default new Router({
    routes: [{
            path: "/",
            name: "Index", //网站首页
            component: Index
        },
        {
            path: "/introduction", //企业简介
            name: "Introduction",
            component: Introduction
        },
        {
            path: "/dynamic", //企业动态
            name: "Dynamic",
            component: Dynamic
        },
        {
            path: "/product", //产品中心
            name: "Product",
            component: Product
        },
        {
            path: "/information", //供求信息
            name: "Information",
            component: Information
        },
        {
            path: "/onlineMessage", //在线留言
            name: "OnlineMessage",
            component: OnlineMessage
        },
        {
            path: "/contact", //联系我们
            name: "Contact",
            component: Contact
        },
        {
            path: "/productDetail", //商品详情
            name: "ProductDetail",
            component: ProductDetail
        }
    ]
});