<script setup lang="ts">
import { ref } from 'vue'
import axios from 'axios'

const msg = ref('hello vue')
axios.create().get('http://localhost:8080/vue1').then(res=>{
  console.log(res);
  msg.value = res.data || '';
})

</script>

<template>
  <h1>{{ msg }}</h1>

  
</template>

<style scoped>
.read-the-docs {
  color: #888;
}
</style>
