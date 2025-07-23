<template>
  <div class="q-px-sm q-mt-md searchbar-container">
    <q-input
      class="searchbar"
      dense
      clear
      outlined
      v-model="localInput"
      label="Suchbegriff"
      @update:model-value="onInputChange"
    >
      <template v-slot:append>
        <q-avatar icon="search" />
      </template>
    </q-input>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue';

export interface PinboardSerachbarProps {
  inputRef: string;
}

const props = defineProps<PinboardSerachbarProps>();
const emit = defineEmits(['update:inputRef']);

const localInput = ref<string>(props.inputRef);

const onInputChange = (newVal: string | number | null) => {
  emit('update:inputRef', newVal);
};
</script>

<style scoped lang="sass">
.searchbar-container
  display: flex

.searchbar
  width: $card-width
</style>
