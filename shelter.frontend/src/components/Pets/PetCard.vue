<template>
  <q-card class="pet-card" flat bordered>
    <q-card-section horizontal class="pet-card-section">
      <q-list style="padding: 8px 0px" class="col-7 pet-card-data">
        <q-scroll-area class="fit">
          <div class="row pet-card-selection-cell">
            <LabeledInformation icon="pets" title="Rasse">
              <div class="" v-html="pet.race" />
            </LabeledInformation>

            <q-separator v-if="pet.name" spaced vertical />

            <LabeledInformation v-if="pet.name" title="Name">
              <div v-html="pet.name" />
            </LabeledInformation>
          </div>

          <q-separator spaced />

          <div class="pet-card-selection-cell">
            <LabeledInformation title="Fundort" icon="place">
              <div v-html="pet.placeDiscovery" />
            </LabeledInformation>
          </div>

          <q-separator spaced />

          <div class="row pet-card-selection-cell">
            <LabeledInformation title="Funddatum" icon="calendar_month">
              <div v-html="pet.dateDiscovery" />
            </LabeledInformation>

            <q-separator spaced vertical />

            <LabeledInformation title="Im Tierheim seit">
              <div v-html="pet.dateShelter" />
            </LabeledInformation>
          </div>

          <q-separator spaced />
          <div class="pet-card-selection-cell">
            <LabeledInformation title="Besonderheiten" icon="description">
              <q-chip
                v-for="(feature, index) in pet.features"
                :key="index"
                size="md"
                square
                :label="feature"
              />
            </LabeledInformation>
          </div>
        </q-scroll-area>
      </q-list>
      <div class="col-5">
        <q-img
          draggable
          src="src/assets/example/karma.jpg"
          fit="cover"
          height="100%"
        />
      </div>
    </q-card-section>
  </q-card>
</template>

<script setup lang="ts">
import { Pet } from 'src/data/mock/pets';
import LabeledInformation from '../LabeledInformation.vue';

defineProps<PetCardProps>();

export interface PetCardProps {
  pet: Pet;
}
</script>

<style lang="sass" scoped>
.pet-card
  width: $card-width
  height: $card-height
  background-color: $background

.pet-card-section
  height: 100%
  overflow: auto

.pet-card-selection-cell
  width: 100%

.pet-card-section-halfcell
  width: 47%
</style>
