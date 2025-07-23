<template>
  <q-page class="column items-center justify-evenly q-pa-md">
    <Suspense>
      <template #default>
        <div>
          <PetsFilter />
          <q-separator />
          <PetsList :pets="pets" />
        </div>
      </template>
      <template #fallback>
        <div class="q-pa-md flex flex-center" style="height: 300px">
          <q-spinner-dots size="50px" color="primary" />
        </div>
      </template>
    </Suspense>
  </q-page>
</template>

<script setup lang="ts">
import { defineAsyncComponent } from 'vue';

// Load components asynchronously
const PetsFilter = defineAsyncComponent(
  () => import('src/components/Pets/PetsFilter.vue')
);
const PetsList = defineAsyncComponent(
  () => import('src/components/Pets/PetsList.vue')
);

import { pets } from 'src/data/mock/pets';
</script>

<style scoped>
/* Add any additional styling here if needed */
</style>
