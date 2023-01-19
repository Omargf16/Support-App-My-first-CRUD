<script setup>

const props = defineProps ({
 name:{
   type: String,
   required: true,
 },
 typeButton:{
   type: String,
   default: 'like',
 }
})
</script>
<template>
  <header id="LandingPage">
    <h1 id="titleLanding">FACTORÍA F5</h1>
    <div id="twoButtons">
    <button type="buttonHome" id="button1" class="btn btn-light btn-lg">All Incidents</button>
    <button type="buttonNew" id="button2" class="btn btn-light btn-lg">New Incident</button>
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
#button1{
  border: 0.3vh;
  border-style: solid;
  border-color: blue;
  padding:20px;
  margin-bottom: 75px;
  font-size:x-large;
  font-weight: bold;

}
#button2{
  border: 0.3vh;
  border-style: solid;
  border-color: blue;
  padding:20px;
  font-size: x-large;
  font-weight: bold;
}

</style>
