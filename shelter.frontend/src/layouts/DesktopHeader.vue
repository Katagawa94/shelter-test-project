<template>
  <q-header bordered class="bg-primary text-white" height-hint="98">
    <q-toolbar class="row flex-center">
      <q-btn round color="accent" class="bordered">
        <q-avatar icon="pets" />
      </q-btn>
      <q-toolbar-title :shrink="true"> KATAGAWAS SHELTER </q-toolbar-title>
    </q-toolbar>
    <q-separator dark />
    <q-tabs align="left">
      <NavigationTabs />
    </q-tabs>
  </q-header>
</template>

<script setup lang="ts">
import NavigationTabs from './NavigationTabs.vue';
</script>
<style lang="sass" scoped>

.bordered
  border: 4px solid white
  margin: 4px 0px
</style>
