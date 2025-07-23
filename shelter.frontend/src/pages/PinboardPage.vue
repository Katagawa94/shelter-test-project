<template>
  <q-page class="column items-center justify-evenly">
    <PinboardSerachbar v-model:inputRef="inputRef" />
    <PinboardEntriesList :messages="filteredMessages" />
    <PinboardEditor />
  </q-page>
</template>

<script setup lang="ts">
import PinboardEditor from 'src/components/Pinboard/PinboardEditor.vue';
import PinboardEntriesList from 'src/components/Pinboard/PinboardEntriesList.vue';
import PinboardSerachbar from 'src/components/Pinboard/PinboardSerachbar.vue';
import { PinboardEntry, pinboardEntries } from 'src/data/mock/pinboardEntries';
import { computed, ref } from 'vue';

function filterMessages(messages: Array<PinboardEntry>, filter: string) {
  return messages.filter((entry) => {
    return entry.message.toLowerCase().includes(filter.toLowerCase());
  });
}

const filteredMessages = computed(() => {
  const filteredMsges = filterMessages(pinboardEntries, inputRef.value);
  console.log(filteredMsges);
  return filteredMsges;
});

const inputRef = ref('');
</script>

<style scoped></style>
