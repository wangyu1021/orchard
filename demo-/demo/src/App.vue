<template>
  <div id="app">
    <Head></Head>
    <Navigation></Navigation>
    <router-view/>
    <Foot></Foot>
  </div>
</template>

<script>
import Head from './components/head'
import Foot from './components/foot'
import Navigation from './components/navigation'
export default {
  name: 'App',
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
}

* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  list-style-type: none
}

</style>
