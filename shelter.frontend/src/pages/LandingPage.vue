<template>
  <q-page class="q-pa-md flex flex-center">
    <div class="column items-center" style="max-width: 800px; width: 100%">
      <!-- Upfront Disclaimer -->
      <q-banner class="bg-warning text-black q-mb-md">
        <strong>Disclaimer:</strong> This is not a real shelter. It’s a personal
        project created for learning purposes!
      </q-banner>

      <!-- Main About Us Content -->
      <q-card class="my-card">
        <q-card-section>
          <h2>About Us</h2>
          <p>
            Hey there! Welcome to our little corner of the web. Just so you
            know, this isn’t a real shelter – it's a project I built to sharpen
            my skills with Quasar and Vue.
          </p>
          <p>
            I’m on a journey to explore new techniques and improve my
            development skills, and this page is a fun experiment along the way.
            Every line of code here represents a step towards learning something
            new.
          </p>
          <p>
            The tech stack powering this page includes <strong>Vue</strong> and
            the amazing <strong>Quasar Framework</strong>. I'm having a blast
            experimenting with their components and building cool stuff.
          </p>
          <p>
            <em
              >Note: This page is still under construction – stay tuned for more
              updates as I continue to evolve this project!</em
            >
          </p>
        </q-card-section>
      </q-card>
    </div>
  </q-page>
</template>

<script setup lang="ts">
// This page is informational. No additional script logic is needed at the moment.
</script>

<style scoped>
.my-card {
  width: 100%;
  max-width: 600px;
}
</style>
