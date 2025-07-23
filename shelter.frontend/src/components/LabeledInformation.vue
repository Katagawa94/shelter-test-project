<template>
  <q-item :dense="true">
    <q-item-section class="items-center justify-evenly" v-if="icon" avatar>
      <q-icon :name="icon" />
    </q-item-section>
    <q-item-section>
      <q-item-label>{{ title }}</q-item-label>
      <q-item-label caption>
        <slot />
      </q-item-label>
    </q-item-section>
  </q-item>
</template>

<script setup lang="ts">
defineOptions({
  name: 'LabeledInformation',
});

export interface LabeledInformationProps {
  title: string;
  icon?: string;
}

withDefaults(defineProps<LabeledInformationProps>(), {
  icon: '',
});
</script>

<style scoped></style>
