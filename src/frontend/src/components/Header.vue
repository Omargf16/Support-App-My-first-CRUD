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
    <button type="buttonAllIncidents" id="buttonAll" class="btn text-primary btn-light btn-lg  button">All Incidents</button>
    <button type="buttonNewIncident" id="buttonNew" class="btn text-primary btn-light btn-lg button">New Incident</button>
  </div>
  </header>
</template>
  
<style scoped>

#header{
    background: url(../assets/img/bckground.jpg);
    background-repeat: no-repeat;
    background-size: cover;
    height: 30vh;
  margin-bottom: 2vh;
}

#titleHeader{
  display: flex;
  flex-direction: column;
  align-self: space-around;
  font-weight: bold;
  color: white;
  font-size: 400%;
  text-align: end;
  text-align-last: right;
  margin-right: 15%;
  padding-top:3%;

}

#twoButtonsHeader{
  display: flex;
  justify-content: right;
  flex-direction: row;
  cursor: pointer;
}
 


.button{
  width: 300px;
  border: 0.3vh;
  border-style: solid;
  border-color: orangered;
  font-size:xx-large;
  font-weight: bold;
  margin-right: 5%;
  transition: all 0.4s;

}


  .button:hover{
  cursor: pointer;
  color: orangered;
  background-color: white;
  letter-spacing: 1px;
  }

  @media (max-width: 690px) {
    #twoButtonsHeader{
  flex-direction: column;
  align-items: center;
  margin:auto;
  gap: 25px;
}
#header{
    height: auto;
   
}

  }
  @media (max-width: 500px) {

    h1{
      font-size: 3rem !important;
    }
  }

</style>
