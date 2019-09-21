// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import './assets/style/flex.css';
import './assets/style/common.css';
import axios from '../node_modules/axios'

Vue.use(ElementUI);
Vue.config.productionTip = false
Vue.prototype.$axios = axios;

new Vue({
    el: '#app',
    router,
    axios,
    components: { App },
    template: '<App/>'
})