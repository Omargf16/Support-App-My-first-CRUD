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
    <button type="buttonHome" id="button1" class="btn btn-light btn-lg">Home</button>
    <button type="buttonNew" id="button2" class="btn btn-light btn-lg">New Incident</button>
  </div>
  </header>
</template>
  
<style scoped>

#LandingPage{
  display: flex;
  flex-direction: column;
  background-image: url(../assets/img/bckground.jpg);
  background-size:100%;
  height: 100%;
  
}
#titleLanding{
  font-weight: bolder;
  color: white;
  font-size: xx-large;
  align-self: center;
  margin-bottom: 50px;

}
#twoButtons{
  display: flex;
  flex-direction: row;
  justify-content: space-around;
}
#button1{
  border: 0.3vh;
  border-style: solid;
  border-color: blue;
  padding:20px;
}
#button2{
  border: 0.3vh;
  border-style: solid;
  border-color: blue;
  padding:20px;
}

</style>
