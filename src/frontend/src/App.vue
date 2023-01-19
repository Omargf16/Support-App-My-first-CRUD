<script setup>
import { RouterLink, RouterView } from 'vue-router'
import LandingPage from './views/LandingPage.vue';
import Header from './components/Header.vue';
import Footer from './components/Footer.vue';
</script>

<template>
<Header></Header>
<LandingPage/>
<Footer></Footer>
<ButtonsLanding/>
</template>

<style scoped>
</style>

