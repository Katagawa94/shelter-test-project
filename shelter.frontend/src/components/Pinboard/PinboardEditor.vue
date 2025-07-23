<template>
  <div class="q-pa-md q-gutter-sm pinboard-editor-container">
    <q-card class="pinboard-editor-card" bordered>
      <q-editor
        bordered
        v-model="editor"
        placeholder="Ihre Nachricht an uns"
        class="q-pa-md pinboard-editor"
      />
      <q-card-section>
        <q-input
          maxlength="30"
          clearable
          v-model="autor"
          label="Ihr Name"
          dense
          class="q-mb-md pinboard-editor-autor"
        />
      </q-card-section>
    </q-card>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue';

let editor = ref('');
let autor = ref('');
</script>

<style lang="sass" scoped>
.pinboard-editor-card
  height: calc($card-height * 1.2)
  width: calc($card-width * 1.2)
  background-color: $background
.pinboard-editor
  height: 85%
  width: 100%
  background-color: $background
.pinboard-editor-autor
  width: 100%
.pinboard-editor-container
  width: 100%
  display: flex
  align-items: center
  justify-content: center
</style>
