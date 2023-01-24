<script setup>
import {RouterLink} from "vue-router" 
</script>
<template>
  <header id="LandingPage">
    <h1 id="titleLanding">FACTORÍA F5</h1>
    <div id="twoButtons">
    <button type="buttonHome" id="button1" class="btn text-primary btn-light btn-lg button"><RouterLink to="/HomeView">All Incidents</RouterLink></button>
    <button type="buttonNew" id="button2" class="btn text-primary btn-light btn-lg button"><RouterLink to="/NewIncident">New Incident</RouterLink></button>
  </div>
  </header>
</template>
  
<style scoped>

#LandingPage{
  display: flex;
  flex-direction: column;
  background-image: url(../assets/img/bckground.jpg);
  background-attachment: fixed;
  background-size: 100% 100%;
  height: 100vh;

  
}
#titleLanding{
  font: weight 50em;
  color: white;
  font-size: 500%;
  align-self: center;
  margin-bottom: 50px;
  margin-top: 20vh;

}
#twoButtons{
  display: flex;
  flex-direction: column;
  margin-left: 38%;
  width: 25%;
  flex-wrap: wrap;

}

.button{
  border: 0.3vh;
  border-style: solid;
  border-color: orangered;
  padding:20px;
  margin-bottom: 75px;
  font-size:x-large;
  font-weight: bold;
  transition: all 0.4s;


}

.button:hover{
  color: orangered !important;
  background-color: white !important;
  letter-spacing: 1px;

}

</style>
