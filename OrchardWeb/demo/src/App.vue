<template>
  <div id="app">
    <Head></Head>
    <Navigation></Navigation>
    <img src="./assets/img/details.jpg" alt="" style="width: 1000px;height: 400px; margin: 7px 0;">
    <router-view/>
    <Foot></Foot>
    <div style="position:fixed; left:0; bottom:110px; background-color:#FFFFFF;">&nbsp;<img src="http://www.jcsuna.com/upload//fileupload/shopImage/20190330/1553941267206330338103(114x114).jpg" border="0" width="126" height="170" style="width: 126px; height: 170px;"></div>
  </div>
</template>

<script>
import Head from './components/head'
import Foot from './components/foot'
import Navigation from './components/navigation'
export default {
  name: 'App',
  data() {
    return {

    };
  },
  components: {
    Head,
    Foot,
    Navigation
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  font-size: 12px;
}

* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

a {
  text-decoration: none;
  color: #000;
}
ul li{
  list-style: none;
}
</style>
