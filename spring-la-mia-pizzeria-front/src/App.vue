<template>
  <div>
    <h1>Pizze</h1>
    <div>
      <div>
        <button>Create</button>
      </div>
      <ul>
        <li v-for="pizza in pizzas">
          <p> {{ pizza.name }} </p>
          <p> {{ pizza.description }}</p>
          <p> $ {{ pizza.price }}</p>
          <div class="buttons">
            <button>Edit</button>
            <button>Delete</button>
          </div>
        </li>
      </ul>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios';
const apiUrl = "http://localhost:8080/api/v1.0";
const pizzas = ref(null);
onMounted(
  axios.get(apiUrl)
    .then((response) => {
      pizzas.value = response.data;
    })
    .catch((error) => {
      console.error(error.message);
    })

)
</script>

<style lang="scss" scoped></style>