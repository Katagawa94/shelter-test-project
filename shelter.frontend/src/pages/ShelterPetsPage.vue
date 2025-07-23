<template>
  <q-page class="column items-center justify-evenly">
    <PetsFilter />
    <q-separator />
    <PetsList :pets="pets" :route-page="routePage" />
  </q-page>
</template>

<script setup lang="ts">
import PetsFilter from 'src/components/Pets/PetsFilter.vue';
import PetsList from 'src/components/Pets/PetsList.vue';

import { pets } from 'src/data/mock/pets';
import { computed } from 'vue';
import { useRoute } from 'vue-router';

const route = useRoute();

const routePage = computed(() => {
  const pageParam = parseInt(route.query.page as string, 10);
  return pageParam;
});
</script>

<style scoped></style>
