<script setup>
import { RouterLink, RouterView } from 'vue-router'

</script>

<template>
  <div>
    <header>
      <div class="wrapper">
        <nav>
          <RouterLink to="/">Home</RouterLink>
          <div>------</div>
          <RouterLink to="/kakao">Kakao</RouterLink>
          <div>-----</div>
          <RouterLink to="/naver">Naver</RouterLink>
        </nav>
      </div>
    </header>
  </div>
  <body>
    <RouterView />  
  </body>
</template>