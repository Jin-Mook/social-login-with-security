<script>
import axios from 'axios'

export default {
  data() {
    return {
      login: false
    }
  },

  methods: {
    async checkLogin() {
      const res = await axios.post("http://localhost:8090/check/kakao/login", {jwt: "jwt-token"})
      console.log(res.data)
      this.login = res.data;
    }
  },

  mounted() {
    this.checkLogin()
  }
}
</script>

<template>
  <h1>Kakao page</h1>
  <h2 v-if="login">kakao 로그인만 접근 가능</h2>
</template>