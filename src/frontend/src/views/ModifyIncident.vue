<script setup>
import { ref } from "vue";
window.onload = function formDate(){
let today = new Date();

let day = today.getDate();
let month = today.getMonth() + 1;
let year = today.getFullYear();

day = ('0' + day).slice(-2);
month = ('0' + month).slice(-2);

let printDate = `${day}/${month}/${year}`

 document.getElementById("date").innerHTML = printDate;
}

let inputReset = ref("");
let inputReset2 = ref("");
let resetTextarea = ref("")

 function resetForm(){
inputReset.value = "";
inputReset2.value = "";
resetTextarea.value = "";
} 
</script>

<template>
  <main>

    <h2>Modify your incident</h2>
<form>
  <label for="date" id="date"></label>
  <div class="form-group">
    
    <input v-model="inputReset" type="text" class="form-control" id="formGroupExampleInput" placeholder="Enter your name" required>
  </div>
  <div class="form-group">
    
    <input v-model="inputReset2" type="text" class="form-control form-control-lg" id="formGroupExampleInput2" placeholder="Write a subject" required>
  </div>

  <div class="form-group">
    <textarea v-model="resetTextarea" class="form-control form-control-lg" id="formGroupExampleInput3" placeholder="Write your commentary" rows="3" required></textarea>

  </div>

  <div id="buttons-box">
    <button type="button" class="btn btn-danger" id="cancel">Cancel</button>
    <button type="button" class="btn btn-warning" id="reset">Reset</button>
    <button type="button" class="btn btn-success" id="send">Send</button>
  </div>

</form>
</main>
</template>

<style lang="scss">
@import '../sass/styles.scss';
main{
  margin-top: 5%;
  font-family: 'Space Mono', monospace;
  h2{
    margin-left: 5%;
    color:$color;
    font-weight: bold;
    font-size: 2.2rem;
    
  }
  form{
    margin: 3%;
    display: grid;
    #date{
      margin-left: 3%;
      width: 10vw;
    }
      .form-group{
        margin: 1% 3% 1% 3%;
      }
     #buttons-box{
      display: flex;
      justify-content: flex-end;
      margin-right: 2%;
        button{
          margin: 1%;
        }
     } 
  }
}

</style>