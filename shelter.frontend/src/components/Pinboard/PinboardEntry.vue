<template>
  <q-card flat bordered class="pinboard-entry-card">
    <q-item>
      <q-item-section>
        <div v-html="message" />
        <q-item-label caption>
          {{ autor }}
        </q-item-label>
      </q-item-section>
    </q-item>
  </q-card>
</template>

<script setup lang="ts">
defineProps({
  message: String,
  autor: String,
});

export interface PinboardEntryProps {
  message: string;
  autor: string;
}
</script>

<style lang="sass" scoped>
.pinboard-entry-card
   width: $card-width
   background-color: $background
</style>
