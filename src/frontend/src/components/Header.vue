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
  <header id="header">
    <h1 id="titleHeader">FACTORÍA F5</h1>
    <div id="twoButtonsHeader">
    <button type="buttonAllIncidents" id="buttonAll" class="btn btn-light btn-lg">All Incidents</button>
    <button type="buttonNewIncident" id="buttonNew" class="btn btn-light btn-lg">New Incident</button>
  </div>
  </header>
</template>
  
<style scoped>

#header{
    background: url(../assets/img/bckground.jpg);
    background-repeat: no-repeat;
    background-size: 100%;
    height: 25vh;

  
}
#titleHeader{
  font-weight: bold;
  color: white;
  font-size: 300%;
  text-align-last: right;
  margin-right: 7%;



}
#twoButtonsHeader{
  display: flex;
  justify-content: right;
  flex-direction: row;
  flex-wrap: wrap;



}
#buttonAll{
  border: 0.3vh;
  border-style: solid;
  border-color: orangered;
  font-size:x-large;
  font-weight: bold;
  color:blue;
  margin-right: 3%;

}
#buttonNew{
  border: 0.3vh;
  border-style: solid;
  border-color: orangered;
  font-size: x-large;
  font-weight: bold;
  color: orangered;
  margin-right: 3%;
}

</style>
