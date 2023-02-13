<script>
import axios from 'axios'

export default {
  data() {
    return {
      name: "vue"
    }
  },

  methods: {
    async mainCount() {
      const res = await axios.get("http://localhost:8090")
      console.log(res.data)
      this.name = res.data;
    }
  },
}


</script>

<template>
  <h1>main page</h1>
  <button @click="mainCount">{{name}}</button>
</template>