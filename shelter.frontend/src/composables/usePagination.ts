// src/composables/usePagination.ts
import { computed, MaybeRefOrGetter, toRef, watch } from 'vue';
import { useRoute } from 'vue-router';

export function usePagination<T>(
  items: MaybeRefOrGetter<Array<T>>,
  itemsPerPage: number = 6
) {
  const reactiveList = toRef(items);

  const route = useRoute();

  const routePage = computed(() => {
    const pageParam = parseInt(route.query.page as string, 10);
    return isNaN(pageParam) ? 1 : pageParam;
  });

  const maxPages = computed(() =>
    Math.ceil(reactiveList.value.length / itemsPerPage)
  );

  const currentPage = computed(() => {
    if (!routePage.value) {
      return 1;
    }
    if (routePage.value < 1) {
      return 1;
    }
    if (routePage.value > maxPages.value) {
      return maxPages.value;
    }
    return routePage.value;
  });

  const paginatedItems = computed(() => {
    const start = (currentPage.value - 1) * itemsPerPage;
    const end = currentPage.value * itemsPerPage;
    return reactiveList.value.slice(start, end);
  });

  const toPage = (page: number) => {
    return { query: { page } };
  };

  watch(items, () => {});

  return {
    currentPage,
    maxPages,
    paginatedItems: paginatedItems, // Expose as a ref for reactivity
    toPage,
  };
}
