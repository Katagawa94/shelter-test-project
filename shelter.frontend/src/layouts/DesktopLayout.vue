<template>
  <q-layout view="hhh lpr fff">
    <DesktopHeader />

    <q-scroll-area
      style="height: 100vh; max-width: 100vw"
      :bar-style="{ width: '0px' }"
    >
      <q-page-container class="page-content">
        <router-view />
      </q-page-container>
    </q-scroll-area>

    <DesktopFooter />
  </q-layout>
</template>

<script setup lang="ts">
import DesktopHeader from './DesktopHeader.vue';
import DesktopFooter from './DesktopFooter.vue';

defineOptions({
  name: 'DesktopLayout',
});
</script>
<style lang="sass">
.page-content
  max-width: 1200px
  margin: 0 auto
</style>
