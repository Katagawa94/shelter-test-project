<template>
  <q-card class="q-pa-md q-my-md">
    <masonry-wall
      :items="paginatedMessages"
      :ssr-columns="2"
      :max-columns="2"
      :min-columns="2"
      :gap="gap"
    >
      <template #default="{ item }">
        <div class="pinboard-entry-cell">
          <PinboardEntry :message="item.message" :autor="item.autor" />
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
import PinboardEntry from './PinboardEntry.vue';
import { gap } from 'src/data/constants';
import { PinboardEntry as PinboardEnt } from 'src/data/mock/pinboardEntries';
import { usePagination } from 'src/composables/usePagination';

export interface PinboardEntriesListProps {
  messages: Array<PinboardEnt>;
}

const props = defineProps<PinboardEntriesListProps>();

const {
  currentPage,
  maxPages,
  paginatedItems: paginatedMessages,
  toPage,
} = usePagination(() => props.messages, 20);
</script>
<style lang="sass">
.pinboard-entry-cell
  display: flex
  justify-content: center
</style>
