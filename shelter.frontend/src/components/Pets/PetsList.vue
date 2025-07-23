<template>
  <q-card class="q-pa-md q-my-md">
    <masonry-wall
      :items="paginatedPets"
      :max-columns="2"
      :min-columns="2"
      :gap="gap"
    >
      <template #default="{ item }">
        <div class="pet-card-cell">
          <PetCard :pet="item" />
        </div>
      </template>
    </masonry-wall>
    <div class="q-pa-lg flex flex-center">
      <q-pagination
        v-model="currentPage"
        color="primary"
        :max="maxPages"
        :to-fn="toPage"
        boundary-links
      />
    </div>
  </q-card>
</template>

<script setup lang="ts">
import PetCard from 'src/components/Pets/PetCard.vue';
import { gap } from 'src/data/constants';
import { Pet } from 'src/data/mock/pets';
import { usePagination } from 'src/composables/usePagination';

export interface PetsListProps {
  pets: Array<Pet>;
}

const props = defineProps<PetsListProps>();

const {
  currentPage,
  maxPages,
  paginatedItems: paginatedPets,
  toPage,
} = usePagination(props.pets, 6);
</script>

<style lang="sass" scoped>

.pet-card-cell
  display: flex
  justify-content: center

</style>
