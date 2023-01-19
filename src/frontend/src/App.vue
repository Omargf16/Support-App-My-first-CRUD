<script setup>
import { RouterLink, RouterView } from 'vue-router'
import LandingPage from './views/LandingPage.vue';
import Header from './components/Header.vue';
</script>

<template>
<Header></Header>
<LandingPage/>
<ButtonsLanding/>
</template>

<style scoped>
</style>

