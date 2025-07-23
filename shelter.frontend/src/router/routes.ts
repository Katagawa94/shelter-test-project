import { RouteRecordRaw } from 'vue-router';

const routes: RouteRecordRaw[] = [
  {
    path: '/',
    component: () => import('layouts/DesktopLayout.vue'),
    children: [
      { path: '', component: () => import('src/pages/LandingPage.vue') },
      {
        path: 'contact',
        component: () => import('src/pages/ContactsPage.vue'),
      },
      {
        path: 'lostPets',
        component: () => import('src/pages/LostPetsPage.vue'),
      },
      {
        path: 'pinboard',
        component: () => import('src/pages/PinboardPage.vue'),
      },
    ],
  },

  // Always leave this as last one,
  // but you can also remove it
  {
    path: '/:catchAll(.*)*',
    component: () => import('src/pages/ErrorPage.vue'),
  },
];

export default routes;
