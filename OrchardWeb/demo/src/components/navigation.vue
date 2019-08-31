<template>
    <div class="navigation">
        <div class="content">
            <ul class="flex">
                <li>
                    <router-link to="/">网站首页 </router-link>
                </li>
                <li>
                    <router-link to="/introduction">企业简介 </router-link>
                </li>
                <li>
                    <router-link to="/dynamic" >企业动态 </router-link>
                </li>
                <li>
                    <router-link to="/product">产品中心 </router-link>
                </li>
                <li>
                    <router-link to="/information">供求信息 </router-link>
                </li>
                <li>
                    <router-link to="/onlineMessage">在线留言 </router-link>
                </li>
                <li>
                    <router-link to="/contact">联系我们 </router-link>
                </li>
            </ul>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {

        };
    },
    mounted() {
             
            // this.$axios.post('vddxha.natappfree.cc/Orchard/enterprise/findEnterpriseDynamic.do', {
            // })
            //     .then(function(res) {
            //         console.log(res)
            //     })
            //     .catch(function(err) {
            //         console.log(err)
            //    });
    },
}
</script >
<style  scoped>
.navigation {
    height: 45px;
    text-align: center;
    background: url('../assets/img/menubg.jpg') repeat-x left bottom;
}

.content {
    margin: auto;
    width: 1200px;
    height: 45px;
}

.content ul {
    list-style: none;
    margin-left: 100px;
}

.content ul li {
    display: inline;
    line-height: 45px;
    width: 120px;
}

.content ul li:hover {
    background: url(../assets/img/navabg.jpg) no-repeat left bottom;
}

.content ul li a {
    color: #fff;
    font-size: 14px;
}
</style>